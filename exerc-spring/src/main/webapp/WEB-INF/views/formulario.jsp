<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Conversor de Dolar</title>
</head>
<body>
	
	<form:form method="POST" modelAttribute="conversor" action="formulario">
		<p>Valor em Real para Conversão: <form:input path="real" /></p>
		<p>Valor Dolar Atual: <form:input path="dolar" /></p>
		
		<p><input type="submit" value="Converter"></p>
		<p>${mensagem}</p>
	</form:form>

</body>
</html>