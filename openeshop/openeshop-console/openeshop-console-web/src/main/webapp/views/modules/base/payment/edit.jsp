<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html lang="en_US">
    <head>
        <title><spring:message code="app.payment.title" /></title>
        <link rel="stylesheet" type="text/css" href="${contextPath}/static/css/jquery.validation.css" />
    </head>
    <body>
        <div class="clearfix"></div>
        <div class="wrapper">
            <div class="row">
                <div class="col-sm-12">
                    <section class="panel">
                        <header class="panel-heading">
                            <span><spring:message code="app.payment.title" /></span>
                        </header>
                        <div class="panel-body">
                            <form class="data-form form-horizontal" role="form" method="POST" action="">
                                <input type="hidden" name="id" value="${PARAM.id}" />
                                <div class="form-group">
                                    <label for="name" class="col-lg-2 col-sm-2 control-label"><spring:message code="app.payment.title.name" /></label>
                                    <div class="col-lg-8 col-sm-8">
                                        <input type="text" id="name" name="name" value="<c:out value="${PARAM.name}" />" class="form-control required" maxLength="30" placeholder="<spring:message code="app.payment.placeholder.name" />">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="code" class="col-lg-2 col-sm-2 control-label"><spring:message code="app.payment.title.code" /></label>
                                    <div class="col-lg-8 col-sm-8">
                                        <input type="text" id="code" name="code" value="<c:out value="${PARAM.code}" />" class="form-control required" maxLength="30" placeholder="<spring:message code="app.payment.placeholder.code" />">
                                    </div>
                                </div>
                                <div class="form-group">
				                    <label class="col-lg-2 col-sm-2 control-label" for="config"><spring:message code="app.payment.title.config" /></label>
				                    <div class="col-lg-8 col-sm-8">
				                        <textarea id="config" name="config" placeholder="" class="form-control" style="height: 180px;"></textarea>
				                    </div>
				                </div>
			                    <div class="form-group">
				                    <label class="col-lg-2 col-sm-2 control-label" ></label>
				                    <div class="col-lg-8 col-sm-8"></div>
				                </div>
                                <div class="form-group">
                                    <div class="col-lg-offset-2 col-sm-offset-2 col-lg-10 col-sm-10">
                                        <button type="submit" class="btn btn-primary action-submit"><spring:message code="app.common.action.submit" /></button>
                                        <a href="#none" class="btn btn-default action-cancel"><spring:message code="app.common.action.cancel" /></a>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </section>
                </div>
            </div>
        </div>
        
        <script type="text/javascript" src="${contextPath}/assets/jquery-validation/jquery.validate.min.js"></script>
        <script type="text/javascript" src="${contextPath}/assets/jquery-validation/localization/messages_zh.min.js"></script>
        <script type="text/javascript" src="${contextPath}/assets/jquery.form/jquery.form.js"></script>
        <script type="text/javascript" src="${contextPath}/assets/jquery.icheck/jquery.icheck.min.js"></script>
        <script type="text/javascript">
	        $(function(){
	        	$('.action-cancel').click(function(){
	        		location.href = contextPath + '/payment';
	        	});
	        	
	        	$('.data-form').validate({
	        		submitHandler: function(f){
	        			$(f).ajaxSubmit({
	        				type: 'POST',
	        				url: '${contextPath}/payment/edit/exec',
	        				success: function(r){
	        					if(r){
	        						var result = $.parseJSON(r);
	        						if(result && result.resultCode == '000000'){
	        							location.href = '${contextPath}/payment';
	        						}
	        					}
	        				}
	        			});
	        		}
	        	});
	        });
	    </script>
	    
    </body>
</html>