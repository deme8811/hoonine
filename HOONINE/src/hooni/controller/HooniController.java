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
}
