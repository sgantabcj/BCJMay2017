<% String[] s = (String[])request.getAttribute("s"); %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Welcome user...<br/> Your account no is:<%= s[0]%> </h2> <%-- <%=request.getAttribute("accNum") %> --%>
	<h2>Your ticket no is: <%= s[1] %></h2><!-- =request.getAttribute("ticNum") -->
	<h2>Your itinerary is: <br/>  <!-- Origin: =request.getParameter("origin") -->
		<br/> Destination: <%=request.getParameter("destination") %> 
		<br/> Depart-date: <%=request.getParameter("depart-date") %>
		<br/> Depart-time: <%=request.getParameter("depart-time") %></h2>
</body>
</html>