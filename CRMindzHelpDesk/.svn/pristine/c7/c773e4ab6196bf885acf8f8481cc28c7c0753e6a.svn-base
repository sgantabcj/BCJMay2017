<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>

	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Student Ticket Dashboard</title>
	
	<%@include file="common/head.jsp" %>

	<link rel="stylesheet" type="text/css" href='<c:url value="/resources/css/jquery-ui.css"/>'>
	<link rel="stylesheet" type="text/css" href='<c:url value="/resources/css/jquery-ui.theme.css"/>'>
	<link rel="stylesheet" type="text/css" href='<c:url value="/resources/css/jquery-ui.structure.min.css"/>'>
	<link rel="stylesheet" type="text/css" href='<c:url value="resources/css/ui.jqgrid.css"/>'>
	
	<script	src="https://cdnjs.cloudflare.com/ajax/libs/bootbox.js/4.4.0/bootbox.min.js"></script>
	<script src='<c:url value="/resources/js/jquery-ui.min.js"/>'></script>
	<script src='<c:url value="/resources/js/i18n/grid.locale-en.js"/>'></script>
	<script src='<c:url value="/resources/js/jquery.jqGrid.min.js"/>'></script>
	
	
	<style type="text/css">
		.margin-top {
			margin-top: 10px;
		}
		
		.margin-top-grid {
			margin-top: 30px;
		}
		
		footer.navbar-default.navbar-fixed-bottom {
			color: white;
		}
	</style>

</head>
<body>

	<%@include file="common/navbar.jsp" %>

	<!-- Success message after creating a new ticket -->
	<p class="text-success">${message}</p>

	<div id="ticket-grid" class="margin-top">

		<table id="ticket-list">
			<tr>
				<td />
			</tr>
		</table>
		<div id="ticket-pager"></div>
		<div class="margin-top">
			<a href="newTicket" class="btn btn-primary  btn-xs" role="button">NewTicket</a>
		</div>

	</div>

	<%@include file="common/footer.jsp" %>

	<script src='<c:url value="/resources/js/student-ticket-dashboard.js"/>'></script>

</body>
</html>