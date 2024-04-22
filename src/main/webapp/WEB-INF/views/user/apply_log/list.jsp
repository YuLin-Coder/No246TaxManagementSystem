<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<c:set var="uri" value="${pageContext.request.contextPath}" />
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>申报记录</title>
    <meta name="Copyright" content="" />
    <link href="${pageContext.request.contextPath}/static/admin/css/public.css" rel="stylesheet" type="text/css">
        <link href="${pageContext.request.contextPath}/static/admin/css/modal_css.css" rel="stylesheet" type="text/css">
            <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/common/page/myPagination.css?t=4" />
                
                <style type="text/css">
                .btnStyle{
                    margin-left:8px;
                    margin-top:8px
                }
                .loadingModel {
                    position: absolute;
                    top: 0;
                    left: 0;
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
                .action>button{
                    background-color:#5eb95e;
                }
                </style>
                </head>
                
                <body style="background-color:white">
                <div id="loadingDiv"></div>
                <div id="imgModal"></div>
                
                <div class="mainBox" style="height:auto!important;height:550px;min-height:550px;">
                <h3>申报记录</h3>
                <div>
                
                <div style="display:inline">
                <p style="display:inline-block;margin-top:30px">
                <span style="margin-left:20px;">申报编号</span>
                <input type="text" class="inpMain" style="color:black;width:250px;"  placeholder="请输入申报编号进行查询" id="taxNo" />
                </p>
                </div>
                
                <div style="display:inline">
                <p style="display:inline-block;margin-top:30px">
                <span style="margin-left:20px;">申报名目</span>
                <input type="text" class="inpMain" style="color:black;width:250px;"  placeholder="请输入申报名目进行查询" id="taxTitle" />
                </p>
                </div>
                
                <div style="display:inline">
                <p style="display:inline-block;margin-top:30px">
                <span style="margin-left:20px;">报税类型</span>
                <select  id="taxType" style="height:30px;color:black;width:250px;" >
                <option value="">全部</option>
                <c:forEach items="${taxTypeList}" var="item">
                    <option value="${item.id}">${item.name}</option>
                        </c:forEach>
                        </select>
                        
                        </p>
                        </div>
                        
                        <div style="display:inline">
                        <p style="display:inline-block;margin-top:30px">
                        <span style="margin-left:20px;">状态</span>
                        <select  id="taxStatus" style="height:30px;color:black;width:250px;" >
                        <option value="">全部</option>
                        <c:forEach items="${taxStatusList}" var="item">
                            <option value="${item.id}">${item.name}</option>
                                </c:forEach>
                                </select>
                                
                                </p>
                                </div>
                                
                                <div style="display:inline">
                                <p style="display:inline-block;margin-top:30px">
                                <a href="javascript:;"  class="btnGreen" onclick="ajaxList(1);" style="margin-left:30px;">查询</a>
                                </p>
                                </div>
                                
                                </div>
                                <div style="margin-left:20px;margin-top:10px;">
                                <a href="${pageContext.request.contextPath}/user/apply_log/add" class="btnGreen">申报税务</a>
                                    
                                    </div>
                                    
                                    <div style="height:10px"></div>
                                    <table width="100%" border="0" cellpadding="8" cellspacing="0" class="tableBasic"  style="">
                                    
                                    <thead>
                                    <tr>
                                    <th>申报编号</th>
                                    <th>申报名目</th>
                                    <th>报税类型</th>
                                    <th>报税简述</th>
                                    <th>项目金额</th>
                                    <th>报税用户</th>
                                    <th>报税人</th>
                                    <th>联系电话</th>
                                    <th>主体类型</th>
                                    <th>主体名</th>
                                    <th>主体证件号</th>
                                    <th>证件图片</th>
                                    <th>状态</th>
                                    <th>审核备注</th>
                                    <th>申请时间</th>
                                    <th>用户城市</th>
                                    <th style="width:200px;">操作</th>
                                    
                                    </tr>
                                    </thead>
                                    <tbody id="apply_log_body">
                                    
                                    </tbody>
                                    </table>
                                    <div id="apply_log_bar" class="pagination" style="margin-top:20px;"></div>
                                    
                                    <div class="action">
                                    
                                    </div>
                                    </div>
                                    
                                    
                                    
                                    <script type="text/javascript" src="${pageContext.request.contextPath}/static/common/jquery-1.11.1.min.js"></script>
                                        <script type="text/javascript" src="${pageContext.request.contextPath}/static/common/page/myPagination.js"></script>
                                            <script type="text/javascript" src="${pageContext.request.contextPath}/static/admin/js/modal_js.js"></script>
                                                
                                                
                                                
                                                
                                                
                                                <script type="text/javascript" src="${pageContext.request.contextPath}/static/common/utils/listutils.js?v=5965"></script>
                                                    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/common/selectSearch/jquery.searchableSelect.css?d=12939" />
                                                        <script type="text/javascript" src="${pageContext.request.contextPath}/static/common/selectSearch/jquery.searchableSelect.js?d=124393"></script>
                                                            
                                                            
                                                            
                                                            <script type="text/javascript">
                                                            
                                                            $(function(){
                                                                $('#taxType').next().remove();
                                                                $('#taxType').searchableSelect();
                                                                
                                                                ajaxList(1);
                                                                
                                                                
                                                            });
                                                            
                                                            function ajaxList(page) {
                                                                var taxNo = $("#taxNo").val();
                                                                var taxTitle = $("#taxTitle").val();
                                                                var taxType = $("#taxType").val();
                                                                var taxStatus = $("#taxStatus").val();
                                                                
                                                                
                                                                showLoading('${pageContext.request.contextPath}/static/common/loading.gif');
                                                                    $.ajax({
                                                                        type : 'get',
                                                                        url : "${pageContext.request.contextPath}/user/apply_log/queryList",
                                                                            data : {
                                                                                
                                                                                "page":page,
                                                                                "taxNo":taxNo,
                                                                                "taxTitle":taxTitle,
                                                                                "taxType":taxType,
                                                                                "taxStatus":taxStatus
                                                                                
                                                                            },
                                                                            success : function(result) {
                                                                                hideLoading();
                                                                                var rows = result.list;//得到数据列
                                                                                var total = result.count;//得到数据总数
                                                                                lastPage=result.totalPage;
                                                                                totalCount=total;
                                                                                var html = '';
                                                                                for (var i = 0; i < rows.length; i++) {
                                                                                    html += '<tr>' ;
                                                                                    var taxNoVal=setNullToEmpty(rows[i].applyLog.taxNo);
                                                                                    html+='<td>'+ taxNoVal+'</td>';
                                                                                    var taxTitleVal=setNullToEmpty(rows[i].applyLog.taxTitle);
                                                                                    html+='<td>'+ taxTitleVal+'</td>';
                                                                                    var taxTypeVal=setNullToEmpty(rows[i].taxTypeStr);
                                                                                    html+='<td>'+ taxTypeVal+'</td>';
                                                                                    var taxIntroVal=setNullToEmpty(rows[i].applyLog.taxIntro);
                                                                                    html+='<td>'+ taxIntroVal+'</td>';
                                                                                    var taxAmountVal=setNullToEmpty(rows[i].applyLog.taxAmount);
                                                                                    html+='<td>'+ taxAmountVal+'</td>';
                                                                                    var userIdVal=setNullToEmpty(rows[i].userIdStr);
                                                                                    html+='<td>'+ userIdVal+'</td>';
                                                                                    var realNameVal=setNullToEmpty(rows[i].applyLog.realName);
                                                                                    html+='<td>'+ realNameVal+'</td>';
                                                                                    var celPhoneVal=setNullToEmpty(rows[i].applyLog.celPhone);
                                                                                    html+='<td>'+ celPhoneVal+'</td>';
                                                                                    var taxUserTypeVal=setNullToEmpty(rows[i].taxUserTypeStr);
                                                                                    html+='<td>'+taxUserTypeVal+'</td>';
                                                                                    var ztNameVal=setNullToEmpty(rows[i].applyLog.ztName);
                                                                                    html+='<td>'+ ztNameVal+'</td>';
                                                                                    var ztNoVal=setNullToEmpty(rows[i].applyLog.ztNo);
                                                                                    html+='<td>'+ ztNoVal+'</td>';
                                                                                    var zjImgStr = rows[i].applyLog.zjImg;
                                                                                    if(zjImgStr!=null){
                                                                                        var zjImgSplit = zjImgStr.split(";");
                                                                                        var tmp = '';
                                                                                        for(var j=0;j<zjImgSplit.length;j++){
                                                                                            if(zjImgSplit[j]!=''){
                                                                                                tmp+='<div ><img src="'+zjImgSplit[j]+'" style="width:100px" onclick="maxImg(this)"></div>';
                                                                                            }
                                                                                        }
                                                                                        html+='<td>'+tmp+'</td>';
                                                                                        }else{
                                                                                            html+='<td></td>';
                                                                                        }
                                                                                        var taxStatusVal=setNullToEmpty(rows[i].taxStatusStr);
                                                                                        if(rows[i].applyLog.taxStatus=='1'){
                                                                                            taxStatusVal ='<span style="background-color:orange;color:white;padding:3px">'+taxStatusVal+'</span>';
                                                                                            
                                                                                            
                                                                                        }
                                                                                        if(rows[i].applyLog.taxStatus=='2'){
                                                                                            taxStatusVal ='<span style="background-color:green;color:white;padding:3px">'+taxStatusVal+'</span>';
                                                                                            
                                                                                            
                                                                                        }
                                                                                        if(rows[i].applyLog.taxStatus=='3'){
                                                                                            taxStatusVal ='<span style="background-color:red;color:white;padding:3px">'+taxStatusVal+'</span>';
                                                                                            
                                                                                            
                                                                                        }
                                                                                        html+='<td>'+taxStatusVal+'</td>';
                                                                                        var checkRemarkVal=setNullToEmpty(rows[i].applyLog.checkRemark);
                                                                                        html+='<td>'+ checkRemarkVal+'</td>';
                                                                                        var createTimeVal=setNullToEmpty(rows[i].applyLog.createTime);
                                                                                        html+='<td>'+ createTimeVal+'</td>';
                                                                                        var cityIdVal=setNullToEmpty(rows[i].cityIdStr);
                                                                                        html+='<td>'+ cityIdVal+'</td>';
                                                                                        html+='<td>';
                                                                                        if(rows[i].applyLog.taxStatus=='1'){
                                                                                            html+='<a href="javascript:void(0)" onclick="del(this)" data-id="'+rows[i].applyLog.id+'" class="btnPayment btnStyle">删除</a>';
                                                                                        }
                                                                                        html+='</td>';
                                                                                        html+='</tr>';
                                                                                    }
                                                                                    if (rows.length == 0) {
                                                                                        html += '<tr><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td>无数据</td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td></tr>';
                                                                                    }
                                                                                    $("#apply_log_body").html(html);
                                                                                    
                                                                                    
                                                                                    new myPagination({
                                                                                        id: 'apply_log_bar',
                                                                                        curPage:page, //初始页码
                                                                                        pageTotal: result.totalPage, //总页数
                                                                                        pageAmount: 10,  //每页多少条
                                                                                        dataTotal: total, //总共多少条数据
                                                                                        pageSize: 5, //可选,分页个数
                                                                                        showPageTotalFlag:true, //是否显示数据统计
                                                                                        showSkipInputFlag:false, //是否支持跳转
                                                                                        getPage: function (page) {
                                                                                            ajaxList(page);
                                                                                        }
                                                                                    })
                                                                                    
                                                                                }
                                                                            });
                                                                        }
                                                                        
                                                                        function del(e){
                                                                            if(window.confirm('你确定要删除该申报记录吗')){
                                                                                var id = $(e).attr("data-id");
                                                                                $.ajax({
                                                                                    type : 'get',
                                                                                    url : "${pageContext.request.contextPath}/user/apply_log/del",
                                                                                        data : {
                                                                                            "id":id
                                                                                        },
                                                                                        success : function(result) {
                                                                                            alert(result.msg);
                                                                                            if(result.code==1){
                                                                                                ajaxList(1);
                                                                                            }
                                                                                        }
                                                                                    });
                                                                                    return true;
                                                                                    }else{
                                                                                        return false;
                                                                                    }
                                                                                }
                                                                                
                                                                                
                                                                                function gotoPage(e){
                                                                                    
                                                                                    var url = $(e).attr("data-url");
                                                                                    window.location.href=url;
                                                                                }
                                                                                
                                                                                </script>
                                                                                
                                                                                </body>
                                                                                </html>
