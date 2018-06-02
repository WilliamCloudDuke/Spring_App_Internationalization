<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<body>
<h1>WELCOME with Internationalization</h1>

Language : <a href="?language=en">English</a>|<a href="?language=es">Español</a>

<h2> 
<spring:message code="label.welcome" text="default text" /> <br>
<spring:message code="label.selectOne" text="default text" /> <br>
<spring:message code="label.cars" text="default text" /> <br>
<spring:message code="label.books" text="default text" /> <br>
</h2>

<b>Current Locale : ${pageContext.response.locale} </b>
</body>
</html>