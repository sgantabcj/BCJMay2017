<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Registration</title>
	
	<%@include file="common/head.jsp" %>
	
	
	<style type="text/css">
		body {
			background-color: #525252;
			margin-bottom: 50px;
		}
		
		.centered-form .panel {
			background: rgba(255, 255, 255, 0.8);
			box-shadow: rgba(0, 0, 0, 0.3) 20px 20px 20px;
		}
		
		
		.light-font {
			color: #cccccc;
		}
		
		footer.navbar-default.navbar-fixed-bottom {
			color: white;
		}
		
		#username-validationo-msg{
			display : none
		}
		
		
		.center-block{
			float		: none;
			display		: block;
			margin-left	: auto;
			margin-right: auto;
			width		: 55%;
		}
	</style>
</head>
<body>

	<%@include file="common/navbar.jsp" %>

		<div class="container">
			<div class="row centered-form">
				<div class="col-xs-12 col-sm-8 col-md-9 col-lg-7 center-block">
					<div class="panel-group">
						<form:form role="form" id="registerForm" modelAttribute="user"
							action="RegisterProcess" method="POST">

							<h1 class="panel-title text-center light-font lead">
								<b>Signup for CRMindz Help Desk</b>
							</h1>
							<div class="panel panel-default">
								<div class="panel-heading"><strong>Personal Details</strong></div>
								<div class="panel-body">

									<div class="row">
										<div class="form-group col-xs-6 col-sm-6 col-md-9 col-lg-5">
											<form:input type="text" name="first_name" id="first_name"
												class="form-control input-sm" placeholder="First Name"
												path="firstName" />
										</div>
										<div class="form-group col-xs-6 col-sm-6 col-md-9 col-lg-5">
											<form:input type="text" name="last_name" id="last_name"
												class="form-control input-sm" placeholder="Last Name"
												path="lastName" />
										</div>
									</div>

									<div class="form-group">
										<form:input type="email" name="email" id="email"
											class="form-control input-sm" placeholder="Email Address"
											path="email" />
									</div>

									<div class="form-group">
										<form:input type="number" name="phone" id="phone" size="10"
											class="form-control input-sm" placeholder="phone"
											path="phone" />
									</div>

								</div>
							</div>

							<div class="panel panel-default">
								<div class="panel-heading"><strong>Address Details</strong></div>
								<div class="panel-body">

									<div class="form-group">
										<form:input type="text" name="address_line_1"
											id="address_line_1" class="form-control input-sm"
											placeholder="Address Line 1" path="address.addressLine1" />
									</div>

									<div class="form-group">
										<form:input type="text" name="address_line_2"
											id="address_line_2" class="form-control input-sm"
											placeholder="Address Line 2" path="address.addressLine2" />
									</div>

									<div class="form-group ">
										<div class="row">
											<div class="form-group col-xs-6 col-sm-6 col-md-9 col-lg-4">
												<form:input type="text" name="city" id="city"
													class="form-control input-sm" placeholder="City"
													path="address.city" />
											</div>
											<div class="form-group col-xs-6 col-sm-6 col-md-9 col-lg-4">
												<form:select class="selectpicker form-control"
													title="states" name="states" id="states"
													path="address.state">
													${states}
											  	</form:select>
											</div>
											<div class="form-group col-xs-6 col-sm-6 col-md-9 col-lg-4">
												<form:input type="number" name="zip" id="zip" size="8"
													class="form-control input-sm" placeholder="Zip"
													path="address.zip" />
											</div>
										</div>
									</div>
								</div>
							</div>

							<div class="panel panel-default">
								<div class="panel-heading"><strong>User Details</strong></div>
								<div class="panel-body">
									<p id="username-validationo-msg" class="text-danger"></p>
									<div class="row">
										<div class="form-group col-xs-6 col-sm-6 col-md-9 col-lg-5">
											<form:input type="text" name="username" id="username"
												class="form-control input-sm" placeholder="Username"
												path="login.username" />
										</div>
										<div class="form-group col-xs-6 col-sm-6 col-md-9 col-lg-5">
											<form:input type="password" name="password" id="password"
												class="form-control input-sm" placeholder="Password"
												path="login.password" />
										</div>
									</div>

									<div class="form-group">
										<form:select class="selectpicker form-control"
											title="User type" name="user-type" id="user-type"
											path="userType">
											    ${usertypes}
									  	</form:select>
									</div>
									<input type="submit" value="Register" class="btn btn-info btn-block submit-btn"/>
								</div>
							</div>

						</form:form>
					</div>

				</div>
			</div>
		</div>

	</div>

	<%@include file="common/footer.jsp" %>
	
	<script>
		//	hiding the logout and making the register active
		$(document).ready(function(){
			$("#nav-register").addClass('active');
			$("#nav-logout").hide();
		});
		
	</script>
	
	<!-- To validate username -->
	<script src='<c:url value="/resources/js/username-validate.js"/>'></script>
	
</body>
</html>