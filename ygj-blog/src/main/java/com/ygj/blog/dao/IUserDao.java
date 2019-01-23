package com.ygj.blog.dao;

import java.util.ArrayList;
import java.util.Date;

import org.apache.ibatis.annotations.Param;

import com.ygj.blog.base.dao.IBaseDao;
import com.ygj.blog.entity.User;

/**
 * 
 * @author ygj
 * @date 2019年1月20日
 * Description:用户接口
 */
public interface IUserDao extends IBaseDao<User>{

	/**
	 * 根据用户名或电话查找用户
	 * @param userName
	 * @param phone
	 * @return
	 */
	User queryByUserNameOrPhone(@Param("userName")String userName,@Param("phone")String phone);
		
	
	int addUserByRegister(@Param("user")User user);
 	
	/**
	 * 更新最近登录时间
	 * @param userName
	 * @param lastTime
	 * @return
	 */
	int updateLastLoginTime(@Param("userName")String userName,@Param("lastTime")Date lastTime);
	
	
}
