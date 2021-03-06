//https://github.com/deme8811/hoonine.git

package hooni.goods;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class GoodsController {

	@Autowired
	private GoodsService svc;
	
	//============================================ GoodsList
	
	@RequestMapping("/goodsList.do")
	public String goodsList(String category) {
		

		
		return "goodsList";
		
	}
	
	@RequestMapping("/c2GoodsList.do")
	public String c2GoodsList(String category2) {
		
		
		
		return "goodsList";
		
	}
	

	//============================================ preimg
	
	public void preimg(Goods goods, HttpSession session) {
		
		String saveFolder = "/upload";
		
		ServletContext ctx = session.getServletContext();
		
		String realFolder = ctx.getRealPath(saveFolder);
		
		MultipartFile mf = goods.getImgFile();
		
		String filename = mf.getOriginalFilename();
		
		File uploadFile = new File(realFolder + File.separator + filename);
		
		try {
			mf.transferTo(uploadFile);
			
		} catch (IllegalStateException | IOException e) {
			e.printStackTrace();
		
		}
		goods.setGcUrl(filename);
		
	}
	
	//============================================ goodsInsertForm
	
	@RequestMapping("/goodsInsertForm.do")
	public String goodsInsertForm() {
		
		return "goodsInsertForm";
		
	}
	
	//============================================ goodsInsert
	
	@RequestMapping("/goodsInsert.do")
	public String goodsInsert(Goods goods, HttpSession session, Model model) {
		
		preimg(goods, session);
		
		int msg = svc.goodsInsert(goods);
		
		if (msg == 1) {
			return "redirect:/goodsList.do";
		
		} else {
			return "goodsInsertForm";
			
		}
		
	}
	
	
	//============================================ goodsDetail
	
	@RequestMapping("/goodsDetail.do")
	public String goodsDetail(@RequestParam String gId, Model model) {
		
		Goods goods = svc.goodsDetail(gId);
		model.addAttribute("goods", goods);
		
		return "goodsDetail";
		
	}
	
	//============================================ 
	
	@RequestMapping("/goodsUpdateForm.do")
	public String updateForm(@RequestParam String gId, Model model) {
		
		Goods goods = svc.goodsDetail(gId);
		
		model.addAttribute("goods", goods);
		
		return "goodsUpdateForm";
		
	}
	
	
	//============================================ 
	
	@RequestMapping("/goodsUpdate.do")
	public String goodsUpdate(Goods goods, HttpSession session) {
		
		preimg(goods, session);
		
		svc.goodsUpdate(goods);
		
		return "redirect:/goodsDetail.do?gId=" + goods.getgId();
		
	}
	
	//============================================ 
	
	@RequestMapping("/goodsDelete.do")
	public String goodsDelete(@RequestParam String gId) {
		
		svc.goodsDelete(gId);
		
		return "redirect:/goodsList.do";
		
	}
	
	//============================================ 
	
	
	
	
	//============================================ 
	
	
	
	
	//============================================ 
	
	
	
	
}
