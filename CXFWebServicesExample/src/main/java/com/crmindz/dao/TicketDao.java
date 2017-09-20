package com.crmindz.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.crmindz.model.Ticket;

@Repository
public class TicketDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<Ticket> getTicketsByUserId(String userId){
		String sql = "SELECT * FROM ticket WHERE userId = '"+userId+"'";
		
		List<Ticket> listOfTickets = null;
		
		try {
			listOfTickets = jdbcTemplate.query(sql,new BeanPropertyRowMapper<Ticket>(Ticket.class));
		} catch (DataAccessException e) {
			e.printStackTrace();
			System.out.println("Exception while fetching tickets from db");
		}
		
		return listOfTickets;
	}
}
