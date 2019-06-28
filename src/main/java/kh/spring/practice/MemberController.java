package kh.spring.practice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kh.spring.dao.MemberService;
import kh.spring.dto.MemberDTO;

@Controller
public class MemberController {

	@Autowired
	private HttpSession session;

	@Autowired
	private MemberService ms;

	@RequestMapping("/")
	public String index() {
		return "Member/home";
	}

	@RequestMapping("/loginForm")
	public String toLoginForm(String pw, String id) {
		MemberDTO result = ms.login(id, pw);
		if(result != null) {
			session.setAttribute("id", id);
		}
		return "Member/home";
	}

	@RequestMapping("/signForm")
	public String toSignForm() {
		return "Member/signForm";
	}

	@RequestMapping("/signProc")
	public String toSignFroc(MemberDTO dto) {	
		try {
			ms.insert(dto);
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return "Member/home";
	}

	@ResponseBody
	@RequestMapping(value="/ajax.mb", produces="application/text; charset=utf8")
	public String ajaxProc(String id) {
		int result = ms.duplProc(id);
		if(result > 0) {
			return "이미 존재하는 아이디입니다.";
		}
		return "사용할 수 있는 아이디입니다.";
	}

	@RequestMapping("/myPageForm")
	public String myPageForm(HttpServletRequest request) {
		String id = (String)session.getAttribute("id");
		MemberDTO dto = ms.myPage(id);
		request.setAttribute("dto", dto);
		return "Member/myPageForm";
	}
	
	@RequestMapping("/logOut")
	public String logOut() {
		session.invalidate();
		return "Member/home";
	}
}
