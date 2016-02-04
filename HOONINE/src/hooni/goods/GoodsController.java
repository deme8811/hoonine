//https://github.com/deme8811/hoonine.git

package hooni.goods;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
	

	//============================================ 
	
	
	
	
	
	//============================================ 
	
	
	
	
	//============================================ 
	
	
	
	
	//============================================ 
	
	
	
	
	//============================================ 
	
	
	
	
	//============================================ 
	
	
	
	
	//============================================ 
	
	
	
	
	//============================================ 
	
	
	
	
	//============================================ 
	
	
	
	
}
