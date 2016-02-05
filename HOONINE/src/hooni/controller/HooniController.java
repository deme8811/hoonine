////https://github.com/deme8811/hoonine.git
//
//package hooni.controller;
//
//import java.util.ArrayList;
//
//import javax.servlet.http.HttpSession;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import hooni.goods.Goods;
//import hooni.goods.GoodsService;
//
//@Controller
//public class HooniController {
//	
//	@Autowired
//	private GoodsService svc;
//
//	
//	// ============ 1번째 CATEGORY ============
//	
//	@RequestMapping("/main.do")
//	public String main(HttpSession session, Model model) {
//		model.addAttribute("secondMenuName", "favor.jsp");
//		return "main";
//	}
//
//	@RequestMapping("/topMenu.do")
//	public String topMenu(HttpSession session, Model model) {
//		ArrayList<Goods> goodsList = svc.goodsList("top");
//		model.addAttribute("goodsList", goodsList);
//		model.addAttribute("secondMenuName", "topMenu.jsp");
//		return "main";
//	}
//
//	@RequestMapping("/pantsMenu.do")
//	public String pantsMenu(HttpSession session, Model model) {
//		ArrayList<Goods> goodsList = svc.goodsList("pants");
//		model.addAttribute("goodsList", goodsList);
//		model.addAttribute("secondMenuName", "pantsMenu.jsp");
//		return "main";
//	}
//	
//	@RequestMapping("/skirtMenu.do")
//	public String skirtMenu(HttpSession session, Model model) {
//		ArrayList<Goods> goodsList = svc.goodsList("skirt");
//		model.addAttribute("goodsList", goodsList);
//		model.addAttribute("secondMenuName", "skirtMenu.jsp");
//		return "main";
//	}
//	
//	@RequestMapping("/onepieceMenu.do")
//	public String onepieceMenu(HttpSession session, Model model){
//		ArrayList<Goods> goodsList = svc.goodsList("onepiece");
//		model.addAttribute("goodsList", goodsList);
//		model.addAttribute("secondMenuName", "onpieceMenu.jsp");
//		return "main";
//	}
//	
//	@RequestMapping("/outerMenu.do")
//	public String outerMenu(HttpSession session, Model model){
//		ArrayList<Goods> goodsList = svc.goodsList("outer");
//		model.addAttribute("goodsList", goodsList);
//		model.addAttribute("secondMenuName", "outerMenu.jsp");
//		return "main";
//	}
//	
//	@RequestMapping("/shoesMenu.do")
//	public String shoesMenu(HttpSession session, Model model){
//		ArrayList<Goods> goodsList = svc.goodsList("shoes");
//		model.addAttribute("goodsList", goodsList);
//		model.addAttribute("secondMenuName", "shoesMenu.jsp");
//		return "main";
//	}
//	
//	@RequestMapping("/bagMenu.do")
//	public String bagMenu(HttpSession session, Model model){
//		ArrayList<Goods> goodsList = svc.goodsList("bag");
//		model.addAttribute("goodsList", goodsList);
//		model.addAttribute("secondMenuName", "bagMenu.jsp");
//		return "main";
//	}
//	
//	@RequestMapping("/accMenu.do")
//	public String accMenu(HttpSession session, Model model){
//		ArrayList<Goods> goodsList = svc.goodsList("acc");
//		model.addAttribute("goodsList", goodsList);
//		model.addAttribute("secondMenuName", "accMenu.jsp");
//		return "main";
//	}
//	
//	@RequestMapping("/saleMenu.do")
//	public String saleMenu(HttpSession session, Model model){
//		ArrayList<Goods> goodsList = svc.goodsList("sale");
//		model.addAttribute("goodsList", goodsList);
//		model.addAttribute("secondMenuName", "saleMenu.jsp");
//		return "main";
//	}
//	
//	// ============ 2번째 CATEGORY ============
//	
//	@RequestMapping("/topInnerMenu.do")
//	public String topInnerMenu(HttpSession session, Model model){
//		ArrayList<Goods> goodsList = svc.c2GoodsList("topInner");
//		model.addAttribute("goodsList", goodsList);
//		session.setAttribute("MenuView", "topInnerMenu.jsp");
//		return "main";
//	}
//	
//	public String teeMenu(HttpSession session, Model model){
//		ArrayList<Goods> goodsList = svc.c2GoodsList("tee");
//		model.addAttribute("goodsList", goodsList);
//		session.setAttribute("MenuView", "topInnerMenu.jsp");
//		return "main";
//	}
//	
//	public String blouseMenu(HttpSession session, Model model){
//		ArrayList<Goods> goodsList = svc.c2GoodsList("blouse");
//		model.addAttribute("goodsList", goodsList);
//		session.setAttribute("MenuView", "topInnerMenu.jsp");
//		return "main";
//	}
//	
//	public String shirtMenu(HttpSession session, Model model){
//		ArrayList<Goods> goodsList = svc.c2GoodsList("shirt");
//		model.addAttribute("goodsList", goodsList);
//		session.setAttribute("MenuView", "topInnerMenu.jsp");
//		return "main";
//	}
//}
