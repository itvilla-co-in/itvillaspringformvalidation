<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
	<title>Employee Registration Form</title>
	<style>
		.error {color:red}
	</style>
	
</head>
<body>
	<form:form action="processForm" modelAttribute="e1">
		Employee ID : <form:input path="empid" />
		<form:errors path="empid" cssClass="error" />
		<br><br>
		Employee  name: <form:input path="empname" />
		<form:errors path="empname" cssClass="error" />	
		<br><br>
		Employee  Department : <form:input path="empdept" />
		<br><br>
		Employee  familymembers number : <form:input path="familymembers" />
		<form:errors path="familymembers" cssClass="error" />
<br><br>

Employee  postalCode : <form:input path="postalCode" />
		<form:errors path="postalCode" cssClass="error" />
		
		<br><br>
		<form:select path="country">
<form:option value="Brazil" label="Brazil" />
<form:option value="France" label="France" />
<form:option value="Germany" label="Germany" />
<form:option value="India" label="India" />
</form:select>
		<br><br>
		<form:select path="empgrad">
		<form:options items="${e1.gradopt}" />
		</form:select>
		<br><br>
		
<br><br>

		Favorite Language:
		
		Java <form:radiobutton path="favoriteLanguage" value="Java" />
		C# <form:radiobutton path="favoriteLanguage" value="C#" />
		PHP <form:radiobutton path="favoriteLanguage" value="PHP" />
		Ruby <form:radiobutton path="favoriteLanguage" value="Ruby" />

		<br><br>
		
			<br><br>

		Known Languages:
		
		Java <form:checkbox path="klang" value="java" />
		J2EE <form:checkbox path="klang" value="j2ee" />
		C# <form:checkbox path="klang" value="c#" />
		.NET <form:checkbox path="klang" value="net" />
		COBOL <form:checkbox path="klang" value="cobol" />

		<br><br>
		
		
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>












