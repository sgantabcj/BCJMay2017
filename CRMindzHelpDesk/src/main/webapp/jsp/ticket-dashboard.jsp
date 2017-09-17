<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Ticket Dashboard</title>
	
	<%@include file="common/head.jsp" %>
	
	<link rel="icon" type="image/png" href='<c:url value="/resources/images/fav_icon.png"/>'>
	<link rel="stylesheet" type="text/css" href='<c:url value="/resources/css/jquery-ui.css"/>'>
	<link rel="stylesheet" type="text/css" href='<c:url value="/resources/css/jquery-ui.theme.css"/>'>
	<link rel="stylesheet" type="text/css" href='<c:url value="/resources/css/jquery-ui.structure.min.css"/>'>
	<link rel="stylesheet" type="text/css" href='<c:url value="resources/css/ui.jqgrid.css"/>'>
	
	
	<!-- Latest compiled and minified JavaScript -->
	<script	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<!-- Bootbox JavaScript for prompt window support -->
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

	<p class="text-success">${message}
	<p>
	<div id="pending-ticket-grid" class="margin-top">

		<table id="pending-ticket-list">
			<tr>
				<td />
			</tr>
		</table>
		<div id="pending-ticket-pager"></div>
		<div class="margin-top">
			<input type="button" class="btn btn-primary btn-xs"
				id="accept-selected-pending-tickets" value="Accept" /> 
			<input type="button" class="btn btn-primary  btn-xs"
				id="reject-selected-pending-tickets" value="Reject" />
		</div>

	</div>

	<div class="form-content" style="display: none;" id="form-content">
		<form id="comments-form" class="form" role="form">
			<div class="form-group">
				<label for="ticket-comments">Ticket Comments:</label>
				<textarea class="form-control" form="comments-form"
					id="ticket-comments"></textarea>
			</div>
		</form>
	</div>

	<div id="approved-ticket-grid" class="margin-top-grid">

		<table id="approved-ticket-list">
			<tr>
				<td />
			</tr>
		</table>
		<div id="approved-list-pager"></div>

	</div>


	<div id="rejected-ticket-grid" class="margin-top-grid">

		<table id="rejected-ticket-list">
			<tr>
				<td />
			</tr>
		</table>
		<div id="rejected-list-pager"></div>

	</div>

	<%@include file="common/footer.jsp" %>


<script>

//	making the ticket dashboard active
document.onreadystatechange = function () {
	
	  if (document.readyState === "interactive") {
		  $("#nav-ticket-dashboard").addClass('active');
		  $("#nav-login").hide();
		  $("#nav-register").hide();
	  }

}
	
