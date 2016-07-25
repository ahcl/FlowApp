package com.hzbc.app.admin.cms.service;

import java.util.List;

import com.hzbc.app.admin.cms.entity.Active;

public interface ActiveService {
	/**
	 * ��ӻ
	 * @param active �ʵ��
	 */
	public void addActive(Active active);
	
	/**
	 * ͨ���id���һ
	 * @param adminId
	 * @return
	 */
	public List<Active> findActiveById(Integer id);
	
	/**
	 * ��ʾ���л���б�
	 * @return
	 */
	public List<Active> findActive();
	
}
