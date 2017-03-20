package lml.ai.wu.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lml.ai.wu.service.UserInfoService;

@Controller
@RequestMapping("/home")
public class HelloWordController {

	@Autowired 
	private UserInfoService infoService;
	@RequestMapping("/index")
	public String retIndex()
	{
		return "HelloWord";
	}
	
	@RequestMapping("/test")
	@ResponseBody
	public List<String> getList(HttpServletRequest request)
	{
		List<String> list1=new ArrayList<>();
		list1.add("E3B948EEC5FA498FACD66110183C4640");
		list1.add("4D8A5B6275A949C4A9A4F279A8C2CC2C");
		infoService.test(list1);
		List<String>list=new ArrayList<String>();
		list.add("福州");
		list.add("厦门");
		return list;
	}
}
