package lml.ai.wu.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/home")
public class HelloWordController {

	@RequestMapping("/index")
	public String retIndex()
	{
		return "HelloWord";
	}
	
	@RequestMapping("/test")
	@ResponseBody
	public List<String> getList(HttpServletRequest request)
	{
		List<String>list=new ArrayList<String>();
		list.add("福州");
		list.add("厦门");
		return list;
	}
}
