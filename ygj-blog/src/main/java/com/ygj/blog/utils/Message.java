package com.ygj.blog.utils;

import com.ygj.blog.status.utils.SysStatus;

import lombok.Data;

/**
 * @author ygj
 * @date 2019年1月21日 Description:信息类
 */
public class Message<E> {

	private E e;

	/**
	 * 返回的数据
	 */
	private Object obj;

	/**
	 * 分页代码
	 */
	private String pageStr;

	/*
	 * 生成id
	 */
	private int generateId;

	
	
	public E getE() {
		return e;
	}



	public void setE(E e) {
		this.e = e;
	}



	public Object getObj() {
		return obj;
	}



	public void setObj(Object obj) {
		this.obj = obj;
	}



	public String getPageStr() {
		return pageStr;
	}



	public void setPageStr(String pageStr) {
		this.pageStr = pageStr;
	}



	public int getGenerateId() {
		return generateId;
	}



	public void setGenerateId(int generateId) {
		this.generateId = generateId;
	}



	public static void main(String[] args) {
  		
		/**
		 * 测试使用
		 */
		Message<SysStatus> mesage = new Message();

		mesage.setE(SysStatus.ERROR_404);
		
 		System.out.println(mesage.getE().getMsg());
	}

}
