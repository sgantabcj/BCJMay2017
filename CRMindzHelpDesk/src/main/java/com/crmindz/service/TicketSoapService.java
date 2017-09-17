package com.crmindz.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.crmindz.model.Ticket;

@WebService
public interface TicketSoapService {
	
	@WebMethod
	public List<Ticket> getTicketByUserId(String userId);
	
}
