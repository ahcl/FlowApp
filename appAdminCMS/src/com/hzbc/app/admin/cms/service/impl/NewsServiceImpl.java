package com.hzbc.app.admin.cms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hzbc.app.admin.cms.dao.NewsDao;
import com.hzbc.app.admin.cms.entity.News;
import com.hzbc.app.admin.cms.service.NewsService;

@Transactional
@Service("newsService")
public class NewsServiceImpl implements NewsService {

	@Autowired
	public NewsDao newsDao;
	@Override
	public void addNews(News news) {
		// TODO Auto-generated method stub
		newsDao.addNews(news);
	}
	@Override
	public List<News> findNews() {
		// TODO Auto-generated method stub
		return newsDao.findNews();
	}
	@Override
	public List<News> findNewsByTime() {
		// TODO Auto-generated method stub
		return newsDao.findNewsByTime();
	}

}
