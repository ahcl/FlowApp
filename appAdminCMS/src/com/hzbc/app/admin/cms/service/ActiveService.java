package com.hzbc.app.admin.cms.service;

import java.util.List;

import com.hzbc.app.admin.cms.entity.Active;

public interface ActiveService {
	/**
	 * 添加活动
	 * @param active 活动实体
	 */
	public void addActive(Active active);
	
	/**
	 * 通过活动id查找活动
	 * @param adminId
	 * @return
	 */
	public List<Active> findActiveById(Integer id);
	
	/**
	 * 显示所有活动的列表
	 * @return
	 */
	public List<Active> findActive();
	
}
