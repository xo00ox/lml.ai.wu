package lml.ai.wu.controller;

import java.util.Iterator;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import lml.ai.wu.entity.UserInfo;
import lml.ai.wu.entity.UserInfoExample;
import lml.ai.wu.entity.UserInfoExample.Criteria;
import lml.ai.wu.service.UserInfoService;

@Controller
@RequestMapping("/")
public class UserInfoController {
	@Autowired
	private UserInfoService infoService;

	/* private Logger logger = (Logger) LoggerFactory.getLogger(getClass()); */
	/**
	 * 页码
	 */
	protected int currentPage = 1;

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	@RequestMapping("getUserList")
	public String getUser(HttpServletRequest request, Model model) {
		int pageSize = 10;
		UserInfoExample example = new UserInfoExample();
		String parameter = request.getParameter("currentPage");
		String search = request.getParameter("search");
		if (search != null && !"".equals(search)) {
			Criteria createCriteria = example.createCriteria();
			createCriteria.andUserNameLike("%" + search + "%");
		}
		if (parameter != null && !"".equals(parameter)) {
			setCurrentPage(Integer.parseInt(parameter));
		}
		model.addAttribute("currentPage", currentPage);
		example.setOrderByClause("AGE desc");
		PageHelper.startPage(currentPage, pageSize);
		List<UserInfo> list = infoService.selectByExample(example);
		PageInfo<UserInfo> pageinfo = new PageInfo<>(list);
		model.addAttribute("pageinfo", pageinfo);
		return "usermanager/allUser";
	}
	@RequestMapping("/toAddUser")
	public String toAddUser(HttpServletRequest request)
	{
		return "usermanager/addUser";
	}
	
	
	@RequestMapping("/addUser")
	@ResponseBody
	public boolean addUser(UserInfo info, HttpServletRequest request)
	{
		boolean result=false;
		if(infoService.insertSelective(info)>0)
		{
			result=true;
		}
		return result;
	}
	
	
	@RequestMapping("/selectUser")
	public String selectUser(String userId,HttpServletRequest request,Model model)
	{
		UserInfo userInfo = infoService.selectByPrimaryKey(userId);
		model.addAttribute("user",userInfo);
		return "usermanager/updateUser";
	}
			
	
	@RequestMapping("/updateUser")
	@ResponseBody
	public boolean updateUser(UserInfo info, HttpServletRequest request,Model model)
	{
		boolean result=false;
		if(infoService.updateByPrimaryKeySelective(info)>0)
		{
			info = infoService.selectByPrimaryKey(info.getUserId());
			model.addAttribute("user",info);
			result=true;
		}
		return result;
	}
	
	
	@RequestMapping("/delUser")
	@ResponseBody
	public boolean delUser( String userId, HttpServletRequest request) {
		boolean result = false;
		if(userId!=null&&!"".equals(userId))
		{
			if (infoService.deleteByPrimaryKey(userId) > 0) {
				result = true;
			}
		}		
		return result;
	}

	@RequestMapping("/test")
	@ResponseBody
/*	public  Map<String, Object> ce(HttpServletRequest request) {
		
		UserInfo key = infoService.selectByPrimaryKey("2AB26AD5855F4DB690930D7DFA83E01F");
		Map<String, Object>map=new HashMap<String, Object>();
		
		map.put("key", key);
		System.err.println(key);
		return map;
	}*/
	public boolean t(@RequestParam("list[]") List<String> list,boolean b, HttpServletRequest request)
	{
		
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext())
		{
			System.err.println(iterator.next());
		}
		System.err.println(b);
		
	
		return true;
	}

}