/* Pending Tickets data grid */
$(document).ready(function(){
	$("#pending-ticket-list").jqGrid({
            url 		: "fetchPendingTickets",
            datatype 	: "json",
            mtype 		: 'POST',
            colNames 	: [ 'Ticket Id','Ticket Type','Ticket Subtype','Ticket Status','Ticket Description'],
            colModel 	: [ {
			                        name		: 'ticketId',
			                        index 		: 'ticketId',
			                        width 		: 100
			                }, {
			                        name 		: 'ticketType',
			                        index 		: 'ticketType',
			                        width 		: 150,
			                        editable 	: false
			                }, {
			                        name 		: 'ticketSubtype',
			                        index 		: 'ticketSubtype',
			                        width 		: 150,
			                        editable 	: false
			                },{
			                		name 		: 'ticketStatus',
			                		index 		: 'ticketStatus',
			                		width 		: 150,
			                		editable 	: false
			                },{
			                		name 		: 'ticketDesc',
			                		index 		: 'ticketDesc',
			                		width 		: 300,
			                		editable	: false
			                }],
            pager 		: '#pending-ticket-pager',
            rowNum 		: 5,
            height		: 'auto',
            rowList 	: [ 5,10,20 ],
            sortname 	: 'ticketId',
            sortorder 	: 'desc',
            viewrecords : true,
            gridview 	: true,
            multiselect	: true,
      		multiboxonly: false,
            caption		: 'Pending Tickets',
            jsonReader 	: {
		                        repeatitems 	: false,
		                }
    });
	
    $("#pending-ticket-list").jqGrid('navGrid', '#pending-ticket-pager', {
            edit 		: false,
            add 		: false,
            del 		: false,
            search 		: false
    });
    
	/* Changing the status of ticket to approved */
	$('#accept-selected-pending-tickets').on('click',function(){
		var selRowArr = $("#pending-ticket-list").getGridParam('selarrrow');
		var selTicketsArr = [];
		for(var i=0;i<selRowArr.length;i++){
			var ticketDetails = {};
			
			var rec = $("#pending-ticket-list").jqGrid('getRowData',selRowArr[i]);
			ticketDetails.ticketId = rec.ticketId;
			alert(rec.ticketId);
			
			bootbox.prompt({
			    title		: "Please enter comments for ticket - "+ticketDetails["ticketId"],
			    inputType	: 'textarea',
			    callback	: function(result){
			    	
		        		    	ticketDetails.ticketComments = result;
		        		    	
		        		    	if(result!=null){
		        		    		
			        		    	$.ajax({
				    	        		url			: "approveTicket",
				    	        		method		: "POST",
				    	        		contentType	: "application/json",
				    	        		data		: JSON.stringify(ticketDetails),
				    	        		dataType	: 'text',
				    	        		statusCode	: {
							    	    		    	404	: function() {
								    	        		      alert( "page not found" );
								    	        		    },
							    	        		    200	: function(){
								    	    		    	 alert( "success in updating ticket: "+ticketDetails["ticketId"]);
								    	        		    }
							    	    		 	 },	
				    	        		success		: function(response){
							    	        			$('#pending-ticket-list').trigger( 'reloadGrid' );
							    	        			$('#approved-ticket-list').trigger( 'reloadGrid' );
							    	        		},
				    	        		error		: function(){
							    	        			alert("Unsuccessful in approving tickets");
								    	        		}
				    	        		});
			        		    		
			        		    	}
				        		    	
			        		    }
	    		    
	    		});
	    	
	    	}	
    });
	


	/* Changing the status of the ticket to rejected */
	$('#reject-selected-pending-tickets').on('click',function(){
	    	
		var selRowArr = $("#pending-ticket-list").getGridParam('selarrrow');
		var rejectedTicketsArr = [];
		
		for(var i=0;i<selRowArr.length;i++){
			
			var ticketDetails = {};
			var rec = $("#pending-ticket-list").jqGrid('getRowData',selRowArr[i]);
			ticketDetails.ticketId = rec.ticketId;
			alert(rec.ticketId);
			
			bootbox.prompt({
			    
				title		: "Please enter comments for ticket - "+ticketDetails["ticketId"],
			    inputType	: 'textarea',
			    callback	: function(result){
    							
		        		    	ticketDetails.ticketComments = result;
		        		    	
		        		    	if(result!=null){
		        		    		
		        		    		$.ajax({
		        		        		url			: "rejectTicket",
		        		        		method		: "POST",
		        		        		contentType	: "application/json",
		        		        		data		: JSON.stringify(ticketDetails),
		        		        		dataType	: 'text',
		        		        		statusCode	: {
					        	        		    	404	: function() {
						        		        		      alert( "page not found" );
						        		        		    },
					        		        		    200	:function(){
						        	        		    	 alert( "success");
						        		        		    }
					        	        		 	 },	
		        		        		success		: function(response){
					        		        			$('#pending-ticket-list').trigger( 'reloadGrid' );
					        		        			$('#rejected-ticket-list').trigger( 'reloadGrid' );
					        		        		},
		        		        		error		: function(){
					        		        			alert("Unsuccessful in rejecting tickets");
						        		        		}
			        		        	});
			        		    		
			        		    	}
			        		    	
			        		    }
		   		    
		   		});
		   		
		   	}
	        	
	 });
	
	
	
	/* Approved Tickets data grid */
	$("#approved-ticket-list").jqGrid({
	        url 		: "fetchApprovedTickets",
	        datatype 	: "json",
	        mtype 		: 'POST',
	        colNames 	: [ 'Ticket Id','Ticket Type','Ticket Subtype','Ticket Status','Ticket Description','comments'],
	        colModel 	: [ {
			                        name 		: 'ticketId',
			                        index 		: 'ticketId',
			                        width 		: 100
			                }, {
			                        name 		: 'ticketType',
			                        index 		: 'ticketType',
			                        width 		: 150,
			                        editable 	: false
			                }, {
			                        name 		: 'ticketSubtype',
			                        index 		: 'ticketSubtype',
			                        width 		: 150,
			                        editable 		: false
			                },{
			                		name 		: 'ticketStatus',
			                		index 		: 'ticketStatus',
			                		width 		: 150,
			                		editable 	: false
			                },{
			                		name 		: 'ticketDesc',
			                		index 		: 'ticketDesc',
			                		width 		: 300,
			                		editable 	: false
			                },{
			                		name 		: 'ticketComments',
			                		index 		: 'ticketComments',
			                		width 		: 300,
			                		editable 	: false
			                }],
	        pager 		: '#approved-ticket-pager',
	        rowNum 		: 5,
	        height		: 'auto',
	        rowList 	: [ 5,10,20 ],
	        sortname 	: 'ticketId',
	        sortorder 	: 'desc',
	        viewrecords : true,
	        gridview 	: true,
	        multiselect	: true,
	  		multiboxonly: false,
	        caption		: 'Approved Tickets',
	        jsonReader 	: {
		                        repeatitems : false,
		                }
	});
		
	$("#approved-ticket-list").jqGrid('navGrid', '#approved-ticket-pager', {
	        edit 		: false,
	        add 		: false,
	        del 		: false,
	        search 		: false
	});
    
    
    
	/* Rejected Tickets data grid */
	$("#rejected-ticket-list").jqGrid({
	        url		 	: "fetchRejectedTickets",
	        datatype 	: "json",
	        mtype 		: 'POST',
	        colNames 	: [ 'Ticket Id','Ticket Type','Ticket Subtype','Ticket Status','Ticket Description','comments'],
	        colModel 	: [ {
			                        name 		: 'ticketId',
			                        index 		: 'ticketId',
			                        width 		: 100
			                }, {
			                        name 		: 'ticketType',
			                        index 		: 'ticketType',
			                        width 		: 150,
			                        editable 	: false
			                }, {
			                        name 		: 'ticketSubtype',
			                        index		: 'ticketSubtype',
			                        width 		: 150,
			                        editable	: false
			                },{
			                		name 		: 'ticketStatus',
			                		index 		: 'ticketStatus',
			                		width 		: 150,
			                		editable 	: false
			                },{
			                		name 		: 'ticketDesc',
			                		index 		: 'ticketDesc',
			                		width 		: 300,
			                		editable 	: false
			                },{
			                		name 		: 'ticketComments',
			                		index 		: 'ticketComments',
			                		width 		: 300,
			                		editable 	: false
		                	}],
	        pager 		: '#rejected-ticket-pager',
	        rowNum 		: 5,
	        height		: 'auto',
	        rowList 	: [ 5,10,20 ],
	        sortname 	: 'ticketId',
	        sortorder 	: 'desc',
	        viewrecords : true,
	        gridview 	: true,
	        multiselect	: true,
	  		multiboxonly: false,
	        caption		: 'Rejected Tickets',
	        jsonReader 	: {
		                        repeatitems : false,
		                }
	});
	
	$("#rejected-ticket-list").jqGrid('navGrid', '#rejected-ticket-pager', {
	        edit 		: false,
	        add 		: false,
	        del 		: false,
	        search 		: false
	});
        
        
});

	</script>

</body>
</html>