package com.ygj.blog.service;

import java.util.Date;

import com.ygj.blog.entity.User;
import com.ygj.blog.status.utils.UserStatus;
import com.ygj.blog.utils.Message;

/**
 * 
 * @author ygj
 * @date 2019年1月22日
 * @Description: 用户业务逻辑
 */
public interface IUserService {

	/**
	 * 更新最后登录时间
	 * @param userName
	 * @param lastTime
	 */
	void updateLastLoginTime(String userName,Date lastTime);
	
	/**
	 * 根据电话或者用户名查找用户
	 * @param userNameOrPhone
	 * 电话或者用户名
	 * @return
	 */
	Message<UserStatus> findUserByUserNameOrPhone(String userNameOrPhone);

	 
	Message<UserStatus> addUserByRegister(User user);
 }
