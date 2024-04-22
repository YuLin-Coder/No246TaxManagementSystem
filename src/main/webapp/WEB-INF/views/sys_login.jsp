<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<!--[if lt IE 9]>
<script type="text/javascript" src="lib/html5shiv.js"></script>
<script type="text/javascript" src="lib/respond.min.js"></script>
<![endif]-->
<link href="${pageContext.request.contextPath}/static/login/css/H-ui.min.css" rel="stylesheet" type="text/css" />
    <link href="${pageContext.request.contextPath}/static/login/css/H-ui.login.css" rel="stylesheet" type="text/css" />
        <link href="${pageContext.request.contextPath}/static/login/css/style.css" rel="stylesheet" type="text/css" />
            
            
            <style>
            .loginBox1{
                width:750px;
                background:url(${pageContext.request.contextPath}/static/login/images/admin-loginform-bg.png) no-repeat;
                    margin-left:20%;
                    margin-top:100px;
                }
                
                .codeBtn{
                    position:relative;
                    color:blue;
                    top:7px;
                    left:80%;
                    z-index:99;
                }
                </style>
                <!--[if IE 6]>
                <script>DD_belatedPNG.fix('*');</script>
                <![endif]-->
                <title>税务管理系统-系统登录</title>
                <meta name="keywords" content="H-ui.admin v3.1,H-ui网站后台模版,后台模版下载,后台管理系统模版,HTML后台模版下载">
                <meta name="description" content="H-ui.admin v3.1，是一款由国人开发的轻量级扁平化网站后台模板，完全免费开源的网站后台管理系统模版，适合中小型CMS后台系统。">
                </head>
                <body>
                <input type="hidden" id="TenantId" name="TenantId" value="" />
                <div class="header"><h1 style="color:white;margin-left:50px;margin-top:-10px;">税务管理系统-系统登录</h1></div>
                <div class="loginWraper" style="height:100%;">
                <div class="loginBox1" style="background-size:100% 100%; padding:70px">
                <div class="form form-horizontal">
                <br><br>
                <div class="row cl">
                <label class="form-label col-xs-8"><p style="color:red">${msg}</p></label>
                    </div>
                    <div class="row cl">
                    <label class="form-label col-xs-3" style="color:white">登录名</label>
                    <div class="formControls col-xs-8">
                    <input id="name" name="name" type="text" placeholder="请输入登录名"  class="input-text size-L ">
                    </div>
                    </div>
                    
                    
                    
                    <div class="row cl">
                    <label class="form-label col-xs-3" style="color:white">密码</label>
                    <div class="formControls col-xs-8">
                    <input id="password" name="password" type="password" placeholder="请输入密码"  class="input-text size-L ">
                    </div>
                    </div>
                    
                    <div class="row cl">
                    <label class="form-label col-xs-3" style="color:white">图片验证码</label>
                    <div class="formControls col-xs-8">
                    <input class="input-text size-L" type="text" id="imgCode" name="imgCode" placeholder="验证码" onblur="if(this.value==''){this.value='验证码:'}" onclick="if(this.value=='验证码:'){this.value='';}" value="验证码:" style="width:150px;">
                        <img id="codeImg1"  name="codeImg"  style="width:80px;height:40px;" alt="点击更换" title="点击更换" />  </div>
                        </div>
                        
                        
                        <div class="row cl">
                        <label class="form-label col-xs-3" style="color:white">登录角色</label>
                        <div class="formControls col-xs-8">
                        
                        <input name="loginType" type="radio" value="1" id="loginType1" style="margin-left:10px;"/><label style="color:white" for="loginType1">管理员</label>
                        
                        <input name="loginType" type="radio" value="2" id="loginType2" style="margin-left:10px;"/><label style="color:white" for="loginType2">办税人员</label>
                        
                        <input name="loginType" type="radio" value="3" id="loginType3" style="margin-left:10px;"/><label style="color:white" for="loginType3">用户</label>
                        
                        
                        </div>
                        </div>
                        
                        
                        
                        
                        
                        
                        
                        <div class="row cl">
                        <div class="formControls col-xs-8 col-xs-offset-3">
                        <input name="" type="button"  onclick="submitForm()" id="submitBtn" class="btn btn-success radius size-L" value=" 系统登录 ">
                        
                        <a  style="" href="${pageContext.request.contextPath}/commonapi/user_info_regist" onclick="" class="btn btn-default radius size-L">注册用户</a>
                            
                            
                            
                            </div>
                            </div>
                            </div>
                            </div>
                            <div class="footer">Copyright 税务管理系统</div>
                            </div>
                            <script type="text/javascript" src="${pageContext.request.contextPath}/static/common/jquery-1.11.1.min.js"></script>
                                <script type="text/javascript" src="${pageContext.request.contextPath}/static/common/utils/listutils.js?v=26573"></script>
                                    
                                    
                                    <script>
                                    
                                    $(document).ready(function(e) {
                                        changeCode();
                                        $("#codeImg1").bind("click",changeCode);
                                        
                                    });
                                    
                                    function genTimestamp(){
                                        var time = new Date();
                                        return time.getTime();
                                    }
                                    function changeCode(){
                                        $("img[name='codeImg']").attr("src","${pageContext.request.contextPath}/commonapi/code?t="+genTimestamp());
                                        }
                                        
                                        
                                        function submitForm(){
                                            
                                            $.ajax({
                                                type: 'post',
                                                url: '${pageContext.request.contextPath}/commonapi/sysSubmit',
                                                    data: {
                                                        'imgCode':$('#imgCode').val(),
                                                        'name':$("#name").val(),
                                                        'password':$("#password").val(),
                                                        'loginType':getCheckBoxVal('loginType')
                                                    },
                                                    success: function(result) {
                                                        
                                                        if(result.code==1){
                                                            var lt = getCheckBoxVal('loginType');
                                                            if(lt=='1'){
                                                                window.location.href="${pageContext.request.contextPath}/admin/index";
                                                                }
                                                                if(lt=='2'){
                                                                    window.location.href="${pageContext.request.contextPath}/staff/index";
                                                                    }
                                                                    if(lt=='3'){
                                                                        window.location.href="${pageContext.request.contextPath}";
                                                                        }
                                                                        }else{
                                                                            alert(result.msg);
                                                                        }
                                                                        
                                                                        
                                                                    }
                                                                });
                                                            }
                                                            $(function(){
                                                                
                                                                
                                                            })
                                                            
                                                            
                                                            
                                                            
                                                            
                                                            
                                                            
                                                            
                                                            
                                                            
                                                            </script>
                                                            </body>
                                                            </html>
