package com.ygj.blog.entity;

import java.util.Date;

import lombok.Data;

/**
 * 
 * @author ygj
 * @date 2019年1月20日
 * Description: 评论
 */
@Data
public class Comment {

	private int id;
	
	/**
	 * 父级评论id(0表示为最初评论者)
	 */
	private int parentCommentId;
	
	/**
	 * 文章id
	 */
	private int articleId;
	
	/**
	 * 评论者id
	 */
	private int answererId;
	 
	/**
	 * 评论内容
	 */
	private int commentContent;
	
	/**
	 * 评论点赞数
	 */
	private int likes;
	
	/**
	 * 评论时间
	 */
	private Date commentTime;
	
}
