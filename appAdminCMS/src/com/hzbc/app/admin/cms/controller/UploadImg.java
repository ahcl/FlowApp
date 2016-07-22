package com.hzbc.app.admin.cms.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;


import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/upload")
public class UploadImg {
	
	
	/**
	 * 处理图片
	 * @param myfiles
	 * @return
	 */
	@RequestMapping("/img")
	@ResponseBody
	public static List<String> imageHandle(MultipartFile[] myfiles, HttpServletRequest request){
		//处理上传图片
		System.out.println("123");
		List<String> imgPathList = new ArrayList<String>();
		for(MultipartFile myfile : myfiles){  
            if(myfile.isEmpty()){  
                System.out.println("文件未上传");  
            }else{  
                System.out.println("文件长度: " + myfile.getSize());  
                System.out.println("文件类型: " + myfile.getContentType());  
                System.out.println("文件名称: " + myfile.getName());  
                System.out.println("文件原名: " + myfile.getOriginalFilename());  
                System.out.println("========================================");  
                
//                //如果用的是Tomcat服务器，则文件会上传到\\%TOMCAT_HOME%\\webapps\\YourWebProject\\upload\\文件夹中  
//                String realPath = request.getSession().getServletContext().getRealPath("/upload"); 
                //使用自定义文件资源库
                String realPath = "D:/doctorImg";
                //这里不必处理IO流关闭的问题，因为FileUtils.copyInputStreamToFile()方法内部会自动把用到的IO流关掉，我是看它的源码才知道的  
                try {
                	//重置文件名
                	long time = System.currentTimeMillis();
                	String timeStr = String.valueOf(time);
                	String[] originalFileName = myfile.getOriginalFilename().split("\\.");
                	String fileName = timeStr+"."+originalFileName[1];
					FileUtils.copyInputStreamToFile(myfile.getInputStream(), new File(realPath, fileName));
					//配置图片访问路径					
					String ip = "http://localhost:8080/path";
					imgPathList.add(ip+"/"+fileName);
                } catch (IOException e) {
					e.printStackTrace();
					return null;
				}  
            }  
        }  
		
		return imgPathList;
	}
}
