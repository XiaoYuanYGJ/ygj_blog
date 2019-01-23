package com.ygj.blog.base.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * 
 * @author ygj
 * @date 2019年1月20日 Description:基本dao接口
 */
public interface IBaseDao<T> {

	/**
	 * 添加
	 * 
	 * @param t
	 * @return
	 */
	int add(T t);

	/**
	 * 修改
	 * 
	 * @param t
	 * @return
	 */
	int update(T t);

	/**
	 * 根据主键id删除
	 * 
	 * @param id
	 * @return
	 */
	int deleteById(@Param("id") int id);

	/**
	 * 查询所有
	 * 
	 * @return
	 */
	List<T> queryAll();

	/**
	 * 根据id查询
	 * 
	 * @param id
	 * @return
	 */
	T queryById(@Param("id") int id);

}
