<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta charset="utf-8">
  <title>税务管理系统</title>
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <meta name="keywords" content="税务管理系统">
  <meta name="description" content="税务管理系统">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/static/bbs/res/layui/css/layui.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/static/bbs/res/css/global.css">
      <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/common/page/myPagination.css?t=4" />
</head>
<body>
<div class="fly-header layui-bg-black">
  <div class="layui-container">
    <a style="float:left;left:-30px;margin-top:10px;" href="${pageContext.request.contextPath}">
     <h1 style="color:white">税务管理系统</h1>
    </a>
    <ul class="layui-nav fly-nav layui-hide-xs">
        <li class="layui-nav-item">
        <a href="${pageContext.request.contextPath}/">政策查询</a>
      </li>
       <li class="layui-nav-item">
        <a href="${pageContext.request.contextPath}/wg">违规查询</a>
      </li>
      <li class="layui-nav-item">
        <a href="${pageContext.request.contextPath}/notice">系统公告</a>
      </li>
    </ul>
    <ul class="layui-nav fly-nav-user">
	<c:if test="${login==null }">
      
       <li class="layui-nav-item">
        <a href="${pageContext.request.contextPath}/commonapi/sys_login">登录</a>
      </li>
      
  </c:if>
  <c:if test="${login!=null and login.loginType==1}">
  	 <!-- 登入后的状态 -->
	   <li class="layui-nav-item">
        <a class="fly-nav-avatar" href="${pageContext.request.contextPath}/admin/index">
          <cite class="layui-hide-xs">进入后台</cite>
        </a>
      </li>
       <li class="layui-nav-item">
        <a href="${pageContext.request.contextPath}/commonapi/sys_logout">退出</a>
      </li>
  </c:if>
  
   <c:if test="${login!=null and login.loginType==2}">
  	 <!-- 登入后的状态 -->
	   <li class="layui-nav-item">
        <a class="fly-nav-avatar" href="${pageContext.request.contextPath}/staff/index">
          <cite class="layui-hide-xs">进入后台</cite>
        </a>
      </li>
       <li class="layui-nav-item">
        <a href="${pageContext.request.contextPath}/commonapi/sys_logout">退出</a>
      </li>
  </c:if>
  
    <c:if test="${login!=null and login.loginType==3}">
  	 <!-- 登入后的状态 -->
	   <li class="layui-nav-item">
        <a class="fly-nav-avatar" href="${pageContext.request.contextPath}/user/index">
          <cite class="layui-hide-xs">个人中心</cite>
        </a>
      </li>
       <li class="layui-nav-item">
        <a href="${pageContext.request.contextPath}/commonapi/sys_logout">退出</a>
      </li>
  </c:if>
  
    </ul>
  </div>
</div>
<div class="layui-container">
  <div class="layui-row layui-col-space15">
    <div class="layui-col-md12 content detail">
      <div class="fly-panel detail-box">
        <h1>${detail.title}</h1>
        <p style="color:gray">${detail.createTime}</p>
        <div class="fly-detail-info">
          
          <span class="fly-list-nums"> 

          </span>
        </div>
         
        <div class="detail-body photos">
         	<p style="margin-left:10%;width:80%;margin-top:60px;">${detail.wgDetail}</p>

        </div>
      </div>

    </div>
  </div>
</div>
<script src="${pageContext.request.contextPath}/static/bbs/res/layui/layui.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/common/jquery-1.11.1.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/common/page/myPagination.js"></script>
<script>

</script>
</body>
</html>
