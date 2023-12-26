package com.hq.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hq.dao.IUserDao;
import com.hq.pojo.User;
import com.hq.service.IUserService;

//@Service("userService")
@Service
public class UserServiceImpl implements IUserService {
	@Resource
	private IUserDao userDao;
	
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return this.userDao.selectByPrimaryKey(userId);
	}

}
