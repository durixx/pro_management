<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/views/include/taglibs.jsp" %>
<rmt:rmtPage>
    <c:url value="/login" var="loginUrl"/>
    <form action="${loginUrl}" method="post">

        <c:if test="${logout != null}">
            <p style="color: red;">
                    ${logout}
            </p>
        </c:if>
        <c:if test="${error != null}">
            <p style="color: red;">
                    ${error}
            </p>
        </c:if>
        <p>
            <label for="username">Meno</label>
            <input type="text" id="username" name="username"/>
        </p>
        <p>
            <label for="password">Heslo</label>
            <input type="password" id="password" name="password"/>
        </p>
        <input type="hidden"
               name="${_csrf.parameterName}"
               value="${_csrf.token}"/>
        <button type="submit" class="btn">Prihlásiť</button>
    </form>
</rmt:rmtPage>