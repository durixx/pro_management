<%@ tag description="ESMO page template" pageEncoding="UTF-8" %>
<%@ tag trimDirectiveWhitespaces="true" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="rmt" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<%@ attribute name="head" fragment="true" %>

<!DOCTYPE html>
<html>
<head>
    <rmt:rmtHead></rmt:rmtHead>
</head>
<body>
<jsp:doBody/>
</body>
</html>