package com.crmindz.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.crmindz.model.Ticket;

/**
 * This class acts DAO for ticket related functionality.
 * 
 * @author Sravan Ganta
 */
@Repository
public class TicketDao {

	@Autowired
	DataSource datasource;
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	/**
	 * Fetches the list of ticket category types.
	 * 
	 * @return returns the list of all the ticket categories from the database.
	 */
	public List<Map<String,Object>> getTicketTypes(){
		
		String sql = "SELECT * FROM ticket_types";
		List<Map<String,Object>> ticketTypes = jdbcTemplate.queryForList(sql);
		
		return ticketTypes;
	}
	
	
	/**
	 * Fetches all the sub-types related to the categoryId passed.
	 * 
	 * @param categoryId the selected category Id.
	 * @return	returns the list of sub-types.
	 */
	public List<String> getTicketSubtypes(int categoryId){
		String sql = "SELECT ticket_subtype FROM ticket_subtypes WHERE ticket_typeId="+categoryId+"";
		List<String> subticketTypes = jdbcTemplate.queryForList(sql,String.class);
		return subticketTypes;
	}
	
	
	/**
	 * Creates new ticket in the database entered by the user.
	 * 
	 * @param newTicket Ticket object with the properties mapped with
	 * 					the values of parameters entered by the user.
	 * @return	return boolean to specify if it is success or not.
	 */
	public boolean createTicket(Ticket newTicket){
		String sql = "INSERT INTO ticket(ticketId,userId,ticket_type,ticket_subtype,ticket_desc) values(?,?,?,?,?)";
		
		try {
			
			int ticketTypeId = Integer.parseInt(newTicket.getTicketType());
			String ticketType = jdbcTemplate.queryForObject("SELECT ticket_type FROM ticket_types WHERE ticketId ="+ticketTypeId+"", String.class);
			newTicket.setTicketType(ticketType);
			
		} catch (NumberFormatException e1) {
			e1.printStackTrace();
			System.out.println("Error converting ticket type from string to number");
		} catch (DataAccessException e2){
			e2.printStackTrace();
			System.out.println("Error while accessing ticket type from DB");
		}
		
		try {
			
			int numberOfRowsAffected = jdbcTemplate.update(sql, new Object[] {newTicket.getTicketId(),newTicket.getUserId(),newTicket.getTicketType(),newTicket.getTicketSubtype(),newTicket.getTicketDesc()});
			
			if(numberOfRowsAffected==0){
				return false;
			}else{
				return true;
			}
			
		} catch (DataAccessException e) {
			
			System.out.print("ticket successfully saved");
			e.printStackTrace();
			return false;
		}
	}
	
	
	/**
	 * Fetches the list of all the tickets for the userId passed.
	 * 
	 * @param userId	the userId for which the tickets to be fetched.
	 * @return	returns a list of tickets.
	 */
	public List<Ticket> getUserTicketsById(String userId){
		
		String sql = "SELECT * FROM ticket WHERE userId = '"+userId+"'";
		
		List<Ticket> ticketsList = new ArrayList<Ticket>();
		
		try {
			
			ticketsList = jdbcTemplate.query(sql,new BeanPropertyRowMapper<Ticket>(Ticket.class));
			
		} catch (DataAccessException e) {
			e.printStackTrace();
			System.out.println("Exception while fetching pending tickets");
		}
		
		return ticketsList;
	}
	
	
	/**
	 * Fetches all the pending tickets in the database.
	 * 
	 * @return return the list of all pending tickets.
	 */
	public List<Ticket> getPendingTickets(){
		
		String sql = "SELECT * FROM ticket WHERE ticket_status = 'pending'";
		
		List<Ticket> pendingTicketsList = new ArrayList<Ticket>();
		
		try {
			
			pendingTicketsList = jdbcTemplate.query(sql,new BeanPropertyRowMapper<Ticket>(Ticket.class));
			
		} catch (DataAccessException e) {
			e.printStackTrace();
			System.out.println("Exception while fetching pending tickets");
		}
		
		return pendingTicketsList;
	}
	
	
	/**
	 * Fetches all the approved tickets in the database.
	 * 
	 * @return return the list of all approved tickets.
	 */
	public List<Ticket> getApprovedTickets(){
		
		String sql = "SELECT * FROM ticket WHERE ticket_status = 'approved'";
		
		List<Ticket> approvedTicketsList = new ArrayList<Ticket>();
		
		try {
			
			approvedTicketsList = jdbcTemplate.query(sql,new BeanPropertyRowMapper<Ticket>(Ticket.class));
			
		} catch (DataAccessException e) {
			e.printStackTrace();
			System.out.println("Exception while fetching approved tickets");
		}
		
		return approvedTicketsList;
	}
	
	
	/**
	 * Fetches all the rejected tickets in the database.
	 * 
	 * @return return the list of all rejected tickets.
	 */
	public List<Ticket> getRejectedTickets(){
		
		String sql = "SELECT * FROM ticket WHERE ticket_status = 'rejected'";
		
		List<Ticket> rejectedTicketsList = new ArrayList<Ticket>();
		
		try {
			
			rejectedTicketsList = jdbcTemplate.query(sql,new BeanPropertyRowMapper<Ticket>(Ticket.class));
			
		} catch (DataAccessException e) {
			e.printStackTrace();
			System.out.println("Exception while fetching rejected tickets");
		}
		
		return rejectedTicketsList;
	}
	
	
	/**
	 * Updates the status of the ticket passed to approved.
	 * 
	 * @param approvedTicket Ticket object with selected ticket data.
	 * @return returns boolean to specify if it is success or not.
	 */
	public boolean approveTicket(Ticket approvedTicket){
		
		String sql = "UPDATE ticket SET ticket_status = 'approved',ticket_comments='"
						+approvedTicket.getTicketComments()+"' WHERE ticketId ="
							+approvedTicket.getTicketId()+"";
		
		try {
			jdbcTemplate.update(sql);
			return true;
		} catch (DataAccessException e) {
			e.printStackTrace();
			System.out.println("Exception while updating the status of tickets to approved");
		}
		return false;
	}
	
	
	/**
	 * Updates the status of the ticket passed to rejected.
	 * 
	 * @param rejectedTicket Ticket object with selected ticket data.
	 * @return returns boolean to specify if it is success or not.
	 */
	public boolean rejectTicket(Ticket rejectedTicket){
		
		String sql = "UPDATE ticket SET ticket_status = 'rejected',ticket_comments='"
						+rejectedTicket.getTicketComments()+"' WHERE ticketId ="
							+rejectedTicket.getTicketId()+"";
		try {
			
			jdbcTemplate.update(sql);
			return true;
			
		} catch (DataAccessException e) {
			e.printStackTrace();
			System.out.println("Exception while updating the status of tickets to rejected");
		}
		
		return false;
	}
	
}
