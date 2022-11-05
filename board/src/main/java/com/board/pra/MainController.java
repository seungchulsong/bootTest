package com.board.pra;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

	@RequestMapping("/main")
	@ResponseBody
	public String index() {
		System.out.println("인덱스입니다.");
		return "인텍스입니다.";
	}
	
	
}
