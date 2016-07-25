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
import com.hzbc.app.admin.cms.service.ActiveService;
import com.hzbc.app.admin.cms.util.CommonUtil;

@Controller
@RequestMapping("/active")
public class ActiveController {
	@Autowired
	public ActiveService activeService;
		
	@RequestMapping("/add")
	public String addActive(Active active,@RequestParam MultipartFile[] myfiles, HttpServletRequest request){
		CommonUtil commonUtil = new CommonUtil();
		Active a1 = new Active();
		//获取当前时间
		Date date= new Date(System.currentTimeMillis());
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//调用图片上传工具
		List<String> pathImg= commonUtil.uploadImg(myfiles, request);
		System.out.println(pathImg.get(0));
		//存入数据库
		a1.setActiveName(active.getActiveName());
		a1.setActiveContent(active.getActiveContent());
		a1.setActiveUpDate(dateFormat.format(date));
		a1.setActiveImg(pathImg.get(0));
		a1.setActiveFlag(1);
		a1.setAdminId(1);
		activeService.addActive(a1);
		//System.out.println("活动标题："+active.getActiveName()+"活动内容："+active.getActiveContent());
		return "redirect:findAll.do";
	}
	
	@RequestMapping("/findAll")
	public String findActive(Model model){
		List<Active> active  = activeService.findActive();
		//System.out.println(active);
		model.addAttribute("active",active);
		return "../admin/active";
		
	}
}
