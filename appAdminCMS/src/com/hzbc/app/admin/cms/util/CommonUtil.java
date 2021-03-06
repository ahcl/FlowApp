package com.hzbc.app.admin.cms.util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

public class CommonUtil {

	/**
	 * 图片上传的工具
	 * @param myfiles 表单提交的参数
	 * @param request 请求
	 * @return
	 */
	public static List<String> uploadImg(@RequestParam MultipartFile[] myfiles, HttpServletRequest request){
				//处理上传图片


				String path = request.getSession().getServletContext().getRealPath("");
//				String path = request.getRealPath("");
				//System.out.println(path);
				List<String> imgPathList = new ArrayList<String>();
				for(MultipartFile myfile : myfiles){  
		            if(myfile.isEmpty()){  
		                System.out.println("文件未上传");  
		            }else{  
		              /*  System.out.println("文件长度: " + myfile.getSize());  
		                System.out.println("文件类型: " + myfile.getContentType());  
		                System.out.println("文件名称: " + myfile.getName());  
		                System.out.println("文件原名: " + myfile.getOriginalFilename());  
		                System.out.println("========================================");  */
//		                //如果用的是Tomcat服务器，则文件会上传到\\%TOMCAT_HOME%\\webapps\\YourWebProject\\upload\\文件夹中  
//		                String realPath = request.getSession().getServletContext().getRealPath("/upload"); 
		                //使用自定义文件资源库
		                String realPath = path+"\\path";
		                //这里不必处理IO流关闭的问题，因为FileUtils.copyInputStreamToFile()方法内部会自动把用到的IO流关掉，我是看它的源码才知道的  
		                try {
		                	//重置文件名
		                	long time = System.currentTimeMillis();
		                	String timeStr = String.valueOf(time);
		                	String[] originalFileName = myfile.getOriginalFilename().split("\\.");
		                	String fileName = timeStr+"."+originalFileName[1];
							FileUtils.copyInputStreamToFile(myfile.getInputStream(), new File(realPath, fileName));
							//配置图片访问路径					
							/*String ip = "http://localhost:8080/path";
							imgPathList.add(ip+"/"+fileName);*/
							imgPathList.add("path"+"\\"+fileName);
		                } catch (IOException e) {
							e.printStackTrace();
							return null;
						}  
		            }  
		        }  
				
				return imgPathList;
	}
}
