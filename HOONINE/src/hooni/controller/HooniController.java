//https://github.com/deme8811/hoonine.git

package hooni.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import hooni.goods.Goods;
import hooni.goods.GoodsService;

@Controller
public class HooniController {

	@Autowired
	private GoodsService svc;

	// ============ MAIN.DO ============

	@RequestMapping("/main.do")
	public String main(HttpSession session) {
		session.setAttribute("menuView", "firstPage.jsp");
		return "main";
	}

	// ============ 1번째 CATEGORY ============
	@RequestMapping("/firstCategory.do")
	public String topMenu(Model model, @RequestParam String gCategory) {
		ArrayList<Goods> goodsList = svc.goodsList(gCategory);
		model.addAttribute("goodsList", goodsList);
		model.addAttribute("gCategory2Name", "gCategory2/" + gCategory + "Menu.jsp");
		return "main";
	}

	// ============ 2번째 CATEGORY ============

	@RequestMapping("/secondCategory.do")
	public String topInnerMenu(HttpSession session, Model model, @RequestParam String gCategory2) {
		ArrayList<Goods> goodsList = svc.c2GoodsList(gCategory2);
		model.addAttribute("goodsList", goodsList);
		session.setAttribute("MenuView", "menuView.jsp");
		return "main";
	}

	//
}
