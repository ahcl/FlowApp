package com.hzbc.app.admin.cms.dao;

import java.util.List;

import com.hzbc.app.admin.cms.annotation.MyAnnotation;
import com.hzbc.app.admin.cms.entity.News;

@MyAnnotation
public interface NewsDao {
	public void addNews(News news);
	public List<News> findNews();
	public List<News> findNewsByTime();
	public List<News> findNewsByTop();
	public List<News> findNewsById(Integer id);
	public void updateNewsFlag();
	public List<News> findUpNewsByFlag();
	public void deleteNewsById(Integer id);
	public List<News> modifyNews(News news);
}
