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
	 * ����ͼƬ
	 * @param myfiles
	 * @return
	 */
	@RequestMapping("/img")
	@ResponseBody
	public static List<String> imageHandle(MultipartFile[] myfiles, HttpServletRequest request){
		//�����ϴ�ͼƬ
		System.out.println("123");
		List<String> imgPathList = new ArrayList<String>();
		for(MultipartFile myfile : myfiles){  
            if(myfile.isEmpty()){  
                System.out.println("�ļ�δ�ϴ�");  
            }else{  
                System.out.println("�ļ�����: " + myfile.getSize());  
                System.out.println("�ļ�����: " + myfile.getContentType());  
                System.out.println("�ļ�����: " + myfile.getName());  
                System.out.println("�ļ�ԭ��: " + myfile.getOriginalFilename());  
                System.out.println("========================================");  
                
//                //����õ���Tomcat�����������ļ����ϴ���\\%TOMCAT_HOME%\\webapps\\YourWebProject\\upload\\�ļ�����  
//                String realPath = request.getSession().getServletContext().getRealPath("/upload"); 
                //ʹ���Զ����ļ���Դ��
                String realPath = "D:/doctorImg";
                //���ﲻ�ش���IO���رյ����⣬��ΪFileUtils.copyInputStreamToFile()�����ڲ����Զ����õ���IO���ص������ǿ�����Դ���֪����  
                try {
                	//�����ļ���
                	long time = System.currentTimeMillis();
                	String timeStr = String.valueOf(time);
                	String[] originalFileName = myfile.getOriginalFilename().split("\\.");
                	String fileName = timeStr+"."+originalFileName[1];
					FileUtils.copyInputStreamToFile(myfile.getInputStream(), new File(realPath, fileName));
					//����ͼƬ����·��					
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
