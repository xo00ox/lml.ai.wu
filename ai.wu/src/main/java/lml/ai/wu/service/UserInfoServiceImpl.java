package lml.ai.wu.service;

import java.util.List;

import javax.jws.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lml.ai.wu.dao.UserInfoMapper;
import lml.ai.wu.entity.UserInfo;
import lml.ai.wu.entity.UserInfoExample;

@Service
@WebService
public class UserInfoServiceImpl implements UserInfoService {
	@Autowired
	private UserInfoMapper infoMapper;

	@Override
	public int countByExample(UserInfoExample example) {
		// TODO Auto-generated method stub
		return infoMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(UserInfoExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByPrimaryKey(String userId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(UserInfo record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(UserInfo record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<UserInfo> selectByExample(UserInfoExample example) {
		// TODO Auto-generated method stub	
		return infoMapper.selectByExample(example);
	}

	@Override
	public UserInfo selectByPrimaryKey(String userId) {
		// TODO Auto-generated method stub
		return infoMapper.selectByPrimaryKey(userId);
	}

	@Override
	public int updateByExampleSelective(UserInfo record, UserInfoExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByExample(UserInfo record, UserInfoExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKeySelective(UserInfo record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(UserInfo record) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
