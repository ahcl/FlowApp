<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'nav.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <div id="sidebar">
			<a href="#" class="visible-phone"><i class="icon icon-home"></i>首页</a>
			<ul>
				<li class="active"><a href="index.jsp"><i class="icon icon-home"></i> <span>首页</span></a></li>
				<li class="submenu">
					<a href="#"><i class="icon icon-th-list"></i> <span>旅行管理</span> </a>
					<ul>
						<li><a href="form-common.html">旅行主题</a></li>
						<li><a href="form-validation.html">Validation</a></li>
						<li><a href="form-wizard.html">Wizard</a></li>
					</ul>
				</li>
				<li class="submenu">
					<a href="#"><i class="icon icon-th-list"></i> <span>流量管理</span></a>
					<ul>
						<li><a href="${pageContext.request.contextPath}/active/findAll.do">活动管理</a></li>
						<li><a href="${pageContext.request.contextPath}/news/showNews.do">周报管理</a></li>
						<li><a href="form-wizard.html">Wizard</a></li>
					</ul>
				</li>
				<li><a href="buttons.html"><i class="icon icon-tint"></i> <span>Buttons &amp; icons</span></a></li>
				<li><a href="interface.html"><i class="icon icon-pencil"></i> <span>Interface elements</span></a></li>
				<li><a href="tables.html"><i class="icon icon-th"></i> <span>Tables</span></a></li>
				<li><a href="grid.html"><i class="icon icon-th-list"></i> <span>Grid Layout</span></a></li>
				<li class="submenu">
					<a href="#"><i class="icon icon-file"></i> <span>Sample pages</span> <span class="label">4</span></a>
					<ul>
						<li><a href="invoice.html">Invoice</a></li>
						<li><a href="chat.html">Support chat</a></li>
						<li><a href="calendar.html">Calendar</a></li>
						<li><a href="gallery.html">Gallery</a></li>
					</ul>
				</li>
				<li>
					<a href="charts.html"><i class="icon icon-signal"></i> <span>Charts &amp; graphs</span></a>
				</li>
				<li>
					<a href="widgets.html"><i class="icon icon-inbox"></i> <span>Widgets</span></a>
				</li>
			</ul>
		
		</div>
  </body>
</html>
