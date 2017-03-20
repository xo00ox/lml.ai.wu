package lml.ai.wu.service;

import java.util.List;

import javax.jws.WebService;

import org.apache.ibatis.annotations.Param;

import lml.ai.wu.entity.UserInfo;
import lml.ai.wu.entity.UserInfoExample;

@WebService
public interface UserInfoService {

	 	int countByExample(UserInfoExample example);

	    int deleteByExample(UserInfoExample example);

	    int deleteByPrimaryKey(String userId);

	    int insert(UserInfo record);

	    int insertSelective(UserInfo record);

	    List<UserInfo> selectByExample(UserInfoExample example);

	    UserInfo selectByPrimaryKey(String userId);

	    int updateByExampleSelective(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

	    int updateByExample(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

	    int updateByPrimaryKeySelective(UserInfo record);

	    int updateByPrimaryKey(UserInfo record);
	    
	    void test(List<String> list);
}
