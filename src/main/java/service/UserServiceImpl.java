package service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import dao.TUserMapper;
import domain.TUser;

@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private TUserMapper userDao;

	public TUser getUserById(int id) {
		return this.userDao.selectByPrimaryKey(id);
	}  
}