package com.hzbc.app.admin.cms.service;

import java.util.List;

import com.hzbc.app.admin.cms.entity.News;

public interface NewsService {

	/**
	 * �������
	 * @param news
	 */
	public void addNews(News news);
	
	/**
	 * ������������ 
	 * @return
	 */
	public List<News> findNews();

	/**
	 * ����id��������
	 * @param id
	 * @return
	 */
	public List<News> findNewsById(Integer id);
	
	/**
	 * ����ʱ����ʾ���±��������
	 * @return
	 */
	public List<News> findNewsByTime();
	
	/**
	 * ����ͷ������
	 * @return
	 */
	public List<News> findNewsByTop();
	
	/**
	 * ���ŷ���
	 */
	public void updateNewsFlag();
	
	/**
	 * ��ѯ�����Ѿ�����������
	 * @return
	 */
	public List<News> findUpNewsByFlag();
	
	/**
	 * ����ɾ������
	 * @param id ����id
	 */
	public void deleteNewsById(Integer id);

	/**
	 * �޸���������
	 * @param news
	 * @return
	 */
	public List<News> modifyNews(News news);
}
