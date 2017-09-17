package com.crmindz.webservice;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

import com.crmindz.model.Ticket;
import com.crmindz.service.TicketService;

@Component
@Path("/ticket")
public class JerseyTicketRestService {

	@Autowired
	private TicketService ticketService;
	
	@GET
	@Path(value="/{userId}")
	@Produces(MediaType.APPLICATION_JSON_VALUE)
	public List<Ticket> getTicketByUserId(@PathParam("userId") String userId) {
		
		List<Ticket> listOfTickets = ticketService.getUserTicketsById(userId);
		
		return listOfTickets;
	}
	
}
