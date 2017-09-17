<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Welcome to CRMindz Help Desk</title>
	
	<%@include file="common/head.jsp" %>
	
	<style>
		footer.navbar-default.navbar-fixed-bottom {
			color: white;
		}
	</style>

</head>

<body>

	<%@include file="common/navbar.jsp" %>

	<h2>welcome ${firstname}</h2>

	<%@include file="common/footer.jsp" %>

	<script type="text/javascript">
	
		//	making the home active
		document.onreadystatechange = function () {
			  if (document.readyState === "interactive") {
				  $("#nav-home").addClass('active');
				  $("#nav-login").hide();
				  $("#nav-register").hide();
			  }
			}
		
	</script>

</body>
</html>