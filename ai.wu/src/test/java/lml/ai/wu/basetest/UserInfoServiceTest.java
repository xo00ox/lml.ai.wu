package lml.ai.wu.basetest;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import lml.ai.wu.entity.UserInfo;
import lml.ai.wu.entity.UserInfoExample;
import lml.ai.wu.entity.UserInfoExample.Criteria;
import lml.ai.wu.service.UserInfoService;

public class UserInfoServiceTest extends SpringTestCase{
	
	@Autowired
	private UserInfoService infoService;
	
	@Test
	public void trans()
	{
		UserInfoExample example=new UserInfoExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andUserIdEqualTo("18AD43F62ED04022AE05B216CA76FA1D");
		infoService.deleteByExample(example);
		int i = 2/0;
		System.err.println(i);
		
		UserInfo userInfo = infoService.selectByPrimaryKey("2AB26AD5855F4DB690930D7DFA83E01F");
		System.err.println(userInfo.getAddress());
	}
}
