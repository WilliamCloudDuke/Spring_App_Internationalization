<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add a Car</title>
</head>
<body>
	<form:form modelAttribute="car" action="cars" method="post">
		<form:errors path="*" cssClass="errorblock" element="div" />

		<table>
			<tr>
				<td>Title:</td>
				<td><form:input type="text" path="make" /></td>
				<td><form:errors path="make" cssClass="error" /></td>

			</tr>
			<tr>
				<td>ISBN:</td>
				<td><form:input type="text" path="model" /></td>
				<td><form:errors path="model" cssClass="error" /></td>

			</tr>
			<tr>
				<td>Author:</td>
				<td><form:input type="text" path="year" /></td>
				<td><form:errors path="year" cssClass="error" /></td>

			</tr>
			<tr>
				<td>Price:</td>
				<td><form:input type="text" path="color" /></td>
				<td><form:errors path="color" cssClass="error" /></td>

			</tr>
		</table>
		<input type="submit" />

	</form:form>
</body>
</html>