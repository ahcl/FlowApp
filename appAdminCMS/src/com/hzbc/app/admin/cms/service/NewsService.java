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
	 * ����ʱ����ʾ���±��������
	 * @return
	 */
	public List<News> findNewsByTime();
	
	/**
	 * ����ͷ������
	 * @return
	 */
	public List<News> findNewsByTop();
}
