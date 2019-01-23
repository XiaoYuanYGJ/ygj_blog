package com.ygj.blog.entity;

import lombok.Data;

/**
 * 
 * @author ygj
 * @date 2019年1月20日
 * Description:模块
 */
@Data
public class MenuItem {

	private int id;
	
	/**
	 * 模块名称
	 */
	private String menuName;
	
	/**
	 * 模块代码url地址
	 */
	private String menuCodeUrl;
	
	/**
	 * 模块图标
	 */
	private String menuIcon;
	
	/**
	 * 父级模块id（-1表示父级） 
	 */
	private int parentMenuId;
	
}
