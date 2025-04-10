<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
    <title><spring:message code="login.title"/></title>
</head>
<body>
    <p>
        <spring:message code="login.title"/></title>
    </p>
    <p>
        <spring:message code="login.done"/></title>
    </p>
    <p>
        <a href="<c:url value='/main'/>">
        [<spring:message code="go.main"/>]
        </a>
    </p>
</body>
</html>
