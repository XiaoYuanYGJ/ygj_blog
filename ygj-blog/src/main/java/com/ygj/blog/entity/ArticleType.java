package com.ygj.blog.entity;

import java.util.Date;

import lombok.Data;

/**
 * 
 * @author ygj
 * @date 2019年1月20日
 * Description:文章类型
 */
@Data
public class ArticleType {

	private int id;
	
	/**
	 * 父类型id（为0时表示为根节点）
	 */
	private int parentTypeId;
	
	/**
	 * 类型名称
	 */
	private String typeName;
	
	/**
	 * 类型描述
	 */
	private String typeDescription;
	
	/**
	 * 创建时间
	 */
	private Date createTime;
	
	/**
	 * 更新时间
	 */
	private Date updateTime;
	
}
