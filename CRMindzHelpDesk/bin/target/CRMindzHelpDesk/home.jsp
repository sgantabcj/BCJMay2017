<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html PUBLIC>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Home</title>

	<%@include file="jsp/common/head.jsp" %>

	<style>
		footer.navbar-default.navbar-fixed-bottom {
			color: white;
		}
	</style>

</head>
<body>

	<%@include file="jsp/common/navbar.jsp" %>
		
	<div class="jumbotron">
		<h1>Welcome to CRMindz Help Desk</h1>
		<p>This application will help you to generate and manage tickets</p>
	</div>

	<%@include file="jsp/common/footer.jsp" %>

	<script type="text/javascript">

		//	hiding logout and making the home active
		document.onreadystatechange = function () {
			  if (document.readyState === "interactive") {
				  $("#nav-home").addClass('active');
				  $("#nav-logout").hide();
			  }
			}
	
	</script>
</body>
</html>