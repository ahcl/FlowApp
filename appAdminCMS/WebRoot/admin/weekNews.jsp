<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- <%
request.setCharacterEncoding("UTF-8");
String htmlData = request.getParameter("content1") != null ? request.getParameter("content1") : "";
%> --%>
<%--  <%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>  --%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <%-- <base href="<%=basePath%>"> --%>
    
    <title>周报管理</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
			
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<link rel="stylesheet" href="${pageContext.request.contextPath}/admin/css/bootstrap.min.css" />
		<link rel="stylesheet" href="${pageContext.request.contextPath}/admin/css/bootstrap-responsive.min.css" />
        <link rel="stylesheet" href="${pageContext.request.contextPath}/admin/css/colorpicker.css" />
        <link rel="stylesheet" href="${pageContext.request.contextPath}/admin/css/datepicker.css" />
		<link rel="stylesheet" href="${pageContext.request.contextPath}/admin/css/uniform.css" />
		<link rel="stylesheet" href="${pageContext.request.contextPath}/admin/css/select2.css" />		
		<link rel="stylesheet" href="${pageContext.request.contextPath}/admin/css/unicorn.main.css" />
		<link rel="stylesheet" href="${pageContext.request.contextPath}/admin/css/unicorn.grey.css" class="skin-color" />	
		<link rel="stylesheet" href="${pageContext.request.contextPath}/admin/themes/default/default.css" />
	<link rel="stylesheet" href="${pageContext.request.contextPath}/admin/plugins/code/prettify.css" />
	<link rel="stylesheet" href="${pageContext.request.contextPath}/admin/css/weekNews.css"">
	<script charset="utf-8" src="${pageContext.request.contextPath}/admin/kindeditor.js"></script>
		<script charset="utf-8" src="${pageContext.request.contextPath}/admin/kindeditor-min.js"></script>
	<script charset="utf-8" src="${pageContext.request.contextPath}/admin/lang/zh_CN.js"></script>
	<script charset="utf-8" src="${pageContext.request.contextPath}/admin/plugins/code/prettify.js"></script>
	
	<script>
		KindEditor.ready(function(K) {
			var editor1 = K.create('textarea[name="newsContent"]', {
				cssPath : 'plugins/code/prettify.css',
				uploadJson : '${pageContext.request.contextPath}/admin/jsp/upload_json.jsp',
				fileManagerJson : '${pageContext.request.contextPath}/admin/jsp/file_manager_json.jsp',
				allowFileManager : true,
				afterCreate : function() {
					var self = this;
					K.ctrl(document, 13, function() {
						self.sync();
						document.forms['f1'].submit();
					});
					K.ctrl(self.edit.doc, 13, function() {
						self.sync();
						document.forms['f1'].submit();
					});
				}
			});
			prettyPrint();
		});
		
		function check(){
			var check = '<%=request.getAttribute("check")%>';
			/* alert(check); */
					if(check=="1"){
						$("#listyle").css("display","none");
					}else{
					
						$("#listyle").css("display","block");
					}
		}
	</script>
	
  </head>
  
  <body onload="check()">
    <div id="header">
			<h1><a href="./dashboard.html">Unicorn Admin</a></h1>		
		</div>
		
		<div id="search">
			<input type="text" placeholder="Search here..." /><button type="submit" class="tip-right" title="Search"><i class="icon-search icon-white"></i></button>
		</div>
		<div id="user-nav" class="navbar navbar-inverse">
            <ul class="nav btn-group">
                <li class="btn btn-inverse"><a title="" href="#"><i class="icon icon-user"></i> <span class="text">Profile</span></a></li>
                <li class="btn btn-inverse dropdown" id="menu-messages"><a href="#" data-toggle="dropdown" data-target="#menu-messages" class="dropdown-toggle"><i class="icon icon-envelope"></i> <span class="text">Messages</span> <span class="label label-important">5</span> <b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li><a class="sAdd" title="" href="#">new message</a></li>
                        <li><a class="sInbox" title="" href="#">inbox</a></li>
                        <li><a class="sOutbox" title="" href="#">outbox</a></li>
                        <li><a class="sTrash" title="" href="#">trash</a></li>
                    </ul>
                </li>
                <li class="btn btn-inverse"><a title="" href="#"><i class="icon icon-cog"></i> <span class="text">Settings</span></a></li>
                <li class="btn btn-inverse"><a title="" href="login.html"><i class="icon icon-share-alt"></i> <span class="text">Logout</span></a></li>
            </ul>
        </div>
            
			<%@include file="/include/nav.jsp" %>
		
		<div id="style-switcher">
			<i class="icon-arrow-left icon-white"></i>
			<span>Style:</span>
			<a href="#grey" style="background-color: #555555;border-color: #aaaaaa;"></a>
			<a href="#blue" style="background-color: #2D2F57;"></a>
			<a href="#red" style="background-color: #673232;"></a>
		</div>
		
		<div id="content">
			<div id="content-header">
				<h1>周报管理</h1>
				<div class="btn-group">
					<a class="btn btn-large tip-bottom" title="Manage Files"><i class="icon-file"></i></a>
					<a class="btn btn-large tip-bottom" title="Manage Users"><i class="icon-user"></i></a>
					<a class="btn btn-large tip-bottom" title="Manage Comments"><i class="icon-comment"></i><span class="label label-important">5</span></a>
					<a class="btn btn-large tip-bottom" title="Manage Orders"><i class="icon-shopping-cart"></i></a>
				</div>
			</div>
			<div id="breadcrumb">
				<a href="index.html" title="Go to Home" class="tip-bottom"><i class="icon-home"></i>首页</a>
				<a href="#" class="tip-bottom">流量管理</a>
				<a href="#" class="current">周报管理</a>
			</div>
			<div class="container-fluid">
				<div class="row-fluid">
					<div class="span3">
						<div class="widget-box">
							<div class="widget-title">
							<span class="icon">
									<i class="icon-align-justify"></i>									
								</span>
								<h5>发布列表</h5>
							</div>
							<div class="widget-content nopadding">
								<ul class="thumbnails">
								<li class="span11" id="listyle">
										<a href="#" class="thumbnail">
										<!-- <img src="http://placehold.it/140x140" alt="">	 -->
											<div class="cover-img-top">
											</div>
											<div class="cover-img-top-title">
											<p class="title">标题</p>
											</div>
										</a>
										<div class="actions actions-new">
										<a title="" href="#"><i class="icon-pencil icon-white"></i></a>
										<!-- <a title="" href="#"><i class="icon-remove icon-white"></i></a> -->
										</div>
									</li>
								<c:forEach items="${newsTop}" var="newsTop">
									<li class="span11">
										<a href="#" class="thumbnail">
										<!-- <img src="http://placehold.it/140x140" alt="">	 -->
											<div class="cover-img-top">
											<img class="images" src="${pageContext.request.contextPath}/${newsTop.newsImg }">
											</div>
											<div class="cover-img-top-title">
											<p class="title">${newsTop.newsName }</p>
											</div>
										</a>
										<div class="actions actions-new">
										<a title="" href="#"><i class="icon-pencil icon-white"></i></a>
										<!-- <a title="" href="#"><i class="icon-remove icon-white"></i></a> -->
										</div>
									</li>
									</c:forEach>
									<c:forEach items="${news2}" var="news2">
									<li class="span11">
										<a href="#" class="thumbnail">
										<!-- <img src="http://placehold.it/140x140" alt="">	 -->
											<div class="cover-img-little">
											<div class="cover-img-little-left">
											<p class="litle-title">${news2.newsName }</p>
											</div>
											<div class="cover-img-little-right">
												<img class="images" src="${pageContext.request.contextPath}/${news2.newsImg }">
											</div>
											</div>
										</a>
										<div class="actions">
										<a title="" href="#"><i class="icon-pencil icon-white"></i></a>
										<a title="" href="javaScript:delNews(${news2.id })"><i class="icon-remove icon-white"></i></a>
										</div>
									</li>
									</c:forEach>
								</ul>
								<div class="span11 divplus">
										<a class="thumbnail plus">
											<i class="icon-plus icon-white"></i>&nbsp;添加
										</a>
									<!-- 	<a class="thumbnail plus">
											发布
										</a> -->	
										
								</div>
								<%-- <button type="submit" class="btn btn-primary bnt-new btn-plus" >发布</button> --%>
							<div class="span11 divplus">
										<a class="thumbnail upplus" href="${pageContext.request.contextPath}/news/upNews.do">
											发布
										</a>
						<!-- 	</div> -->
										
								</div>
							</div>
						</div>
					</div>
			<div class="span9">
						<div class="widget-box">
							<div class="widget-title">
								<span class="icon">
									<i class="icon-align-justify"></i>									
								</span>
								<h5>周报发布</h5>
							</div>
							<div class="widget-content nopadding">
							<form action="${pageContext.request.contextPath}/news/add.do" method="post" class="form-horizontal" name="f1" enctype="multipart/form-data"/> 
								<!-- <form action="" method="post" class="form-horizontal" name="f1" enctype="multipart/form-data"/> -->
									<div class="control-group">
										<label class="control-label">周报标题</label>
										<div class="controls">
											<input type="text" name="newsName"/>
										</div>
									</div>
									<div class="control-group">
										<label class="control-label">周报内容</label>
										<div class="controls">
											<!-- <textarea name="activeContent"></textarea> -->
											<textarea name="newsContent" visibility:hidden;"></textarea>
											<br />
										</div>
									</div>
									<div class="control-group">
										<label class="control-label">上传图片</label>
										<div class="controls">
											<input type="file" id="f" name="myfiles" onchange="result()"/>
											<div id="d1"></div>
											<div id="d2"></div>
											<input type="hidden" name="newsImg" id="newsImg"/>
											<span class="help-block">活动banner页面</span>
										</div>
									</div>
									<div class="control-group">
										<label class="control-label">新闻头条</label>
										<div class="controls">
											<!-- <div class="radio"> -->
											<lable class="checkbox-inline"><input type="radio" value="yes" name="radio" id="optionsRadios1" checked="checked">是</lable>
											&nbsp;&nbsp;<lable class="checkbox-inline"><input type="radio" value="no" name="radio" id="optionsRadios2">否</lable>
											<!-- </div> -->
											<span class="help-block">是否将该新闻设置为头条新闻</span>
											
										</div>
									</div>
									
									<!-- </div> -->
									<div class="form-actions">
										<button type="submit" class="btn btn-primary bnt-new" id="savebt">保存</button>
									</div>
								</form>
							</div>
						</div>						
					</div>

				<div class="row-fluid">
					<div class="widget-box">
							<div class="widget-title">
							
								<h5>周报列表</h5>
							</div>
							<div class="widget-content nopadding">
								<table class="table table-bordered data-table">
									<thead>
									<tr>
									<th>周报编号</th>
									<th>周报标题</th>
									<th>发布时间</th>
									<th>发布人</th>
									<!-- <th>是否发布</th> -->
									<th>是否删除</th>
									<th>预览</th>
									<!-- <th>周报修改</th> -->
									</tr>
									</thead>
									<tbody>
									<c:forEach items="${upNews}" var="upNews">
									<tr class="gradeX">
									<td>${upNews.id}</td>
									<td>${upNews.newsName}</td>
									<td>${upNews.newsUpDate}</td>
									<td>${upNews.adminId}</td>
									<%-- <td class="action-td">	
										<c:choose>
											<c:when test="${upNews.newsFlag==1}">
												<a href="javascript:delUpdateFlag(${upNews.id });" class="btn btn-small btnnew">
													<i class="icon-remove"></i>						
												</a>
											</c:when>
											<c:otherwise>
												<a href="javascript:updateFlag(${upNews.id });" class="btn btn-small btn-warning">
													<i class="icon-ok"></i>								
												</a>
											</c:otherwise>
										</c:choose>
									</td> --%>
									<td class="action-td">	
										<a href="javascript:delNews(${upNews.id });" class="btn btn-small btnnew">
													<i class="icon-remove"></i>						
												</a>
									</td>
									<td>
									<a href="active/findActive.do?id=${upNews.id }" class="btn btn-small btnnew">
											查看					
									</a>
									</td>
								<%-- 	<td>
									<a href="javascript:delUpdateFlag(${upNews.id });" class="btn btn-small btnnew">
											修改					
									</a>
									</td> --%>
									</tr>
									</c:forEach>
									</tbody>
									</table>  
						
						</div>
					</div>
				</div>
		

				<div class="row-fluid">
					<div id="footer" class="span12">
						2016 &copy; carrycheng Admin.<!--  Brought to you by <a href="https://wrapbootstrap.com/user/diablo9983">diablo9983</a> -->
					</div>
				</div>
			</div>
		</div>
            <script src="${pageContext.request.contextPath}/admin/js/jquery.min.js"></script>
            <script src="${pageContext.request.contextPath}/admin/js/jquery.ui.custom.js"></script>
            <script src="${pageContext.request.contextPath}/admin/js/bootstrap.min.js"></script>
            <script src="${pageContext.request.contextPath}/admin/js/bootstrap-colorpicker.js"></script>
            <script src="${pageContext.request.contextPath}/admin/js/bootstrap-datepicker.js"></script>
            <script src="${pageContext.request.contextPath}/admin/js/jquery.uniform.js"></script>
            <script src="${pageContext.request.contextPath}/admin/js/select2.min.js"></script>
             <script src="${pageContext.request.contextPath}/admin/js/jquery.dataTables.min.js"></script>
            <script src="${pageContext.request.contextPath}/admin/js/unicorn.js"></script>
            <script src="${pageContext.request.contextPath}/admin/js/unicorn.form_common.js"></script>
             <script src="${pageContext.request.contextPath}/admin/js/unicorn.tables.js"></script>
            <script src="${pageContext.request.contextPath}/admin/js/weekNews.js"></script>
  </body>
</html>
<%!
private String htmlspecialchars(String str) {
	str = str.replaceAll("&", "&amp;");
	str = str.replaceAll("<", "&lt;");
	str = str.replaceAll(">", "&gt;");
	str = str.replaceAll("\"", "&quot;");
	return str;
}
%>
