package kh.spring.practice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("*.bd")
public class BoardController {
	@RequestMapping("/board.bd")
	public String board() {
		return "Board/Board";
	}
	
	@RequestMapping("/writeForm.bd")
	public String writeForm() {
		return "Board/writeForm";
	}
	
	@RequestMapping("write.bd")
	public String write() {
		
		return "Board/Board";
	}
}
