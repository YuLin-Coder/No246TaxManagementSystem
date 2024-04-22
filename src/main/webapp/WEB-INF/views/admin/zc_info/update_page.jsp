<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<c:set var="uri" value="${pageContext.request.contextPath}" />
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>修改-法规政策 </title>
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
                    <h3>修改-法规政策</h3>
                    
                    <div class="system">
                    <div>
                    <table width="100%" border="0" cellpadding="8" cellspacing="0" class="tableBasic">
                    
                    
                    <tr  id="titleParentContent">
                    <td align="right">标题</td>
                    <td >
                    <div style="width:720px;">  <input type="text" class="inpMain" style="color:black;width:500px;" value="${data.title}" placeholder="请输入标题" id="title" />	<span style="color:red">*必填</span>
                        </div>
                        </td>
                        </tr>
                        
                        <tr  id="zcIntroParentContent">
                        <td align="right">简述</td>
                        <td >
                        <div style="width:720px;">  <textarea  placeholder="请输入简述"  id="zcIntro"  rows="15" cols="100">${data.zcIntro}</textarea>	<span style="color:red">*必填</span>
                            </div>
                            </td>
                            </tr>
                            
                            <tr  id="contentParentContent">
                            <td align="right">详情</td>
                            <td >
                            <div style="width:720px;">   <div id="contentDiv1" data-id="content"  class="toolbar" style="border: 1px solid #ccc;margin-top:3%;"></div>
                            <div id="contentDiv2"  class="text" style="border: 1px solid #ccc;min-height:300px;z-index:1"></div>
                            <span style="color:red">*必填</span>
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
                                
                                <script type="text/javascript" src="${pageContext.request.contextPath}/static/common/wangeditor-3.0.17/wangEditor.min.js"></script>
                                    <script type="text/javascript" src="${pageContext.request.contextPath}/static/common/wangeditor-3.0.17/wangeditor_emotion.js"></script>
                                        
                                        
                                        
                                        <script type="text/javascript" src="${pageContext.request.contextPath}/static/common/utils/listutils.js?v=1152"></script>
                                            
                                            
                                            <script type="text/javascript">
                                            
                                            
                                            var wangList=[];
                                            
                                            $(function(){
                                                
                                                var contentMap = {};
                                                    var contentEdit =window.wangEditor;
                                                    editor = new contentEdit('#contentDiv1', '#contentDiv2');
                                                    editor.customConfig.uploadImgServer = '${pageContext.request.contextPath}/commonapi/imgUpload/imgUploadForWangEditor'
                                                        editor.customConfig.uploadImgMaxSize = 3 * 1024 * 1024;
                                                        editor.customConfig.uploadImgMaxLength = 5;
                                                        editor.customConfig.uploadImgTimeout = 30000;
                                                        editor.customConfig.uploadFileName = 'files'
                                                        editor.customConfig.emotions = [{ title: '默认',type: 'image',content:wangeditorEmotions}];
                                                            editor.create();
                                                            $('#contentDiv2').css("z-index","1");
                                                            contentMap.id='content';
                                                            contentMap.edit=editor;
                                                            wangList.push(contentMap);
                                                            editor.txt.html(getData().content);
                                                            
                                                            
                                                        })
                                                        
                                                        
                                                        
                                                        function getEditVal(name){
                                                            for(var i=0;i<wangList.length;i++){
                                                                var dataId = wangList[i].id;
                                                                if(dataId==name){
                                                                    return wangList[i].edit.txt.html();
                                                                }
                                                            }
                                                            return '';
                                                        }
                                                        function getData(){
                                                            var data={};
                                                                $.ajax({
                                                                    async:false,
                                                                    type: 'post',
                                                                    url: '${pageContext.request.contextPath}/admin/zc_info/queryDataDetail',
                                                                        data:{
                                                                            "id":'${data.id}'
                                                                            },
                                                                            success: function(result) {
                                                                                data = result;
                                                                            }
                                                                        });
                                                                        return data;
                                                                    }
                                                                    function submitData(){
                                                                        var title= $('#title').val();
                                                                        var zcIntro= $('#zcIntro').val();
                                                                        var content=getEditVal('content');
                                                                        
                                                                        $.ajax({
                                                                            type: 'post',
                                                                            url: '${pageContext.request.contextPath}/admin/zc_info/update_submit',
                                                                                data:{
                                                                                    "id":'${data.id}',
                                                                                        
                                                                                        "title":title,
                                                                                        "zcIntro":zcIntro,
                                                                                        "content":content
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
