package com.crmindz.service;

import java.util.List;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;

import com.crmindz.model.Ticket;

@WebService(endpointInterface = "com.crmindz.service.TicketSoapService" , serviceName = "ticketSoapService")
public class TicketSoapServiceImpl implements TicketSoapService {

	@Autowired
	private TicketService ticketService;
	
	@Override
	public List<Ticket> getTicketByUserId(String userId) {
		
		List<Ticket> listOfTickets = ticketService.getUserTicketsById(userId);
		
		return listOfTickets;
	}
	
}
