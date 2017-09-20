package com.crmindz.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crmindz.model.Ticket;
import com.crmindz.service.TicketService;

@Service("ticketRestService")
public class TicketRestServiceImpl implements TicketRestService {

	@Autowired
	TicketService ticketService;
	
	public List<Ticket> getTicketsByUserId(String userId){
		
		List<Ticket> ticketsList = ticketService.getTicketsByUserId(userId);
		
		return ticketsList;
	}
}
