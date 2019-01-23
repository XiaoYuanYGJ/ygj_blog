package com.ygj.blog.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ygj.blog.dao.IUserDao;
import com.ygj.blog.entity.User;
import com.ygj.blog.service.IUserService;
import com.ygj.blog.status.utils.UserStatus;
import com.ygj.blog.utils.Message;

/**
 * 
 * @author ygj
 * @date 2019年1月23日
 * @Description: 用户业务逻辑实现
 */
@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	private IUserDao userDao;
	
	public void updateLastLoginTime(String userName, Date lastTime) {
		// TODO Auto-generated method stub
		
	}

	public Message<UserStatus> findUserByUserNameOrPhone(String userNameOrPhone) {
		// TODO Auto-generated method stub
		return null;
	}

	public Message<UserStatus> addUserByRegister(User user) {
		
		Message<UserStatus> message = new Message<UserStatus>();
		
		if(){
			
		}
		
		
		return null;
	}

}
