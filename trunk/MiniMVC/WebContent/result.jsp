<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Resultado da sua preferencia!</title>
</head>
<body>
<%
	List<String> result = (List<String>)request.getAttribute("sugestao");
	
	for(String temp : result){
		out.print("<br/>" + temp);
	}
%>
</body>
</html>