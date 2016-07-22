package com.hzbc.app.admin.cms.controller;

import java.sql.Date;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hzbc.app.admin.cms.entity.Active;
import com.hzbc.app.admin.cms.service.ActiveService;

@Controller
@RequestMapping("/active")
public class ActiveController {
	@Autowired
	public ActiveService activeService;
	
	@RequestMapping("/add")
	public String addActive(Active active){
		Active a1 = new Active();
		Date date= new Date(System.currentTimeMillis());
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		a1.setActiveName(active.getActiveName());
		a1.setActiveContent(active.getActiveContent());
		a1.setActiveUpDate(dateFormat.format(date));
		a1.setActiveImg(active.getActiveImg());
		a1.setActiveFlag(1);
		a1.setAdminId(1);
		activeService.addActive(a1);
		System.out.println("活动标题："+active.getActiveName()+"活动内容："+active.getActiveContent());
		return "jsp/success";
	}
}
