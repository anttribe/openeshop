<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html lang="en_US">
    <head>
        <title><spring:message code="app.appname" /></title>
    </head>
    <body>
        <!--body wrapper start-->
        <div class="wrapper">
            <div class="row">
                <div class="col-sm-12">
                    <section class="panel">
                        <header class="panel-heading">
                            <div class="btn-group">
                                <button class="btn btn-primary add"><i class="fa fa-plus"></i> 新增</button>
                            </div>
                        </header>
                        <div class="panel-body">
                            <table id="payments-table" class="display table table-striped">
                                <thead>
                                    <tr>
                                        <th>名称</th>
                                        <th>编码</th>
                                        <th width="16%">是否可用</th>
                                        <th width="20%">操作</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:choose>
                                        <c:when test="${fn:length(PAGE_DATA) > 0}">
                                            <c:forEach var="payment" items="${PAGE_DATA}">
                                                <tr data-id="${payment.id}">
                                                    <td>
                                                        <c:choose>
                                                            <c:when test="${payment.icon != null and payment.icon != ''}">
                                                                <img class="thumbnail" src="${payment.icon}" />
                                                            </c:when>
                                                        </c:choose>
                                                        <span class="pl10"><c:out value="${payment.name}" /></span>
                                                    </td>
                                                    <td><c:out value="${payment.code}" /></td>
                                                    <td>
                                                        <c:choose>
                                                            <c:when test="${payment.enabled == 'YES'}">是</c:when>
                                                            <c:otherwise>否</c:otherwise>
                                                        </c:choose>
                                                    </td>
                                                    <td>
                                                        <button class="btn btn-success edit"><i class="fa fa-edit"></i> 编辑</button>
                                                        <button class="btn btn-danger remove"><i class="fa fa-trash-o"></i> 删除</button>
                                                    </td>
                                                 </tr>
                                             </c:forEach>
                                         </c:when>
                                     </c:choose>
                                 </tbody>
                             </table>
                         </div>
                    </section>
                </div>
            </div>
        </div>
        <!--body wrapper end-->
        
        <script type="text/javascript">
            $(function(){
    	        //新增
    	        $('.add').click(function(){console.log('scsc');
    		        location.href = contextPath + '/payment/add';
    	        });
            });
        </script>
    </body>
</html>