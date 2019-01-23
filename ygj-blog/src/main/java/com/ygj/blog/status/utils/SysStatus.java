package com.ygj.blog.status.utils;

/**
 * 
 * @author ygj
 * @date 2019年1月21日
 * @Description:系统状态
 */
public enum SysStatus {

	SYS_ERROR("error", "10001", "系统发生内部错误。。。"), ERROR_404("page 404", "10002", "你找的页面不见了。。。。"), ERROR_500("page 500",
			"10003", "服务器发生内部错误。。。。");

	private String code;// 枚举代码

	private String sid;

	private String msg;// 信息

	private SysStatus(String code, String sid, String msg) {
		this.code = code;
		this.sid = sid;
		this.msg = msg;
	}

	public static SysStatus getBySid(String sid) {

		// 遍历枚举，获取单个对象
		for (SysStatus type : SysStatus.values()) {

			if (type.getSid().equals(sid)) {
				return type;
			}

		}

		return null;
	}

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
	}

}
