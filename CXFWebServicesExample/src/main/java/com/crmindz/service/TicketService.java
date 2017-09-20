package com.crmindz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crmindz.dao.TicketDao;
import com.crmindz.model.Ticket;

@Service
public class TicketService {
	
	@Autowired
	TicketDao ticketDao;
	
	public List<Ticket> getTicketsByUserId(String userId){
		return ticketDao.getTicketsByUserId(userId);
	}
}
