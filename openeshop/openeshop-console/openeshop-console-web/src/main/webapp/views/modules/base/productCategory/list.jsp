<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html lang="en_US">
    <head>
        <title><spring:message code="app.productCategory.title" /></title>
        <link rel="stylesheet" type="text/css" href="${contextPath}/assets/jquery-treetable/css/jquery.treetable.css" >
        <link rel="stylesheet" type="text/css" href="${contextPath}/static/css/jquery.treetable.theme.custom.css" >
    </head>
    <body>
        <div class="clearfix"></div>
        <!--body wrapper start-->
        <div class="wrapper">
            <div class="row">
                <div class="col-sm-12">
                    <section class="panel">
                        <header class="panel-heading">
                            <spring:message code="app.productCategory.title.list" />
                            <span class="tools pull-right"></span>
                        </header>
                        <div class="panel-body">
                            <div class="btn-group mb10">
                                <a href="#none" class="btn btn-primary action-add"><i class="fa fa-plus"></i> <spring:message code="app.productCategory.action.add" /></a>
                            </div>
                            <div class="table-responsive">
                                <table id="category-table" class="table table-striped">
                                    <thead>
                                        <tr>
                                            <th width="68%"><spring:message code="app.productCategory.title.name" /></th>
                                            <th><spring:message code="app.productCategory.title.isShow" /></th>
                                            <th><spring:message code="app.common.action.operate" /></th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:set var="categorys" value="${PAGE_DATA}" scope="request" />
                                        <c:import url="list-items.jsp" />
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </section>
                </div>
            </div>
        </div>
        <!--body wrapper end-->
        
        <script type="text/javascript" src="${contextPath}/assets/jquery-treetable/js/jquery.treetable.js"></script>
        <script type="text/javascript">
            $(function(){
            	$('.action-add').click(function(e){
            		location.href = contextPath + '/productCategory/add';
            	});
            	$('.action-edit').click(function(e){
            		e.preventDefault();
                	
                	var nTr = $(this).parents('tr');
                	if(nTr){
                		var categoryId = $(nTr).attr('data-tt-id');
                		if(categoryId){
                			location.href = '${contextPath}/productCategory/edit?id=' + categoryId;
                		}
                	}
            	});
            	$('.action-addChild').click(function(e){
            		e.preventDefault();
                	
                	var nTr = $(this).parents('tr');
                	if(nTr){
                		var categoryId = $(nTr).attr('data-tt-id');
                		if(categoryId){
                			location.href = '${contextPath}/productCategory/add?parent.id=' + categoryId;
                		}
                	}
            	});
            	$('.action-delete').click(function(e){
                	e.preventDefault();
                	
                	var nTr = $(this).parents('tr');
                	if(nTr){
                		var resourceId = $(nTr).attr('data-tt-id');
                		if(resourceId){
                			BootstrapDialog.confirm({
                				size: BootstrapDialog.SIZE_NORMAL,
                				type: BootstrapDialog.TYPE_WARNING,
                				draggable: true,
                				closable: true,
                	            title: '<spring:message code="app.resource.action.delete" />',
                	            message: '<spring:message code="app.resource.action.delete.confirm" />',
                	            callback: function(r) {
                	                if(r) {
                	                	$.ajax({
                	                		type: 'POST',
                	                		url: '${contextPath}/resource/remove/exec',
                	                		data: {id: resourceId},
                	                		success: function(r){
                	                			var result = $.parseJSON(r);
                	                			if(result && result.resultCode){
                	        				    	if(result.resultCode == '000000'){
                	        				    		BootstrapDialog.alert({
                	        				    			type: BootstrapDialog.TYPE_SUCCESS,
                	        				    			message: '<spring:message code="app.common.title.success" />',
                	        				    			callback: function(){
                	        				    				location.href = '${contextPath}/resource/index';
                	        				    			}
                	        				    		});
                	        				    	} else{
                	        				    		BootstrapDialog.alert({
                	        				    			type: BootstrapDialog.TYPE_WARNING,
                	        				    			message: '<spring:message code="app.errorNo.000001" />'
                	        				    		});
                	        				    	}
                	        				    } else{
                	        				    	BootstrapDialog.alert({
                	        				    		type: BootstrapDialog.TYPE_WARNING,
                	        				    		message: '<spring:message code="app.errorNo.000001" />'
                	    				    		});
                	        				    }
                	                		}
                	                	});
                	                }
                	            }
                	        });
                		}
                	}
            	});
            	
            	//treeTable
	        	$("#category-table").treetable({
	        		column: 0,
	        		expandable: true,
	        		stringExpand: '',
	        		stringCollapse: '',
	        		initialState: 'collapsed'  //expanded
	        	}).show();
            });
        </script>
    </body>
</html>