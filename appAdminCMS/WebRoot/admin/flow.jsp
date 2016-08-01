<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%--  <%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>  --%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <%-- <base href="<%=basePath%>"> --%>
    
    <title>流量管理</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
			<meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<link rel="stylesheet" href="${pageContext.request.contextPath}/admin/css/bootstrap.min.css" />
		<link rel="stylesheet" href="${pageContext.request.contextPath}/admin/css/bootstrap-responsive.min.css" />
        <link rel="stylesheet" href="${pageContext.request.contextPath}/admin/css/colorpicker.css" />
        <link rel="stylesheet" href="${pageContext.request.contextPath}/admin/css/datepicker.css" />
		<link rel="stylesheet" href="${pageContext.request.contextPath}/admin/css/uniform.css" />
		<link rel="stylesheet" href="${pageContext.request.contextPath}/admin/css/select2.css" />		
		<link rel="stylesheet" href="${pageContext.request.contextPath}/admin/css/unicorn.main.css" />
		<link rel="stylesheet" href="${pageContext.request.contextPath}/admin/css/unicorn.grey.css" class="skin-color" />	
		<link rel="stylesheet" href="${pageContext.request.contextPath}/admin/css/active.css" />
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

  </head>
  
  <body>
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
				<h1>活动管理</h1>
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
				<a href="#" class="current">活动管理</a>
			</div>
			<div class="container-fluid">
				<div class="row-fluid">
					<div class="span12">
						<div class="widget-box">
							<div class="widget-title">
								<span class="icon">
									<i class="icon-align-justify"></i>									
								</span>
								<h5>活动发布</h5>
							</div>
							<div class="widget-content nopadding">
								<form action="${pageContext.request.contextPath}/active/add.do" method="post" class="form-horizontal" name="f1" enctype="multipart/form-data"/>
									<div class="control-group">
										<label class="control-label">活动标题</label>
										<div class="controls">
											<input type="text" name="activeName"/>
										</div>
									</div>
									<div class="control-group">
										<label class="control-label">活动内容</label>
										<div class="controls">
											<textarea name="activeContent"></textarea>
										</div>
									</div>
									<div class="control-group">
										<label class="control-label">上传图片</label>
										<div class="controls">
											<input type="file" id="f" name="myfiles" onchange="result()"/>
											<div id="d1"></div>
											<div id="d2"></div>
											<input type="hidden" name="activeImg" id="activeImg"/>
											<span class="help-block">活动banner页面</span>
										</div>
									</div>
									
									</div>
									<div class="form-actions">
										<button type="submit" class="btn btn-primary bnt-new">保存</button>
									</div>
								</form>
							</div>
						</div>						
					</div>
		
				<div class="row-fluid">
					<div class="widget-box">
							<div class="widget-title">
							
								<h5>活动列表</h5>
							</div>
							<div class="widget-content nopadding">
								<table class="table table-bordered data-table">
									<thead>
									<tr>
									<th>活动编号</th>
									<th>活动标题</th>
									<th>发布时间</th>
									<th>发布人</th>
									<th>是否发布</th>
									<th>是否删除</th>
									<th>预览</th>
									<th>活动修改</th>
									</tr>
									</thead>
									<tbody>
									<c:forEach items="${active}" var="active">
									<tr class="gradeX">
									<td>${active.id}</td>
									<td>${active.activeName}</td>
									<td>${active.activeUpDate}</td>
									<td>${active.adminId}</td>
									<td class="action-td">	
										<c:choose>
											<c:when test="${active.activeFlag==1}">
												<a href="javascript:delUpdateFlag(${active.id });" class="btn btn-small btnnew">
													<i class="icon-remove"></i>						
												</a>
											</c:when>
											<c:otherwise>
												<a href="javascript:updateFlag(${active.id });" class="btn btn-small btn-warning">
													<i class="icon-ok"></i>								
												</a>
											</c:otherwise>
										</c:choose>
									</td>
									<td class="action-td">	
										<a href="javascript:delActive(${active.id });" class="btn btn-small btnnew">
													<i class="icon-remove"></i>						
												</a>
									</td>
									<td>
									<a href="active/findActive.do?id=${active.id }" class="btn btn-small btnnew">
											查看					
									</a>
									</td>
									<td>
									<a href="javascript:delUpdateFlag(${active.id });" class="btn btn-small btnnew">
											修改					
									</a>
									</td>
									</tr>
									</c:forEach>
									</tbody>
									</table>  
						
						</div>
					</div>
				</div>
			</div>

				<div class="row-fluid">
					<div id="footer" class="span12">
						2012 &copy; Unicorn Admin. Brought to you by <a href="https://wrapbootstrap.com/user/diablo9983">diablo9983</a>
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
            <script src="${pageContext.request.contextPath}/admin/js/active.js"></script>
  </body>
</html>
