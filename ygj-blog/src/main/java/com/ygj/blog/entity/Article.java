package com.ygj.blog.entity;

import java.util.Date;

import lombok.Data;

/**
 * 
 * @author ygj
 * @date 2019年1月20日 Description:文章
 */
@Data
public class Article {

	private int id;

	/**
	 * 文章id
	 */
	private int articleId;

	/**
	 * 类型id
	 */
	private int typeId;

	/**
	 * 用户id
	 */
	private int userId;

	/**
	 * 文章原作者
	 */
	private String originalAuthor;

	/**
	 * 文章标题
	 */
	private String articleTitle;

	/**
	 * 文章摘要
	 */
	private String articleDescription;

	/**
	 * 文章内容
	 */
	private String articleContent;

	/**
	 * 文章url地址
	 */
	private String articleUrl;

	/**
	 * 是否原创（1-原创，-1-转载）
	 */
	private char isOrigial;
	
	/**
	 * 浏览量
	 */
	private int articleViews;
	
	/**
	 * 评论总数
	 */
	private int articleCommentCount;

	/**
	 * 点赞数
	 */
	private int articleLikeCount;
	
	/**
	 * 发表时间
	 */
	private Date createTime;

	/**
	 * 更新时间
	 */
	private Date updateTime;
}
