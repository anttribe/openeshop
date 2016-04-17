<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html lang="en_US">
    <head>
        <title><spring:message code="app.payment.title" /></title>
    </head>
    <body>
        <div class="clearfix"></div>
        <!--body wrapper start-->
        <div class="wrapper">
            <div class="row">
                <div class="col-sm-12">
                    <section class="panel">
                        <header class="panel-heading">
                            <spring:message code="app.payment.title.list" />
                            <span class="tools pull-right"></span>
                        </header>
                        <div class="panel-body">
                            <div class="btn-group mb10">
                                <a href="#none" class="btn btn-primary action-add"><i class="fa fa-plus"></i> <spring:message code="app.payment.action.add" /></a>
                            </div>
                            <div class="table-responsive">
                                <table id="category-table" class="table table-striped">
                                    <thead>
                                        <tr>
                                            <th><spring:message code="app.common.title.serial" /></th>
                                            <th><spring:message code="app.payment.title.name" /></th>
                                            <th><spring:message code="app.payment.title.code" /></th>
                                            <th width="16%"><spring:message code="app.common.action.operate" /></th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach var="payment" items="${PAGE_DATA}" varStatus="s">
	      	                                <tr data-id="${payment.id}">
	      	                                    <td><c:out value="${s.index + 1}" /></td>
				                                <td><img src="${payment.icon}"><span><c:out value="${payment.name}" escapeXml="true" /></span></td>
				                                <td><c:out value="${payment.code}" escapeXml="true"/></td>
				                                <td>
				                                    <button class="btn btn-success btn-sm action-edit"><i class="fa fa-edit"></i> <spring:message code="app.common.action.edit" /></button>
	                                                <button class="btn btn-danger btn-sm action-delete"><i class="fa fa-trash-o"></i>  <spring:message code="app.common.action.delete" /></button>
	                                            </td>
	                                        </tr>
	                                    </c:forEach>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </section>
                </div>
            </div>
        </div>
        <!--body wrapper end-->
        
        <script type="text/javascript">
            $(function(){
            	$('.action-add').click(function(e){
            		location.href = contextPath + '/payment/add';
            	});
            	$('.action-edit').click(function(e){
            		e.preventDefault();
                	
                	var nTr = $(this).parents('tr');
                	if(nTr){
                		var paymentId = $(nTr).attr('data-id');
                		if(paymentId){
                			location.href = '${contextPath}/payment/edit?id=' + paymentId;
                		}
                	}
            	});
            	$('.action-delete').click(function(e){
                	e.preventDefault();
                	
                	var nTr = $(this).parents('tr');
                	if(nTr){
                		var paymentId = $(nTr).attr('data-id');
                		if(paymentId){
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
                	                		url: '${contextPath}/payment/remove/exec',
                	                		data: {id: resourceId},
                	                		success: function(r){
                	                			var result = $.parseJSON(r);
                	                			if(result && result.resultCode){
                	        				    	if(result.resultCode == '000000'){
                	        				    		BootstrapDialog.alert({
                	        				    			type: BootstrapDialog.TYPE_SUCCESS,
                	        				    			message: '<spring:message code="app.common.title.success" />',
                	        				    			callback: function(){
                	        				    				location.href = '${contextPath}/payment/index';
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
            });
        </script>
    </body>
</html>