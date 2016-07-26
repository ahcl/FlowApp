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
	
	/**
	 * 根据id删除活动
	 * @param id
	 */
	public void deleteActiveById(Integer id);
	
	/**
	 * 发布活动
	 * @param id
	 */
	public void updateFlagById(Integer id);
	
	/**
	 * 取消发布
	 * @param id
	 */
	public void delUpdateFlagById(Integer id);
	
	/**
	 * 显示最前面的四条活动的banner
	 */
	public List<Active> showFourth();
	
}
