<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<c:set var="uri" value="${pageContext.request.contextPath}" />
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>申请发票-发票记录 </title>
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
                        <h3>申请发票-发票记录</h3>
                        
                        <div class="system">
                        <div>
                        <table width="100%" border="0" cellpadding="8" cellspacing="0" class="tableBasic">
                        
                        
                        <tr  id="ztNameParentContent">
                        <td align="right">发票抬头</td>
                        <td >
                        <div style="width:720px;">  <input type="text" class="inpMain" style="color:black;width:500px;"  placeholder="请输入发票抬头" id="ztName" />	<span style="color:red">*必填</span>
                        </div>
                        </td>
                        </tr>
                        
                        <tr  id="zjNoParentContent">
                        <td align="right">主体证件号</td>
                        <td >
                        <div style="width:720px;">  <input type="text" class="inpMain" style="color:black;width:500px;"  placeholder="请输入主体证件号" id="zjNo" />	<span style="color:red">*必填</span>
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
                        
                        <tr  id="fpReasonParentContent">
                        <td align="right">开票项目</td>
                        <td >
                        <div style="width:720px;">  <input type="text" class="inpMain" style="color:black;width:500px;"  placeholder="请输入开票项目" id="fpReason" />	<span style="color:red">*必填</span>
                        </div>
                        </td>
                        </tr>
                        
                        <tr  id="fpAmountParentContent">
                        <td align="right">发票金额</td>
                        <td >
                        <div style="width:720px;">  <input type="text" class="inpMain" style="color:black;width:500px;"  placeholder="请输入发票金额（请输入数字）" id="fpAmount" />	<span style="color:red">*必填</span>
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
                            
                            
                            
                            
                            <script type="text/javascript" src="${pageContext.request.contextPath}/static/common/utils/listutils.js?v=8728"></script>
                                <script type="text/javascript" src="${pageContext.request.contextPath}/static/common/webupload/webuploader.js"></script>
                                    <script type="text/javascript" src="${pageContext.request.contextPath}/static/common/webupload/upload.js"></script>
                                        
                                        
                                        <script type="text/javascript">
                                        
                                        
                                        
                                        $(function(){
                                            
                                            createFileUpload('${pageContext.request.contextPath}');
                                                
                                                
                                            })
                                            
                                            
                                            
                                            function submitData(){
                                                var ztName= $('#ztName').val();
                                                var zjNo= $('#zjNo').val();
                                                var zjImg=getUploadFileStr('zjImg');
                                                var fpReason= $('#fpReason').val();
                                                var fpAmount= $('#fpAmount').val();
                                                
                                                if(fpAmount!=''){
                                                    if(isNum(fpAmount)==false){
                                                        alert("发票金额必须填入数字");
                                                        return;
                                                    }
                                                }
                                                $.ajax({
                                                    type: 'post',
                                                    url: '${pageContext.request.contextPath}/user/fp_log/add_submit',
                                                        data:{
                                                            
                                                            "ztName":ztName,
                                                            "zjNo":zjNo,
                                                            "zjImg":zjImg,
                                                            "fpReason":fpReason,
                                                            "fpAmount":fpAmount
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
