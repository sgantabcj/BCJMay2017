package com.crmindz.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.crmindz.model.Ticket;

@Path("/tickets")
@Produces("application/json")
public interface TicketRestService {
	
	@GET
	@Path("/user/{userId}")
	public List<Ticket> getTicketsByUserId(@PathParam("userId") String userId);
}
