package com.ygj.blog.status.utils;

/**
 * 
 * @author ygj
 * @date 2019年1月23日
 * @Description: 用户业务状态
 */
public enum UserStatus {

	USER_EXIST("user already exists","20001","用户已存在"),USER_PARAM_NULL("user parameter is null","20002"),USER_NAME_NULL("user name is null","20002","用户名不能为空");
	
	private UserStatus(String code, String sid, String msg) {
		this.code = code;
		this.sid = sid;
		this.msg = msg;
	}

	private String code;// 枚举代码

	private String sid;

	private String msg;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}// 信息
	
	
	
}
