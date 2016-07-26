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
	
	/**
	 * ����idɾ���
	 * @param id
	 */
	public void deleteActiveById(Integer id);
	
	/**
	 * �����
	 * @param id
	 */
	public void updateFlagById(Integer id);
	
	/**
	 * ȡ������
	 * @param id
	 */
	public void delUpdateFlagById(Integer id);
	
	/**
	 * ��ʾ��ǰ����������banner
	 */
	public List<Active> showFourth();
	
}
