<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<c:set var="uri" value="${pageContext.request.contextPath}" />
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>发票记录</title>
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
                <h3>发票记录</h3>
                <div>
                
                <div style="display:inline">
                <p style="display:inline-block;margin-top:30px">
                <span style="margin-left:20px;">发票编号</span>
                <input type="text" class="inpMain" style="color:black;width:250px;"  placeholder="请输入发票编号进行查询" id="fpNo" />
                </p>
                </div>
                
                <div style="display:inline">
                <p style="display:inline-block;margin-top:30px">
                <span style="margin-left:20px;">审核状态</span>
                <select  id="checkStatus" style="height:30px;color:black;width:250px;" >
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
                        <a href="${pageContext.request.contextPath}/user/fp_log/add" class="btnGreen">申请发票</a>
                            
                            </div>
                            
                            <div style="height:10px"></div>
                            <table width="100%" border="0" cellpadding="8" cellspacing="0" class="tableBasic"  style="">
                            
                            <thead>
                            <tr>
                            <th>发票编号</th>
                            <th>发票抬头</th>
                            <th>主体证件号</th>
                            <th>证件图片</th>
                            <th>开票项目</th>
                            <th>发票金额</th>
                            <th>审核状态</th>
                            <th>审核备注</th>
                            <th>申请用户</th>
                            <th>用户城市</th>
                            <th>申请时间</th>
                            <th style="width:200px;">操作</th>
                            
                            </tr>
                            </thead>
                            <tbody id="fp_log_body">
                            
                            </tbody>
                            </table>
                            <div id="fp_log_bar" class="pagination" style="margin-top:20px;"></div>
                            
                            <div class="action">
                            
                            </div>
                            </div>
                            
                            
                            
                            <script type="text/javascript" src="${pageContext.request.contextPath}/static/common/jquery-1.11.1.min.js"></script>
                                <script type="text/javascript" src="${pageContext.request.contextPath}/static/common/page/myPagination.js"></script>
                                    <script type="text/javascript" src="${pageContext.request.contextPath}/static/admin/js/modal_js.js"></script>
                                        
                                        
                                        
                                        
                                        
                                        <script type="text/javascript" src="${pageContext.request.contextPath}/static/common/utils/listutils.js?v=9665"></script>
                                            
                                            
                                            
                                            <script type="text/javascript">
                                            
                                            $(function(){
                                                
                                                ajaxList(1);
                                                
                                                
                                            });
                                            
                                            function ajaxList(page) {
                                                var fpNo = $("#fpNo").val();
                                                var checkStatus = $("#checkStatus").val();
                                                
                                                
                                                showLoading('${pageContext.request.contextPath}/static/common/loading.gif');
                                                    $.ajax({
                                                        type : 'get',
                                                        url : "${pageContext.request.contextPath}/user/fp_log/queryList",
                                                            data : {
                                                                
                                                                "page":page,
                                                                "fpNo":fpNo,
                                                                "checkStatus":checkStatus
                                                                
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
                                                                    var fpNoVal=setNullToEmpty(rows[i].fpLog.fpNo);
                                                                    html+='<td>'+ fpNoVal+'</td>';
                                                                    var ztNameVal=setNullToEmpty(rows[i].fpLog.ztName);
                                                                    html+='<td>'+ ztNameVal+'</td>';
                                                                    var zjNoVal=setNullToEmpty(rows[i].fpLog.zjNo);
                                                                    html+='<td>'+ zjNoVal+'</td>';
                                                                    var zjImgStr = rows[i].fpLog.zjImg;
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
                                                                        var fpReasonVal=setNullToEmpty(rows[i].fpLog.fpReason);
                                                                        html+='<td>'+ fpReasonVal+'</td>';
                                                                        var fpAmountVal=setNullToEmpty(rows[i].fpLog.fpAmount);
                                                                        html+='<td>'+ fpAmountVal+'</td>';
                                                                        var checkStatusVal=setNullToEmpty(rows[i].checkStatusStr);
                                                                        if(rows[i].fpLog.checkStatus=='1'){
                                                                            checkStatusVal ='<span style="background-color:orange;color:white;padding:3px">'+checkStatusVal+'</span>';
                                                                            
                                                                            
                                                                        }
                                                                        if(rows[i].fpLog.checkStatus=='2'){
                                                                            checkStatusVal ='<span style="background-color:green;color:white;padding:3px">'+checkStatusVal+'</span>';
                                                                            
                                                                            
                                                                        }
                                                                        if(rows[i].fpLog.checkStatus=='3'){
                                                                            checkStatusVal ='<span style="background-color:red;color:white;padding:3px">'+checkStatusVal+'</span>';
                                                                            
                                                                            
                                                                        }
                                                                        html+='<td>'+checkStatusVal+'</td>';
                                                                        var checkRemarkVal=setNullToEmpty(rows[i].fpLog.checkRemark);
                                                                        html+='<td>'+ checkRemarkVal+'</td>';
                                                                        var userIdVal=setNullToEmpty(rows[i].userIdStr);
                                                                        html+='<td>'+ userIdVal+'</td>';
                                                                        var userCityVal=setNullToEmpty(rows[i].userCityStr);
                                                                        html+='<td>'+ userCityVal+'</td>';
                                                                        var createTimeVal=setNullToEmpty(rows[i].fpLog.createTime);
                                                                        html+='<td>'+ createTimeVal+'</td>';
                                                                        html+='<td>';
                                                                        if(rows[i].fpLog.checkStatus=='1'){
                                                                            html+='<a href="javascript:void(0)" onclick="del(this)" data-id="'+rows[i].fpLog.id+'" class="btnPayment btnStyle">删除</a>';
                                                                        }
                                                                        html+='</td>';
                                                                        html+='</tr>';
                                                                    }
                                                                    if (rows.length == 0) {
                                                                        html += '<tr><td></td><td></td><td></td><td></td><td></td><td></td><td>无数据</td><td></td><td></td><td></td><td></td><td></td></tr>';
                                                                    }
                                                                    $("#fp_log_body").html(html);
                                                                    
                                                                    
                                                                    new myPagination({
                                                                        id: 'fp_log_bar',
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
                                                            if(window.confirm('你确定要删除该发票记录吗')){
                                                                var id = $(e).attr("data-id");
                                                                $.ajax({
                                                                    type : 'get',
                                                                    url : "${pageContext.request.contextPath}/user/fp_log/del",
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
