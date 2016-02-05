//https://github.com/deme8811/hoonine.git

package hooni.user;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

	@Autowired
	private UserService svc;

	@RequestMapping("/userJoinForm.do")
	public String userJoinForm() {
		return "userJoinForm";
	}

	@RequestMapping("/userJoin.do")
	public String userJoin(User user, HttpSession session, Model model) {

		int msg = svc.userJoin(user);

		if (msg == 1) {
			return "redirect:/hooniJoin.do";
		} else {
			return "userJoinForm";
		}
	}

	@RequestMapping("/hooniJoin.do")
	public String hooniJoin() {
		return "hooniJoin";
	}

	@RequestMapping("/userLoginForm.do")
	public String userLoginForm() {
		return "userLoginForm";
	}

	@RequestMapping("/userDetail.do")
	public String userDetail(@RequestParam String userId, Model model) {
		User user = svc.userDetail(userId);
		userIdCheck(userId, model);
		model.addAttribute("userDetail", user);
		return "userDetail";
	}

	@RequestMapping("/userLogin.do")
	public String userLogin(@RequestParam String userId, @RequestParam String userPass, User user, HttpSession session,
			Model model) {
		User user2 = svc.userLogin(user);

		if (user2 == null) {
			String msg = "입력하신 Id나 Password가 맞지 않습니다";
			model.addAttribute("loginerror", msg);
			return "userLoginForm";
		}

		session.setAttribute("user", user);

		return "redirect:/main.do";
	}

	@RequestMapping("/userLogout.do")
	public String userLogout(HttpSession session) {
		session.removeAttribute("user");
		return "redirect:/main.do";
	}

	@RequestMapping("/userIdCheck2.do")
	public String userIdCheck2(){
		
		
		return "userIdCheck";
	}
	
	
	@RequestMapping("/userIdCheck.do")
	public String userIdCheck(@RequestParam String userId, Model model) {
		ArrayList<User> users = svc.userList();
		User user2 = svc.userDetail(userId);
		if (user2==null) {
			String msg = "사용 가능한 아이디 입니다";
			model.addAttribute("userIdCheck", msg);
			return "userJoinForm";
		}else{
			
		for (int i = 0; i < users.size(); i++) {
			if (user2.getUserId().equals(users.get(i).getUserId())) {
				String msg = "이미 등록된 아이디 입니다";
				model.addAttribute("userIdCheck", msg);
				return "userJoinForm";
			}
		}
			
		return "userJoinForm";
		
		}
		

		// if (users == user2) {
		// String msg = "사용 가능한 아이디 입니다";
		// model.addAttribute("userIdCheck", msg);
		// return "userJoinForm";
		// } else {
		// String msg = "이미 등록된 아이디 입니다";
		// model.addAttribute("userIdCheck", msg);
		// return "userJoinForm";
		// }
	}
}
