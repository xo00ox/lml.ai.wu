package lml.ai.wu.service;

import java.util.List;

import javax.jws.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

	@Override
	@Transactional
	public void test(List<String> list) {
		for(int i=0;i<list.size();i++)
		{
			if(i<1)
			{
				infoMapper.deleteByPrimaryKey(list.get(i));
			}
			else
			{
				throw new RuntimeException();
			}
		}
	/*
			infoMapper.deleteByPrimaryKey("4D8A5B6275A949C4A9A4F279A8C2CC2C");
			String s = null;  
	        s.getBytes(); 
			infoMapper.deleteByPrimaryKey("A157BC085FFD498AA60EE6B4E0A907E8");
			System.err.println("AA");
*/
		

	}

}
