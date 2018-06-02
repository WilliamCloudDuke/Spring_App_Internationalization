<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add a Book</title>
</head>
<body>
	<form:form modelAttribute="book" action="books" method="post">
		<form:errors path="*" cssClass="errorblock" element="div" />

		<table>
			<tr>
				<td>Title:</td>
				<td><form:input type="text" path="title" /></td>
				<td><form:errors path="title" cssClass="error" /></td>

			</tr>
			<tr>
				<td>ISBN:</td>
				<td><form:input type="text" path="ISBN" /></td>
				<td><form:errors path="ISBN" cssClass="error" /></td>

			</tr>
			<tr>
				<td>Author:</td>
				<td><form:input type="text" path="author" /></td>
				<td><form:errors path="author" cssClass="error" /></td>

			</tr>
			<tr>
				<td>Price:</td>
				<td><form:input type="text" path="price" /></td>
				<td><form:errors path="price" cssClass="error" /></td>

			</tr>
		</table>
		<input type="submit" />

	</form:form>
</body>
</html>