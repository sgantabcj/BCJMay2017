package com.crmindz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.crmindz.model.Ticket;
import com.crmindz.service.TicketService;

@RestController
public class TicketRestController {
	
	@Autowired
	private TicketService ticketService;
	
	@RequestMapping(value ="/tickets/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Ticket>> getTicketByUserId(@PathVariable("id") int userId){
		
		List<Ticket> listOfTickets = ticketService.getUserTicketsById(Integer.toString(userId));
		
		return new ResponseEntity<List<Ticket>>(listOfTickets,HttpStatus.OK);
	}
	
	@RequestMapping(value ="/pendingtickets", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Ticket>> getTicketByUserId(){
		
		List<Ticket> listOfTickets = ticketService.getPendingTickets();
		
		return new ResponseEntity<List<Ticket>>(listOfTickets,HttpStatus.OK);
	}
}
