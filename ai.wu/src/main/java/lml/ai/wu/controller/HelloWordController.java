package lml.ai.wu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HelloWordController {

	@RequestMapping("/index")
	public String retIndex()
	{
		return "HelloWord";
	}
}
