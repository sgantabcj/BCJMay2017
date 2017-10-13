package com.crmindz.service;

import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crmindz.dao.TicketDao;
import com.crmindz.model.Ticket;

/**
 * Acts as service class for the ticket related functionality.
 * 
 * @author Sravan Ganta
 */
@Service
public class TicketService {

	@Autowired
	TicketDao ticketDao;
	
	
	/**
	 * Fetches the ticket categories for the new ticket creation page.
	 * 
	 * @return the list of the ticket categories.
	 */
	public List<Map<String,Object>> getTicketTypes(){
		return ticketDao.getTicketTypes();
	}
	
	
	/**
	 * Fetches the ticket sub-categories for the new ticket creation page
	 * for a selected category.
	 * 
	 * @return the list of the ticket sub-categories.
	 */
	public List<String> getTicketSubtypes(int categoryId){
		return ticketDao.getTicketSubtypes(categoryId);
	}
	
	
	/**
	 * Creates a new ticket.
	 * 
	 * @param newTicket	Ticket object with properties mapped with
	 * 					respective parameter values entered by the user.
	 * @return	returns boolean to specify if it is success or not.
	 */
	public boolean createTicket(Ticket newTicket){
		
		// To create new ticket number
		Random rand = new Random();
		int max = 100000;
		int min = 10000;
		int newRandomNumber = rand.nextInt((max - min) + 1) + min;

		newTicket.setTicketId(newRandomNumber);
		newTicket.setTicketStatus("Pending");
		
		return ticketDao.createTicket(newTicket);
	}
	
	
	/**
	 * Fetches all the ticket data for a particular userID.
	 * 
	 * @param userId allows to fetch the ticket data related to the user.
	 * @return	returns list of all the tickets for this particular user.
	 */
	public List<Ticket> getUserTicketsById(String userId){
		return ticketDao.getUserTicketsById(userId);
	}
	
	
	/**
	 * Fetches all the pending ticket data for a particular userID.
	 * 
	 * @param userId allows to fetch the pending ticket data related to the user.
	 * @return	returns list of all the pending tickets for this particular user.
	 */
	public List<Ticket> getPendingTickets(){
		return ticketDao.getPendingTickets();
	}
	
	
	/**
	 * Fetches all the approved ticket data for a particular userID.
	 * 
	 * @param userId allows to fetch the approved ticket data related to the user.
	 * @return	returns list of all the approved tickets for this particular user.
	 */
	public List<Ticket> getApprovedTickets(){
		return ticketDao.getApprovedTickets();
	}
	
	
	/**
	 * Fetches all the rejected ticket data for a particular userID.
	 * 
	 * @param userId allows to fetch the rejected ticket data related to the user.
	 * @return	returns list of all the rejected tickets for this particular user.
	 */
	public List<Ticket> getRejectedTickets(){
		return ticketDao.getRejectedTickets();
	}
	
	
	/**
	 * Changes the status of the ticket to approved based to the ticket passed.
	 * 
	 * @param approvedTicket Ticket object with the data from the selected ticket.
	 * @return	returns a boolean to specify whether it is success or not.
	 */
	public boolean approveTicket(Ticket approvedTicket){
		return ticketDao.approveTicket(approvedTicket);
	}
	
	
	/**
	 * Changes the status of the ticket to rejected based to the ticket passed.
	 * 
	 * @param approvedTicket Ticket object with the data from the selected ticket.
	 * @return	returns a boolean to specify whether it is success or not.
	 */
	public boolean rejectTicket(Ticket rejectedTicket){
		return ticketDao.rejectTicket(rejectedTicket);
	}
}
