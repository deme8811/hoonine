//https://github.com/deme8811/hoonine.git

package hooni.goods;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class GoodsController {

	@Autowired
	private GoodsService svc;
	
	//============================================ GoodsList
	
	@RequestMapping("/goodsList.do")
	public String goodsList(Model model) {
		
		ArrayList<Goods> goodsList = svc.goodsList();
		
		model.addAttribute("goodsList", goodsList);
		
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
	
	//============================================ 
	
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
	
	
	//============================================ 
	
	
	
	
	//============================================ 
	
	
	
	
	//============================================ 
	
	
	
	
	//============================================ 
	
	
	
	
	//============================================ 
	
	
	
	
	//============================================ 
	
	
	
	
	//============================================ 
	
	
	
	
}
