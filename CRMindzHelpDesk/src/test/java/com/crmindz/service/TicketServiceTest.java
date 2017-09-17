package com.crmindz.service;

import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.crmindz.dao.TicketDao;
import com.crmindz.model.Ticket;

/**
 * @author Sravan Ganta
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class TicketServiceTest{
	
	@InjectMocks
	TicketService ticketService;
	
	@Mock
	TicketDao ticketDao;
	
	@Test
	public void testGetTicketTypes(){
		
		List<Map<String,Object>> ticketTypesList = new ArrayList<Map<String,Object>>();
		Map<String,Object> ticketType = new HashMap<String,Object>();
		ticketType.put("1", "Supplies");
		ticketTypesList.add(ticketType);
		
		when(ticketDao.getTicketTypes()).thenReturn(ticketTypesList);
		
		Assert.assertEquals(ticketService.getTicketTypes(), ticketTypesList);
	}
	
	@Test
	public void testGetTicketSubtypes(){
		
		List<String> ticketSubtypesList = new ArrayList<String>();
		ticketSubtypesList.add("Supplies");
		
		when(ticketDao.getTicketSubtypes(1)).thenReturn(ticketSubtypesList);
		
		Assert.assertEquals(ticketService.getTicketSubtypes(1), ticketSubtypesList);
	}
	
	@Test
	public void testSaveTicket(){
		
		Ticket newTicket = new Ticket();
		
		when(ticketDao.createTicket(newTicket)).thenReturn(true);
		
		Assert.assertEquals(ticketService.createTicket(newTicket), true);
	}
	
	@Test
	public void testGetUserTickets(){
		
		List<Ticket> ticketList = new ArrayList<Ticket>();
		
		when(ticketDao.getUserTicketsById("1")).thenReturn(ticketList);
		
		Assert.assertEquals(ticketService.getUserTicketsById("1"), ticketList);
	}
	
	@Test
	public void testGetPendingTickets(){
		
		List<Ticket> ticketList = new ArrayList<Ticket>();
		
		when(ticketDao.getPendingTickets()).thenReturn(ticketList);
		
		Assert.assertEquals(ticketService.getPendingTickets(), ticketList);
	}
	
	@Test
	public void testGetApprovedTickets(){
		
		List<Ticket> ticketList = new ArrayList<Ticket>();
		
		when(ticketDao.getApprovedTickets()).thenReturn(ticketList);
		
		Assert.assertEquals(ticketService.getApprovedTickets(), ticketList);
	}
	
	@Test
	public void testGetRejectedTickets(){
		
		List<Ticket> ticketList = new ArrayList<Ticket>();
		
		when(ticketDao.getRejectedTickets()).thenReturn(ticketList);
		
		Assert.assertEquals(ticketService.getRejectedTickets(), ticketList);
	}
	
	@Test
	public void testApproveTicket(){
		
		Ticket newTicket = new Ticket();
		
		when(ticketDao.approveTicket(newTicket)).thenReturn(true);
		
		Assert.assertEquals(ticketService.approveTicket(newTicket), true);
	}
	
	@Test
	public void testRejectTicketTicket(){
		
		Ticket newTicket = new Ticket();
		
		when(ticketDao.rejectTicket(newTicket)).thenReturn(true);
		
		Assert.assertEquals(ticketService.rejectTicket(newTicket), true);
	}
}
