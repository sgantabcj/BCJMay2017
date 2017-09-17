<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Login</title>
	
	<%@include file="common/head.jsp" %>
	
	<style>
	html, body {
		background-color: #525252;
		height: 100%;
		padding-bottom: 50px;
	}
	
	footer.navbar-default.navbar-fixed-bottom {
		color: white;
	}
	
	.center-block{
		float		: none;
		display		: block;
		margin-left	: auto;
		margin-right: auto;
		width		: 45%;
	}
	
	.center-element {
	  .center-block();
	}
	
	.panel{
		box-shadow: 20px 20px 20px rgba(0, 0, 0, 0.3);
	}
	
</style>
</head>

<body>

	<%@include file="common/navbar.jsp" %>
	
	<div class="container">
		<div class="centered-form">
			<div class="col-xs-12 col-sm-8 col-md-9 col-lg-6  center-block">
				<div class="panel panel-default">
					<div class="panel-heading lead">Login Details</div>
					<div class="panel-body">
						<form:form role="form" id="loginForm" modelAttribute="loginAttr"
							action="loginPorcess" method="POST">
							<div class="form-group">
								<label>Username</label>
								<form:input type="text" name="username" id="username"
									class="form-control input-sm" placeholder="Username"
									path="username" />
							</div>
							<div class="form-group">
								<label>Password</label>
								<form:input type="password" name="password" id="password"
									class="form-control input-sm" placeholder="Password"
									path="password" />
							</div>
							<p>
								<span style="color: red">${message}</span>
							</p>
							<button class="btn btn-info btn-block submit-btn"><strong>Login</strong></button>
						</form:form>
							<a class="text-center text-info center-block " href="register"><strong>Create an account</strong></a>
					</div>
				</div>
			</div>
		</div>
	</div>

	<%@include file="common/footer.jsp" %>
	
	<script>
	
		//	hiding the logout and making the login active
		document.onreadystatechange = function () {
			  if (document.readyState === "interactive") {
				  $("#nav-login").addClass('active');
				  $("#nav-logout").hide();
			  }
			}
		
	</script>
</body>
</html>