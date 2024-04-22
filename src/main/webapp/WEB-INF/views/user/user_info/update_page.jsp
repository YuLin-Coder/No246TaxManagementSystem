<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<c:set var="uri" value="${pageContext.request.contextPath}" />
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>修改-用户 </title>
    <meta name="Copyright" content="Douco Design." />
    <link href="${pageContext.request.contextPath}/static/admin/css/public.css" rel="stylesheet" type="text/css">
        <script type="text/javascript" src="${pageContext.request.contextPath}/static/admin/js/jquery.min.js"></script>
            <script type="text/javascript" src="${pageContext.request.contextPath}/static/admin/js/global.js"></script>
                <script type="text/javascript" src="${pageContext.request.contextPath}/static/admin/js/jquery.tab.js"></script>
                    
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
                    <h3>修改-用户</h3>
                    
                    <div class="system">
                    <div>
                    <table width="100%" border="0" cellpadding="8" cellspacing="0" class="tableBasic">
                    
                    
                    <tr  id="realNameParentContent">
                    <td align="right">姓名</td>
                    <td >
                    <div style="width:720px;">  <input type="text" class="inpMain" style="color:black;width:500px;" value="${data.realName}" placeholder="请输入姓名" id="realName" />	<span style="color:red">*必填</span>
                        </div>
                        </td>
                        </tr>
                        
                        <tr  id="celPhoneParentContent">
                        <td align="right">联系电话</td>
                        <td >
                        <div style="width:720px;">  <input type="text" class="inpMain" style="color:black;width:500px;" value="${data.celPhone}" placeholder="请输入联系电话" id="celPhone" />	<span style="color:red">*必填</span>
                            </div>
                            </td>
                            </tr>
                            
                            <tr  id="idNumberParentContent">
                            <td align="right">身份证号码</td>
                            <td >
                            <div style="width:720px;">  <input type="text" class="inpMain" style="color:black;width:500px;" value="${data.idNumber}" placeholder="请输入身份证号码" id="idNumber" />	<span style="color:red">*必填</span>
                                </div>
                                </td>
                                </tr>
                                
                                <tr  id="emailParentContent">
                                <td align="right">邮箱</td>
                                <td >
                                <div style="width:720px;">  <input type="text" class="inpMain" style="color:black;width:500px;" value="${data.email}" placeholder="请输入邮箱" id="email" />	<span style="color:red">*必填</span>
                                    </div>
                                    </td>
                                    </tr>
                                    
                                    <tr  id="cityIdParentContent">
                                    <td align="right">城市</td>
                                    <td >
                                    <div style="width:720px;">  <select  id="cityId" style="height:30px;color:black;width:500px;" >
                                    <c:forEach items="${cityInfoList}" var="item">
                                        <c:if test="${item.id==data.cityId}">
                                            <option value="${item.id}" selected>${item.name}</option>
                                                </c:if>
                                                <c:if test="${item.id!=data.cityId}">
                                                    <option value="${item.id}">${item.name}</option>
                                                        </c:if>
                                                        </c:forEach>
                                                        </select>
                                                        <span style="color:red">*必填</span>
                                                        </div>
                                                        </td>
                                                        </tr>
                                                        
                                                        <tr  id="addressParentContent">
                                                        <td align="right">地址</td>
                                                        <td >
                                                        <div style="width:720px;">  <input type="text" class="inpMain" style="color:black;width:500px;" value="${data.address}" placeholder="请输入地址" id="address" />	<span style="color:red">*必填</span>
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
                                                                
                                                                
                                                                
                                                                
                                                                <script type="text/javascript" src="${pageContext.request.contextPath}/static/common/utils/listutils.js?v=7824"></script>
                                                                    
                                                                    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/common/selectSearch/jquery.searchableSelect.css?d=129339" />
                                                                        <script type="text/javascript" src="${pageContext.request.contextPath}/static/common/selectSearch/jquery.searchableSelect.js?d=1293393"></script>
                                                                            
                                                                            <script type="text/javascript">
                                                                            
                                                                            
                                                                            
                                                                            $(function(){
                                                                                
                                                                                $('#cityId').next().remove();
                                                                                $('#cityId').searchableSelect();
                                                                                
                                                                                
                                                                            })
                                                                            
                                                                            
                                                                            
                                                                            function submitData(){
                                                                                var realName= $('#realName').val();
                                                                                var celPhone= $('#celPhone').val();
                                                                                var idNumber= $('#idNumber').val();
                                                                                var email= $('#email').val();
                                                                                var cityId= $('#cityId').val();
                                                                                var address= $('#address').val();
                                                                                
                                                                                $.ajax({
                                                                                    type: 'post',
                                                                                    url: '${pageContext.request.contextPath}/user/user_info/update_submit',
                                                                                        data:{
                                                                                            "id":'${data.id}',
                                                                                                
                                                                                                "realName":realName,
                                                                                                "celPhone":celPhone,
                                                                                                "idNumber":idNumber,
                                                                                                "email":email,
                                                                                                "cityId":cityId,
                                                                                                "address":address
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
