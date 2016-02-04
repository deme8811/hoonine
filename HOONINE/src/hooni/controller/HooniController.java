//https://github.com/deme8811/hoonine.git

package hooni.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HooniController {

	@RequestMapping("/main.do")
	public String main(HttpSession session) {
		session.setAttribute("secondMenuName", "favor.jsp");
		return "main";
	}

	@RequestMapping("/topMenu.do")
	public String topMenu(HttpSession session) {
		session.setAttribute("secondMenuName", "topMenu.jsp");
		return "main";
	}

	@RequestMapping("/pantsMenu.do")
	public String pantsMenu(HttpSession session) {
		session.setAttribute("secondMenuName", "pantsMenu.jsp");
		return "main";
	}
	
	@RequestMapping("/skirtMenu.do")
	public String skirtMenu(HttpSession session) {
		session.setAttribute("secondMenuName", "skirtMenu.jsp");
		return "main";
	}
	
	@RequestMapping("/onepieceMenu.do")
	public String onepieceMenu(HttpSession session){
		session.setAttribute("secondMenuName", "onpieceMenu.jsp");
		return "main";
	}
	
	@RequestMapping("/outMenu.do")
	public String outerMenu(HttpSession session){
		session.setAttribute("secondMenuName", "outerMenu.jsp");
		return "main";
	}
	
	@RequestMapping("/shoesMenu.do")
	public String shoesMenu(HttpSession session){
		session.setAttribute("secondMenuName", "shoesMenu.jsp");
		return "main";
	}
	
	@RequestMapping("/bagMenu.do")
	public String bagMenu(HttpSession session){
		session.setAttribute("secondMenuName", "bagMenu.jsp");
		return "main";
	}
	
	@RequestMapping("/accMenu.do")
	public String accMenu(HttpSession session){
		session.setAttribute("secondMenuName", "accMenu.jsp");
		return "main";
	}
	
	@RequestMapping("/saleMenu.do")
	public String saleMenu(HttpSession session){
		session.setAttribute("secondMenuName", "saleMenu.jsp");
		return "main";
	}
}
