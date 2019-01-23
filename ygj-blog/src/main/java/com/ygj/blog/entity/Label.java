package com.ygj.blog.entity;

import lombok.Data;

/**
 * 
 * @author ygj
 * @date 2019年1月20日
 * Description: 标签
 */
@Data
public class Label {

	private int id;
	
	/**
	 * 标签名称
	 */
	private String labelName;
	
	/**
	 * 标签别名
	 */
	private String labelAlias;
	
	/**
	 * 描述
	 */
	private String labelDescription;
	
}
