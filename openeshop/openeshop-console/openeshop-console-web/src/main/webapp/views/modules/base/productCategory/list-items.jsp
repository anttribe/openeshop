<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"  %>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<c:forEach items="${categorys}" var="category">
    <tr data-tt-id="${category.id}" data-tt-parent-id="${category.parent.id}" data-tt-branch="${fn:length(category.children) > 0}">
        <td><c:if test="${category.picture != null and picture.icon != ''}"></c:if> <c:out value="${category.name}" /></td>
        <td><spring:message code="app.common.type.YesOrNo.${category.isShow}" text="" /></td>
        <td>
            <a href="javascript:;" class="btn btn-success btn-sm action-edit"><i class="fa fa-edit"></i> <spring:message code="app.common.action.edit" /></a>
            <a href="javascript:;" class="btn btn-success btn-sm action-addChild"><i class="fa fa-list-alt"></i> <spring:message code="app.productCategory.action.addChild" /></a>
            <a href="javascript:;" class="btn btn-danger btn-sm action-delete"><i class="fa fa-trash-o"></i> <spring:message code="app.common.action.delete" /></a>
        </td>
    </tr>
    <c:if test="${fn:length(category.children) > 0}">
        <c:set var="categorys" value="${category.children}" scope="request" />
        <c:import url="list-items.jsp" />
    </c:if>
</c:forEach>