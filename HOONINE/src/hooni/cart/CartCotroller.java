//https://github.com/deme8811/hoonine.git

package hooni.cart;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mchange.v2.c3p0.stmt.GooGooStatementCache;

import hooni.goods.Goods;
import hooni.goods.GoodsService;
import hooni.user.UserService;

@Controller
public class CartCotroller {

	@Autowired
	private CartService csvc;
	private UserService usvc;
	private GoodsService gsvc;
	
	@RequestMapping("/cartList.do")
	public String carList(Model model){
		ArrayList<Cart> list = csvc.cartList();
		model.addAttribute("cartList", list);
		
		return "cartList";
	}
	
	@RequestMapping("/cart.do")
	public String cartInsert(HttpSession session, Model model){
		
		int totalMoney = csvc.cart(session);
		
		if (totalMoney == -1) {
			return "redirect:/cartList.do";
		}
		
		model.addAttribute("totalMoney", totalMoney);
		
		return "cartForm";
	}
	
	@RequestMapping("/addCart")
	public String addCart(@RequestParam String userId, @RequestParam int gId){
		
		Goods goods = gsvc.goodsDetail(gId);
		Cart cart = new Cart(userId, gId, goods.getgPrice(), goods.getgName(), 0, goods.getGsUrl());
		
		csvc.addCart();
		return "";
	}

}
