<%@ page contentType="text/html; charset=utf-8" language="java"
	import="java.sql.*" errorPage=""%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isELIgnored="false"%>
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Home Page</title>
</head>

<body class="bodyCSS">
	<c:if test="${zeroSearchResults}">
		<h3 style="color: blue;">Your Search Did Not Produce Any Results.
			Please Modify Your Search And Try Again</h3>
	</c:if>

	<table border=1>
		<tr>

			<td width="200">
			<form:form method="post"
					action="displayQuestion.htm" commandName="question">

					<table>
						<tr>
							<td>Question</td>
							<td><form:label path="question" />
							</td>
						</tr>
						<tr>
							<td>Option 1</td>
							<td><form:label path="option1" />
							</td>
						</tr>
						<tr>
							<td>Option 2</td>
							<td><form:label path="option2" />
							</td>
						</tr>
						<tr>
							<td>Option 3</td>
							<td><form:label path="option3" />
							</td>
						</tr>
						<tr>
							<td>Option 4</td>
							<td><form:label path="option4" />
							</td>
						</tr>
						<tr>
							<td colspan="2"><label type="submit" value="submit" /></td>
						</tr>
					</table>
				</form:form>
			</td>
			<td><c:if test="${empty zeroSearchResults}">
					Sorry no questions...
				</c:if>
			</td>
		</tr>

	</table>
</body>
</html>