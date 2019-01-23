package com.ygj.blog.entity;

import java.util.Date;

import lombok.Data;

/**
 * 
 * @author ygj
 * @date 2019年1月20日
 * Description:用户
 */
@Data
public class User {

	private int id;
	/**
	 * 电话
	 */
	private String phone;
	
	/**
	 * 用户名
	 */
	private String userName;
	
	/**
	 * 密码
	 */
	private String password;
	
	/**
	 * 性别：1-男，2-女
	 */
	private char gender;
	
	/**
	 * 真是姓名
	 */
	private String trueName;
	
	/**
	 * 生日
	 */
	private Date birthday;
	
	/**
	 * 邮箱
	 */
	private String email;
	
	/**
	 * 个人简介
	 */
	private String personalBrief;
	
	/**
	 * 头像url
	 */
	private String avatarImgUrl;

	/**
	 * 创建时间
	 */
	private Date createTime;

	/**
	 * 最后登录时间
	 */
	private Date lastLoginTime;
	
	public User(){
		
	}

	public User(String phone, String userName, String password, char gender) {
		this.phone = phone;
		this.userName = userName;
		this.password = password;
		this.gender = gender;
	}
	
}
