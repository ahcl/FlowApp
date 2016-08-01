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
	 * 根据id查找新闻
	 * @param id
	 * @return
	 */
	public List<News> findNewsById(Integer id);
	
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
	
	/**
	 * 新闻发布
	 */
	public void updateNewsFlag();
	
	/**
	 * 查询所有已经发布的新闻
	 * @return
	 */
	public List<News> findUpNewsByFlag();
	
	/**
	 * 根据删除新闻
	 * @param id 新闻id
	 */
	public void deleteNewsById(Integer id);

	/**
	 * 修改新闻内容
	 * @param news
	 * @return
	 */
	public List<News> modifyNews(News news);
}
