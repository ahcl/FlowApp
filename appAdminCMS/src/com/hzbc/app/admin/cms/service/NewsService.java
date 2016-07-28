package com.hzbc.app.admin.cms.service;

import java.util.List;

import com.hzbc.app.admin.cms.entity.News;

public interface NewsService {

	/**
	 * 添加新闻
	 * @param news
	 */
	public void addNews(News news);
	
	/**
	 * 查找所有新闻 
	 * @return
	 */
	public List<News> findNews();

	/**
	 * 按照时间显示最新保存的新闻
	 * @return
	 */
	public List<News> findNewsByTime();
	
	/**
	 * 查找头条新闻
	 * @return
	 */
	public List<News> findNewsByTop();
}
