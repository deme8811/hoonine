package hooni.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HooniController {

	@RequestMapping("/main.do")
	public String main(HttpSession session) {
		session.setAttribute("pageName", "favor.jsp");
		return "main";
	}

	@RequestMapping("/topMenu.do")
	public String topMenu(HttpSession session) {
		session.setAttribute("pageName", "topMenu.jsp");
		return "main";
	}

	@RequestMapping("/pantsMenu.do")
	public String pantsMenu(HttpSession session) {
		session.setAttribute("pageName", "pantsMenu.jsp");
		return "main";
	}
}
