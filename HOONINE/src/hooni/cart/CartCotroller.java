//https://github.com/deme8811/hoonine.git

package hooni.cart;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	public String cartList(Model model, @RequestParam String userId) {
		ArrayList<Cart> cartList = csvc.cartList(userId);
		model.addAttribute("cartList", cartList);
		return "cartList";
	}

	@RequestMapping("/cart.do")
	public String cartInsert(HttpSession session, Model model) {

		int totalMoney = csvc.cart(session);

		if (totalMoney == -1) {
			return "redirect:/cartList.do";
		}

		model.addAttribute("totalMoney", totalMoney);

		return "cartForm";
	}

	@RequestMapping("/cartAddGoods.do")
	public String cartAddGoods(@RequestParam String userId, @RequestParam int gId) {
		Goods goods = gsvc.goodsDetail(gId);
		Cart cart = new Cart(userId, gId, goods.getgPrice(), goods.getgName(), 0, goods.getGsUrl());
		int msg = 0;
		msg = csvc.addCart(cart);
		if (msg != 0) {
			return "cartList";
		}
		return "main";
	}

	@RequestMapping("/cartDeleteGoods.do")
	public String cartDeleteGoods(@RequestParam String userId, @RequestParam int gId) {
		Goods goods = gsvc.goodsDetail(gId);
		Cart cart = new Cart(userId, gId, goods.getgPrice(), goods.getgName(), 0, goods.getGsUrl());
		csvc.deleteCart(cart);
		return "";
	}

	@RequestMapping("/cartDeleteGoodsByCheckbox")
	public String cartDeleteGoodsByCheckbox(@RequestParam String userId, @RequestParam int[] gIds) {

		for (int gId : gIds) {
			Goods goods = gsvc.goodsDetail(gId);
			Cart cart = new Cart(userId, gId, goods.getgPrice(), goods.getgName(), 0, goods.getGsUrl());
			csvc.deleteCart(cart);
		}
		return "";
	}

	@RequestMapping("/cartAddGoodsByCheckbox.do")
	public String cartAddGoodsByCheckbox(@RequestParam String userId, @RequestParam int[] gIds) {
		
		csvc.addCartByCheckbox(userId, gIds);

		
		return "";
	}
}
