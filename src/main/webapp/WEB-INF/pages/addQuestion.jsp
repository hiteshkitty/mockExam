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
<title>Add a question</title>
</head>

<body class="bodyCSS">

	<table border=1>
		<tr>

			<td width="200"><form:form method="post"
					action="addQuestion.htm" commandName="question">

					<table>
						<tr>
							<td>Question</td>
							<td><form:input path="question" />
							</td>
						</tr>
						<tr>
							<td>Option 1</td>
							<td><form:input path="option1" />
							</td>
						</tr>
						<tr>
							<td>Option 2</td>
							<td><form:input path="option2" />
							</td>
						</tr>
						<tr>
							<td>Option 3</td>
							<td><form:input path="option3" />
							</td>
						</tr>
						<tr>
							<td>Option 4</td>
							<td><form:input path="option4" />
							</td>
						</tr>
						<tr>
							<td>Answer</td>
							<td><form:input path="answer" />
							</td>
						</tr>
						<tr>
							<td>Is Enabled</td>
							<td><form:checkbox path="isEnabled"></form:checkbox>
							</td>
						</tr>
						<tr>
							<td colspan="2"><input type="reset" value="Reset" /></td>
							<td colspan="2"><input type="submit" value="Add question" />
							</td>
						</tr>
					</table>
				</form:form>
			</td>

		</tr>

	</table>
</body>
</html>