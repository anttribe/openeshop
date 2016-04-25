<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html lang="en_US">
    <head>
        <title><spring:message code="app.signup.title" /></title>
    </head>
    <body class="bg-color">
        <div class="row">
            <div class="col-lg-12">
                <div class="panel panel-color">
                    <div class="panel-body no-padding">
                        <form role="form" method="POST" action="">
                            <div id="wizard" class="wizard">
                                <ul class="steps">
                                    <li data-target="#step1" class="active">
                                        <span class="badge badge-info">1</span><spring:message code="app.signup.wizard.step1" />
                                    </li>
                                    <li data-target="#step2">
                                        <span class="badge">2</span><spring:message code="app.signup.wizard.step2" />
                                    </li>
                                    <li data-target="#step3">
                                        <span class="badge">3</span><spring:message code="app.signup.wizard.step3" />
                                    </li>
                                </ul>
                                <div class="actions btn-group">
                                </div>
                                <div class="step-content">
                                    <div class="step-pane active" id="step1">This is step 1</div>
                                    <div class="step-pane" id="step2">This is step 2</div>
                                    <div class="step-pane" id="step3">This is step 3</div>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <script>
        </script>
    </body>
</html>