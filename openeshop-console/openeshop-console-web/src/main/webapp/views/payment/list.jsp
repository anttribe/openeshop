<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html lang="en_US">
    <head>
        <title><spring:message code="app.appname" /></title>
        <link rel="stylesheet" type="text/css" href="${contextPath}/static/assets/adminEx/js/data-tables/DT_bootstrap.css" >
    </head>
    <body>
        <!--body wrapper start-->
        <div class="wrapper">
            <div class="row">
                <div class="col-sm-12">
                    <div class="clearfix">
                        <div class="btn-group">
                            <button class="btn btn-primary add"><i class="fa fa-plus"></i> 新增</button>
                        </div>
                    </div>
                    <div class="adv-table clearfix">
                        <table id="payments-table" class="display table table-striped">
                            <thead>
                                <tr>
                                    <th>名称</th>
                                    <th>编码</th>
                                    <th>是否可用</th>
                                    <th>操作</th>
                                </tr>
                            </thead>
                            <tbody>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
        <!--body wrapper end-->
        
        <script type="text/javascript" src="${contextPath}/static/assets/jquery-datatable/js/jquery.dataTables.min.js"></script>
        <script type="text/javascript" src="${contextPath}/static/assets/adminEx/js/data-tables/DT_bootstrap.js"></script>
        <script type="text/javascript">
            $(function(){
    	        //新增
    	        $('.add').click(function(){console.log('scsc');
    		        location.href = contextPath + '/payment/add';
    	        });
    	
    	        $('#payments-table').dataTable({
    		        'bAutoWidth': true,
				    'bStateSave': true,
	        	    'aoColumnDefs': [
	        	    ],
        	        'bSort': false,
				    'bFilter': false,
    		        'oLanguage': {
    		            'sUrl': contextPath + '/static/static/i18n/datatable_zh_CN.txt'
    		        },
    		        bRowDetail: true
    	        });
            });
        </script>
    </body>
</html>