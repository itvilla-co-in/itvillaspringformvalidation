<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<title>Employee Confirmation</title>
</head>
<body>
	
	The Employee  is confirmed: ${e1.empid}  ${e1.empname}  ${e1.empdept}
	</br>
	Employee selected country is ${e1.country}
	</br>
	Employee selected graduation  is ${e1.empgrad}
	
	</br>
	Employee family numbers are    ${e1.familymembers}
	
	<br><br>
	
	Employee postalCode is     ${e1.postalCode}

<br><br>
Favorite Language: ${e1.favoriteLanguage}

<br><br>

Known Languages :

<ul>
	
	<ul>
	<c:forEach var="temp" items="${e1.klang}">

		<li> Hello : ${temp} </li>

	</c:forEach>
</ul>
</ul>
	
	
	
</body>
</html>












