<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/views/include/taglibs.jsp" %>
<rmt:rmtPage>
    dasdasd
    <c:url value="/login" var="loginUrl"/>
    <form action="${loginUrl}" method="post">
        <input id="username" class="input-sm input" type="text" placeholder="prihlasovacie meno" style="border-color: #1F335B; margin-top: 30px; width: 90%">
        <input id="password" type="password" class="input-sm input" type="text" placeholder="prihlasovacie heslo" style="border-color: #1F335B; margin-top: 30px; width: 90%">
        <input type="hidden"
               name="${_csrf.parameterName}"
               value="${_csrf.token}"/>
        <button type="submit" class="btn btn-block" style="width: 89%; margin-top: 25px; background-color: #1F335B; color: white; margin-bottom: 20px">PRIHLÁSIŤ</button>
    </form>
</rmt:rmtPage>