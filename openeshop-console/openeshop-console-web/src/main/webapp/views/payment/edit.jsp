<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html lang="en_US">
    <head>
        <title></title>
        <!--ios7-->
        <link rel="stylesheet" type="text/css" href="${contextPath}/static/assets/ios-switch/switchery.css" />
    </head>
    <body>
        <div class="clearfix"></div>
        <!--body wrapper start-->
        <div class="wrapper">
            <div class="row">
                <div class="col-sm-12">
                    <section class="panel">
                        <header class="panel-heading">
                            <span>新增支付方式</span>
                        </header>
                        <div class="panel-body">
                            <form role="form" class="form-horizontal" method="POST" action="${contextPath}/payment/edit/exec">
                                <input type="hidden" name="id" value="${PAGE_DATA.id}" />
                                <div class="form-group">
                                    <label for="name" class="col-lg-2 col-sm-2 control-label">名称</label>
                                    <div class="col-lg-8 col-sm-8">
                                        <input type="text" class="form-control" id="name" name="name" value="${PAGE_DATA.name}" placeholder="" />
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="code" class="col-lg-2 col-sm-2 control-label">编码</label>
                                    <div class="col-lg-8 col-sm-8">
                                        <input type="text" class="form-control" id="code" name="code" value="${PAGE_DATA.code}" placeholder="" />
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="config" class="col-lg-2 col-sm-2 control-label">配置</label>
                                    <div class="col-lg-8 col-sm-8">
                                        <textarea id="config" name="config" class="form-control" style="height: 120px;" placeholder="">${PAGE_DATA.config}</textarea>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="col-lg-offset-2 col-lg-8">
                                        <div class="well">
                                            <h3>配置信息说明</h3>
                                        </div>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="name" class="col-lg-2 col-sm-2 control-label">是否可用</label>
                                    <div class="col-lg-8 col-sm-8">
                                        <input type="checkbox" class="js-switch" checked />
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="col-lg-offset-2 col-lg-10">
                                        <button type="submit" class="btn btn-primary"><spring:message code="app.common.action.submit" /></button>
                                        <a href="${contextPath}/payment/index" class="btn btn-default"><spring:message code="app.common.action.cancel" /></a>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </section>
                </div>
            </div>
        </div>
        <!--body wrapper end-->
        
        <!--ios-switch-->
        <script type="text/javascript" src="${contextPath}/static/assets/ios-switch/switchery.js" ></script>
        <script type="text/javascript">
            $(function(){
            	$('.js-switch').each(function(i, item){
            		new Switchery(item);
            	});
            });
        </script>
    </body>
</html>