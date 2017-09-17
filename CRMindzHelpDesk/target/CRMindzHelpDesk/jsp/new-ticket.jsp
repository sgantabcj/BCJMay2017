<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>New Ticket</title>
	
	<%@include file="common/head.jsp" %>
		
	<style type="text/css">
		body {
			background-color: #525252;
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
		
		
		.center-block{
			float		: none;
			display		: block;
			margin-left	: auto;
			margin-right: auto;
			width		: 50%;
		}
	</style>
</head>
<body>

	<%@include file="common/navbar.jsp" %>

	<div class="container">
		<div class="row centered-form">
			<div class="col-xs-12 col-sm-8 col-md-9 col-lg-7 center-block">
				<form:form role="form" id="ticketForm" modelAttribute="ticket"
					action="CreateTicket" method="POST">

					<div class="panel panel-default">
						<div class="panel-heading text-center">
							<strong>Create a new ticket</strong>
						</div>
						<div class="panel-body">

							<p class="text-danger text-center">${message}<p>
							<div class="row">
								<div class="form-group col-xs-6 col-sm-6 col-md-9 col-lg-5">
									<form:select class="selectpicker form-control"
										title="Ticket Type" name="ticketType" id="ticket-type"
										path="ticketType">
													${ticketTypes}
								  	</form:select>
								</div>
								<div class="form-group col-xs-6 col-sm-6 col-md-9 col-lg-5">
									<form:select class="selectpicker form-control"
										title="Ticket Subtype" name="ticketSubtype" id="ticket-subtype"
										path="ticketSubtype">
									</form:select>
								</div>
							</div>

							<div class="form-group">
								<form:textarea form="ticketForm" name="ticketDescription"
									id="ticket-desc" class="form-control input-sm text-area-size"
									placeholder="Please enter ticket description in less than 200 characters..." path="ticketDesc"></form:textarea>
							</div>
							<input type="submit" value="Create ticket" class="btn btn-info btn-block submit-btn"/>
						</div>
					</div>

				</form:form>

			</div>
		</div>
	</div>

	<%@include file="common/footer.jsp" %>

	
	<script type="text/javascript">
	
	//	hiding logout, login
	document.onreadystatechange = function () {
		  if (document.readyState === "interactive") {
			  $("#nav-login").hide();
			  $("#nav-register").hide();
		  }
		}
	
		$("#ticket-type").change(function(){
			if($("#ticket-type option:selected").text() == "Other"){
				$("#ticket-subtype").append($("<option></option").attr("value","Other").text("Other")).prop("selected",true).hide();
			}else{
				$("#ticket-subtype").show();
				var categoryId = $("#ticket-type").val();
				$.ajax({
					url			: "getTicketSubtypes",
					method		: "GET",
					data		: {"categoryId" : categoryId},
					contentType	: "text/plain",
					dataType	: "text",
					success		: function(response){
									$("#ticket-subtype").html(response);
								}
				});
			}
		})
	</script>
	
</body>
</html>