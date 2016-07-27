package com.hzbc.app.admin.cms.controller;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.hzbc.app.admin.cms.entity.Active;
import com.hzbc.app.admin.cms.entity.News;
import com.hzbc.app.admin.cms.service.NewsService;
import com.hzbc.app.admin.cms.util.CommonUtil;

@Controller
@RequestMapping("/news")
public class NewsController {

	@Autowired
	public NewsService newsService;
	
	@RequestMapping("add")
	public String addNews(News news, @RequestParam MultipartFile[] myfiles, HttpServletRequest request){
		CommonUtil commonUtil = new CommonUtil();
		News n1 = new News();
		//获取当前时间
		Date date= new Date(System.currentTimeMillis());
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//调用图片上传工具
		List<String> pathImg= commonUtil.uploadImg(myfiles, request);
		//System.out.println(pathImg.get(0));
		//存入数据库
		n1.setNewsName(news.getNewsName());
		n1.setNewsContent(news.getNewsContent());
		n1.setNewsUpDate(dateFormat.format(date));
		n1.setNewsImg(pathImg.get(0));
		n1.setAdminId(1);
		newsService.addNews(n1);
		return "redirect:findAll.do";
	}
	
	@RequestMapping("/findAll")
	public String findNews(Model model){
		/*List<News> news1  = newsService.findNews();*/
		List<News> news2 = newsService.findNewsByTime();
		//System.out.println(active);
		System.out.println(news2);
		model.addAttribute("news2",news2);
		return "../admin/weekNews";
		
	}
	
}
