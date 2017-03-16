package lml.ai.wu.service;

import java.util.List;

import javax.jws.WebService;
import javax.transaction.Transactional;

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
	@Transactional
	public int deleteByExample(UserInfoExample example) {
		// TODO Auto-generated method stub
		return infoMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(String userId) {
		// TODO Auto-generated method stub
		return infoMapper.deleteByPrimaryKey(userId);
	}

	@Override
	public int insert(UserInfo record) {
		// TODO Auto-generated method stub
		return infoMapper.insert(record);
	}

	@Override
	public int insertSelective(UserInfo record) {
		// TODO Auto-generated method stub
		return infoMapper.insertSelective(record);
	}

	@Override
	@Transactional
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
		return infoMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(UserInfo record, UserInfoExample example) {
		// TODO Auto-generated method stub
		return infoMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(UserInfo record) {
		// TODO Auto-generated method stub
		return infoMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(UserInfo record) {
		// TODO Auto-generated method stub
		return infoMapper.updateByPrimaryKey(record);
	}
	
	
}
