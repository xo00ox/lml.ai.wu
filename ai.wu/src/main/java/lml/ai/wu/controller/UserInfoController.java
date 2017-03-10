package lml.ai.wu.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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

	@RequestMapping("user")
	public String getUser(HttpServletRequest request, Model model) {
		int pageSize=10;
		UserInfoExample example = new UserInfoExample();
		String parameter = request.getParameter("currentPage");
		String search = request.getParameter("search");
		if(search!=null&&!"".equals(search))
		{
			Criteria createCriteria = example.createCriteria();
			createCriteria.andUserNameLike("%"+search+"%");
		}
		if (parameter != null && !"".equals(parameter)) {
			setCurrentPage(Integer.parseInt(parameter));
		}
		
		model.addAttribute("currentPage", currentPage);
		
		example.setOrderByClause("AGE desc");
		
		
		PageHelper.startPage(currentPage, pageSize);
		List<UserInfo> list = infoService.selectByExample(example);
		PageInfo<UserInfo> pageinfo = new PageInfo<>(list);
		System.err.println(pageinfo.getNavigatepageNums());
	
		model.addAttribute("pageinfo", pageinfo);
		return "NewFile";
	}
	
	


}
