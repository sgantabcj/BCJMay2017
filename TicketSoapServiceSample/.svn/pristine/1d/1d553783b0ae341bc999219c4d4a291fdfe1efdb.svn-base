package com.crmindz.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.crmindz.model.JQGrid;
import com.crmindz.model.Ticket;
import com.crmindz.service.TicketService;

/**
 * Acts as a controller and contains all the handlers for ticket functionality.
 * 
 * @author Sravan Ganta
 */

@Controller
public class TicketController {

	@Autowired
	TicketService ticketService;

	
	/**
	 * Returns welcome view if session object exists otherwise login view.
	 * 
	 * @param req	the request object for accessing the session object.
	 * @return		returns the model object with welcome page.
	 */
	@RequestMapping(value="/welcome", method = RequestMethod.GET)
	public ModelAndView showWelcome(HttpServletRequest req){

		ModelAndView modelAndView = new ModelAndView();
		HttpSession session = req.getSession(true);

		if (session != null && session.getAttribute("userName")!=null) {
			
			modelAndView.setViewName("welcome");
			modelAndView.addObject("firstname",session.getAttribute("userName"));
			
		}else{
			modelAndView.setViewName("redirect:/login?message=Your session timed out, please login again");
		}
		
		return modelAndView;
	}
	
	
	/**
	 * Returns either student-ticket-dashboard or ticket-dashboard based on the type of user.
	 * 
	 * @param req	the request object for accessing the session object to identify the userType.
	 * @return		returns the model object with respective ticket dashboard page.
	 */
	@RequestMapping(value = "/ticketDashboard", method = RequestMethod.GET)
	public ModelAndView showTicketDashboard(HttpServletRequest req) {
		
		ModelAndView modelAndView = new ModelAndView();
		HttpSession session = req.getSession(true);

		if (session != null && session.getAttribute("userType") != null) {
			
			if (session.getAttribute("userType").toString().equalsIgnoreCase("Employee")) {
				modelAndView.setViewName("ticket-dashboard");
			} else {
				modelAndView.setViewName("student-ticket-dashboard");
			}
			
		} else {
			modelAndView.setViewName("redirect:/login?message=Please login to view the ticket dashboard");
		}

		return modelAndView;
	}

	
	/**
	 * Returns new ticket creation view for the user.
	 * 
	 * @param allRequestParams	contains all the parameters passed as part of the GET request.
	 * @return	                returns the model object with new ticket view,
	 * 			                Ticket object as model attribute, ticket types
	 * 			                and appropriate message when the new ticket creation fails.
	 */                         
	@RequestMapping(value = "/newTicket", method = RequestMethod.GET)
	public ModelAndView showNewTicket(@RequestParam Map<String, String> allRequestParams) {
		
		ModelAndView modelAndView = new ModelAndView("new-ticket");
		List<Map<String, Object>> ticketTypes = ticketService.getTicketTypes();
		String ticketTypesStr = "";

		for (Map<String, Object> ticketType : ticketTypes) {
			
			ticketTypesStr += "<option value='" + ticketType.get("ticketId").toString() + "'>"
					+ (String) ticketType.get("ticket_type") + "</option>";
			
		}

		modelAndView.addObject("ticket", new Ticket());
		modelAndView.addObject("ticketTypes", ticketTypesStr);
		
		if (allRequestParams.containsKey("message")) {
			
			modelAndView.addObject("message", allRequestParams.get("message"));
		}
		
		return modelAndView;
	}

	
	/**
	 * Fetches and returns the ticket subtypes for a particular ticket type.
	 * 
	 * @param categoryId	The selected ticket category id is passed.
	 * @return	            returns a string with the html code containing all the 
	 * 			            subtypes for a selected ticket category.
	 */
	@ResponseBody
	@RequestMapping(value = "/getTicketSubtypes", method = RequestMethod.GET)
	public String getTicketSubtypes(@RequestParam int categoryId) {
		
		List<String> subticketTypes = ticketService.getTicketSubtypes(categoryId);
		String ticketSubtypesStr = "";

		for (String subticketType : subticketTypes) {
			ticketSubtypesStr += "<option value='" + subticketType + "'>" + subticketType + "</option>";
		}

		return ticketSubtypesStr;
	}

	
	/**
	 * Creates new ticket and returns the ticket dashboard upon successful creation.
	 * Returns the new ticket page if not successful and login view if the session is expired.
	 * 
	 * @param request	the request object for accessing the session object's
	 * 					attribute userId for saving the ticket under that particular user.
	 * @param newTicket	all the ticket parameters from the new ticket page mapped to
	 * 					the respective properties of the Ticket object.
	 * @return	        returns model object with the 
	 */
	@RequestMapping(value = "/createTicket", method = RequestMethod.POST)
	public ModelAndView createTicket(HttpServletRequest request, @ModelAttribute("ticket") Ticket newTicket) {

		HttpSession session = request.getSession();
		
		if (session != null && session.getAttribute("userId") != null) {
			
			newTicket.setUserId(session.getAttribute("userId").toString());
			
		} else {
			
			return new ModelAndView("redirect:/login?message=Your session timed out, please login again");
			
		}

		if (ticketService.createTicket(newTicket)) {
			
			if (session.getAttribute("userType") == "Employee") {
				return new ModelAndView("ticket-dashboard");
			} else {
				return new ModelAndView("student-ticket-dashboard", "message", "Successfully created a new ticket!");
			}
			
		} else {
			
			return new ModelAndView("redirect:/newTicket?message=Unsuccessful! could not create ticket, please try again!");
			
		}

	}

	
	/**
	 * Fetches and returns all the tickets based on Id of student' or consultant.
	 * 
	 * @param req	request object allows to access the session object to load
	 * 				all the tickets related to the userId present in the session object.
	 * @param res
	 * @return	    returns a JSON string with all the ticket data related to the user.
	 */
	@ResponseBody
	@RequestMapping(value = "/fetchUserTickets", method = RequestMethod.POST)
	public JQGrid<Ticket> fetchUserTickets(HttpServletRequest req, HttpServletResponse res) {

		int page = Integer.valueOf(req.getParameter("page")).intValue();
		int pageSize = Integer.valueOf(req.getParameter("rows")).intValue();

		JQGrid<Ticket> gridData = new JQGrid<Ticket>();
		HttpSession session = req.getSession(true);
		List<Ticket> ticketsList = new ArrayList<Ticket>();
		
		if (session != null && session.getAttribute("userId") != null) {
			
			ticketsList = ticketService.getUserTicketsById(session.getAttribute("userId").toString());
			
		} else {
			
			RequestDispatcher reqDispatcher = req.getRequestDispatcher("redirect:/login?message=Your session timed out, please login again");
			
			try {
				
				reqDispatcher.forward(req, res);
				
			} catch (ServletException e) {
				e.printStackTrace();
				System.out.println("Exception while forwarding to login from load tickets controller");
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("Exception while forwarding to login from load tickets controller");
			}
			
		}

		int total = ticketsList.size();

		gridData.setPage(page);
		gridData.setTotal(String.valueOf(Math.ceil((double) total / pageSize)));
		gridData.setRecords(String.valueOf(total));
		gridData.setRows(ticketsList);

		return gridData;
	}

	
	/**
	 * fetches and returns all the pending tickets of students and consultants.
	 * 
	 * @param req	request object allows to access the values related to the jqGrid.
	 * @return	    returns a JSON string with all the pending ticket data.
	 */
	@ResponseBody
	@RequestMapping(value = "/fetchPendingTickets", method = RequestMethod.POST)
	public JQGrid<Ticket> loadPendingTickets(HttpServletRequest req) {

		int page = Integer.valueOf(req.getParameter("page")).intValue();
		int pageSize = Integer.valueOf(req.getParameter("rows")).intValue();

		JQGrid<Ticket> gridData = new JQGrid<Ticket>();
		List<Ticket> pendingTicketsList = ticketService.getPendingTickets();

		int total = pendingTicketsList.size();

		gridData.setPage(page);
		gridData.setTotal(String.valueOf(Math.ceil((double) total / pageSize)));
		gridData.setRecords(String.valueOf(total));
		gridData.setRows(pendingTicketsList);

		return gridData;
	}

	
	/**
	 * fetches and returns all the approved tickets of students and consultants.
	 * 
	 * @param req	request object allows to access the values related to the jqGrid.
	 * @return	    returns a JSON string with all the approved ticket data.
	 */
	@ResponseBody
	@RequestMapping(value = "/fetchApprovedTickets", method = RequestMethod.POST)
	public JQGrid<Ticket> loadApprovedTickets(HttpServletRequest req) {

		int page = Integer.valueOf(req.getParameter("page")).intValue();
		int pageSize = Integer.valueOf(req.getParameter("rows")).intValue();

		JQGrid<Ticket> gridData = new JQGrid<Ticket>();
		List<Ticket> approvedTicketsList = ticketService.getApprovedTickets();

		int total = approvedTicketsList.size();

		gridData.setPage(page);
		gridData.setTotal(String.valueOf(Math.ceil((double) total / pageSize)));
		gridData.setRecords(String.valueOf(total));
		gridData.setRows(approvedTicketsList);

		return gridData;
	}

	
	/**
	 * fetches and returns all the rejected tickets of students and consultants.
	 * 
	 * @param req	request object allows to access the values related to the jqGrid.
	 * @return	    returns a JSON string with all the rejected ticket data.
	 */
	@ResponseBody
	@RequestMapping(value = "/fetchRejectedTickets", method = RequestMethod.POST)
	public JQGrid<Ticket> loadRejectedTickets(HttpServletRequest req) {

		int page = Integer.valueOf(req.getParameter("page")).intValue();
		int pageSize = Integer.valueOf(req.getParameter("rows")).intValue();

		JQGrid<Ticket> gridData = new JQGrid<Ticket>();
		List<Ticket> rejectedTicketsList = ticketService.getRejectedTickets();

		int total = rejectedTicketsList.size();

		gridData.setPage(page);
		gridData.setTotal(String.valueOf(Math.ceil((double) total / pageSize)));
		gridData.setRecords(String.valueOf(total));
		gridData.setRows(rejectedTicketsList);

		return gridData;
	}

	
	/**
	 * Changes the status of a selected ticket to approved.
	 * 
	 * @param approvedTicket	the ticket object with all the properties
	 * 							mapped with the respective parameters from the grid record.
	 * @return	                returns a string if successfully approved or not.
	 */
	@ResponseBody
	@RequestMapping(value = "/approveTicket", method = RequestMethod.POST)
	public String approveTicket(@RequestBody Ticket approvedTicket) {
		
		if (ticketService.approveTicket(approvedTicket)) {
			
			return "success";
			
		}else{
			return "fail";
		}
	}

	
	/**
	 * Changes the status of a selected ticket to rejected.
	 * 
	 * @param approvedTicket	the ticket object with all the properties
	 * 							mapped with the respective parameters from the grid record.
	 * @return	                returns a string whether successfully rejected or not.
	 */
	@ResponseBody
	@RequestMapping(value = "/rejectTicket", method = RequestMethod.POST)
	public String rejectTicket(@RequestBody Ticket rejectedTicket) {
		
		if (ticketService.rejectTicket(rejectedTicket)) {
			
			return "success";
			
		}else{
			return "fail";
		}
	}

}
