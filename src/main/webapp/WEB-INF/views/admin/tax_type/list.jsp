<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<c:set var="uri" value="${pageContext.request.contextPath}" />
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>税务类型</title>
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
                <h3>税务类型</h3>
                <div>
                
                <div style="display:inline">
                <p style="display:inline-block;margin-top:30px">
                <span style="margin-left:20px;">类型名</span>
                <input type="text" class="inpMain" style="color:black;width:250px;"  placeholder="请输入类型名进行查询" id="typeName" />
                </p>
                </div>
                
                <div style="display:inline">
                <p style="display:inline-block;margin-top:30px">
                <a href="javascript:;"  class="btnGreen" onclick="ajaxList(1);" style="margin-left:30px;">查询</a>
                </p>
                </div>
                
                </div>
                <div style="margin-left:20px;margin-top:10px;">
                <a href="${pageContext.request.contextPath}/admin/tax_type/add" class="btnGreen">新增</a>
                    
                    </div>
                    
                    <div style="height:10px"></div>
                    <table width="100%" border="0" cellpadding="8" cellspacing="0" class="tableBasic"  style="">
                    
                    <thead>
                    <tr>
                    <th>类型名</th>
                    <th style="width:200px;">操作</th>
                    
                    </tr>
                    </thead>
                    <tbody id="tax_type_body">
                    
                    </tbody>
                    </table>
                    <div id="tax_type_bar" class="pagination" style="margin-top:20px;"></div>
                    
                    <div class="action">
                    
                    </div>
                    </div>
                    
                    
                    
                    <script type="text/javascript" src="${pageContext.request.contextPath}/static/common/jquery-1.11.1.min.js"></script>
                        <script type="text/javascript" src="${pageContext.request.contextPath}/static/common/page/myPagination.js"></script>
                            <script type="text/javascript" src="${pageContext.request.contextPath}/static/admin/js/modal_js.js"></script>
                                
                                
                                
                                
                                
                                <script type="text/javascript" src="${pageContext.request.contextPath}/static/common/utils/listutils.js?v=2063"></script>
                                    
                                    
                                    
                                    <script type="text/javascript">
                                    
                                    $(function(){
                                        
                                        ajaxList(1);
                                        
                                        
                                    });
                                    
                                    function ajaxList(page) {
                                        var typeName = $("#typeName").val();
                                        
                                        
                                        showLoading('${pageContext.request.contextPath}/static/common/loading.gif');
                                            $.ajax({
                                                type : 'get',
                                                url : "${pageContext.request.contextPath}/admin/tax_type/queryList",
                                                    data : {
                                                        
                                                        "page":page,
                                                        "typeName":typeName
                                                        
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
                                                            var typeNameVal=setNullToEmpty(rows[i].taxType.typeName);
                                                            html+='<td>'+ typeNameVal+'</td>';
                                                            html+='<td>';
                                                            html+='<a href="${pageContext.request.contextPath}/admin/tax_type/update?id='+rows[i].taxType.id+'" class="btn btnStyle">修改</a>';
                                                                html+='<a href="javascript:void(0)" onclick="del(this)" data-id="'+rows[i].taxType.id+'" class="btnPayment btnStyle">删除</a>';
                                                                html+='</td>';
                                                                html+='</tr>';
                                                            }
                                                            if (rows.length == 0) {
                                                                html += '<tr><td></td><td>无数据</td></tr>';
                                                            }
                                                            $("#tax_type_body").html(html);
                                                            
                                                            
                                                            new myPagination({
                                                                id: 'tax_type_bar',
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
                                                    if(window.confirm('你确定要删除该税务类型吗')){
                                                        var id = $(e).attr("data-id");
                                                        $.ajax({
                                                            type : 'get',
                                                            url : "${pageContext.request.contextPath}/admin/tax_type/del",
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
