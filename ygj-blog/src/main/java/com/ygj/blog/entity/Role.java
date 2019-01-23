package com.ygj.blog.entity;

import lombok.Data;

/**
 * 
 * @author ygj
 * @date 2019年1月20日
 * Description:角色
 */
@Data
public class Role {

	private int id;
	
	/**
	 * 权限
	 */
	private String authority;
	
	/**
	 * 角色名称
	 */
	private String roleName;
	
	/**
	 * 角色代码
	 */
	private String roleCode;
	
}
