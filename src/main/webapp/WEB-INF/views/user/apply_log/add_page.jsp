<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<c:set var="uri" value="${pageContext.request.contextPath}" />
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>申报税务-申报记录 </title>
    <meta name="Copyright" content="Douco Design." />
    <link href="${pageContext.request.contextPath}/static/admin/css/public.css" rel="stylesheet" type="text/css">
        <script type="text/javascript" src="${pageContext.request.contextPath}/static/admin/js/jquery.min.js"></script>
            <script type="text/javascript" src="${pageContext.request.contextPath}/static/admin/js/global.js"></script>
                <script type="text/javascript" src="${pageContext.request.contextPath}/static/admin/js/jquery.tab.js"></script>
                    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/common/webupload/webuploader.css">
                        
                        <style type="text/css">
                        
                        .loadingModel {
                            position: absolute;
                            top: 0;
                            left: 0;
                            display: none;
                            background-color: rgba(9, 9, 9, 0.63);
                            width: 100%;
                            height: 100%;
                            z-index: 1000;
                        }
                        .loading-content {
                            width: 50%;
                            text-align: center;
                            background: #ffffff;
                            border-radius: 6px;
                            line-height: 30px;
                            z-index: 10001;
                        }
                        </style>
                        </head>
                        
                        <body style="background-color:white">
                        
                        <div id="mMain">
                        <div class="mainBox" style="height:auto!important;height:550px;min-height:550px;">
                        <h3>申报税务-申报记录</h3>
                        
                        <div class="system">
                        <div>
                        <table width="100%" border="0" cellpadding="8" cellspacing="0" class="tableBasic">
                        
                        
                        <tr  id="taxTitleParentContent">
                        <td align="right">申报名目</td>
                        <td >
                        <div style="width:720px;">  <input type="text" class="inpMain" style="color:black;width:500px;"  placeholder="请输入申报名目" id="taxTitle" />	<span style="color:red">*必填</span>
                        </div>
                        </td>
                        </tr>
                        
                        <tr  id="taxTypeParentContent">
                        <td align="right">报税类型</td>
                        <td >
                        <div style="width:720px;">  <select  id="taxType" style="height:30px;color:black;width:500px;" >
                        <c:forEach items="${taxTypeList}" var="item">
                            <option value="${item.id}">${item.name}</option>
                                </c:forEach>
                                </select>
                                <span style="color:red">*必填</span>
                                </div>
                                </td>
                                </tr>
                                
                                <tr  id="taxIntroParentContent">
                                <td align="right">报税简述</td>
                                <td >
                                <div style="width:720px;">  <textarea  placeholder="请输入报税简述"  id="taxIntro"  rows="15" cols="100"></textarea>	<span style="color:red">*必填</span>
                                </div>
                                </td>
                                </tr>
                                
                                <tr  id="taxAmountParentContent">
                                <td align="right">项目金额</td>
                                <td >
                                <div style="width:720px;">  <input type="text" class="inpMain" style="color:black;width:500px;"  placeholder="请输入项目金额（请输入数字）" id="taxAmount" />	<span style="color:red">*必填</span>
                                </div>
                                </td>
                                </tr>
                                
                                <tr  id="realNameParentContent">
                                <td align="right">报税人</td>
                                <td >
                                <div style="width:720px;">  <input type="text" class="inpMain" style="color:black;width:500px;"  placeholder="请输入报税人" id="realName" />	<span style="color:red">*必填</span>
                                </div>
                                </td>
                                </tr>
                                
                                <tr  id="celPhoneParentContent">
                                <td align="right">联系电话</td>
                                <td >
                                <div style="width:720px;">  <input type="text" class="inpMain" style="color:black;width:500px;"  placeholder="请输入联系电话" id="celPhone" />	<span style="color:red">*必填</span>
                                </div>
                                </td>
                                </tr>
                                
                                <tr  id="taxUserTypeParentContent">
                                <td align="right">主体类型</td>
                                <td >
                                <div style="width:720px;">  <select  id="taxUserType" style="height:30px;color:black;width:500px;" >
                                <c:forEach items="${taxUserTypeList}" var="item">
                                    <option value="${item.id}">${item.name}</option>
                                        </c:forEach>
                                        </select>
                                        <span style="color:red">*必填</span>
                                        </div>
                                        </td>
                                        </tr>
                                        
                                        <tr  id="ztNameParentContent">
                                        <td align="right">主体名</td>
                                        <td >
                                        <div style="width:720px;">  <input type="text" class="inpMain" style="color:black;width:500px;"  placeholder="请输入主体名" id="ztName" />	<span style="color:red">*必填</span>
                                        </div>
                                        </td>
                                        </tr>
                                        
                                        <tr  id="ztNoParentContent">
                                        <td align="right">主体证件号</td>
                                        <td >
                                        <div style="width:720px;">  <input type="text" class="inpMain" style="color:black;width:500px;"  placeholder="请输入主体证件号" id="ztNo" />	<span style="color:red">*必填</span>
                                        </div>
                                        </td>
                                        </tr>
                                        
                                        <tr  id="zjImgParentContent">
                                        <td align="right">证件图片</td>
                                        <td >
                                        <div style="width:720px;">  <div class="imgUpload" tip="请上传证件图片，数量不超过2"  red-tip="(*必填)"  upload-num="2" init-val="" upload-type="1" id="zjImg"></div>
                                        </div>
                                        </td>
                                        </tr>
                                        
                                        
                                        <tr>
                                        <td width="131"></td>
                                        <td>
                                        
                                        <a class="btnGreen" href="javascript:;" onclick="submitData();" style="margin-left:30px;">提交</a>
                                        <a class="btnGray" href="javascript:;"  onclick="javascript:history.back(-1);" style="margin-left:30px;">返回上一步</a>
                                        </td>
                                        </tr>
                                        </table>
                                        <div style="height:200px"></div>
                                        </div>
                                        </div>
                                        </div>
                                        </div>
                                        
                                        
                                        <script type="text/javascript" src="${pageContext.request.contextPath}/static/common/jquery-1.11.1.min.js"></script>
                                            
                                            
                                            
                                            
                                            <script type="text/javascript" src="${pageContext.request.contextPath}/static/common/utils/listutils.js?v=0319"></script>
                                                <script type="text/javascript" src="${pageContext.request.contextPath}/static/common/webupload/webuploader.js"></script>
                                                    <script type="text/javascript" src="${pageContext.request.contextPath}/static/common/webupload/upload.js"></script>
                                                        
                                                        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/common/selectSearch/jquery.searchableSelect.css?d=129339" />
                                                            <script type="text/javascript" src="${pageContext.request.contextPath}/static/common/selectSearch/jquery.searchableSelect.js?d=1293393"></script>
                                                                
                                                                <script type="text/javascript">
                                                                
                                                                
                                                                
                                                                $(function(){
                                                                    
                                                                    $('#taxType').next().remove();
                                                                    $('#taxType').searchableSelect();
                                                                    createFileUpload('${pageContext.request.contextPath}');
                                                                        
                                                                        
                                                                    })
                                                                    
                                                                    
                                                                    
                                                                    function submitData(){
                                                                        var taxTitle= $('#taxTitle').val();
                                                                        var taxType= $('#taxType').val();
                                                                        var taxIntro= $('#taxIntro').val();
                                                                        var taxAmount= $('#taxAmount').val();
                                                                        var realName= $('#realName').val();
                                                                        var celPhone= $('#celPhone').val();
                                                                        var taxUserType= $('#taxUserType').val();
                                                                        var ztName= $('#ztName').val();
                                                                        var ztNo= $('#ztNo').val();
                                                                        var zjImg=getUploadFileStr('zjImg');
                                                                        
                                                                        if(taxAmount!=''){
                                                                            if(isNum(taxAmount)==false){
                                                                                alert("项目金额必须填入数字");
                                                                                return;
                                                                            }
                                                                        }
                                                                        $.ajax({
                                                                            type: 'post',
                                                                            url: '${pageContext.request.contextPath}/user/apply_log/add_submit',
                                                                                data:{
                                                                                    
                                                                                    "taxTitle":taxTitle,
                                                                                    "taxType":taxType,
                                                                                    "taxIntro":taxIntro,
                                                                                    "taxAmount":taxAmount,
                                                                                    "realName":realName,
                                                                                    "celPhone":celPhone,
                                                                                    "taxUserType":taxUserType,
                                                                                    "ztName":ztName,
                                                                                    "ztNo":ztNo,
                                                                                    "zjImg":zjImg
                                                                                },
                                                                                success: function(result) {
                                                                                    if(result.code == 0){
                                                                                        alert(result.msg);
                                                                                        }else{
                                                                                            alert(result.msg);
                                                                                            self.location=document.referrer;
                                                                                        }
                                                                                    }
                                                                                });
                                                                            }
                                                                            
                                                                            
                                                                            
                                                                            </script>
                                                                            </body>
                                                                            </html>
