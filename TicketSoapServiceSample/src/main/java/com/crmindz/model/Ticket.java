package com.crmindz.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Ticket")
public class Ticket implements Serializable {

	private int ticketId;
	private String ticketType;
	private String ticketSubtype;
	private String ticketDesc;
	private String ticketStatus;
	private String userId;
	private String ticketComments;
	
	//default constructor
	public Ticket(){
		
	}
	
	/**
	 * @return the ticketComments
	 */
	public String getTicketComments() {
		return ticketComments;
	}
	/**
	 * @param ticketComments the ticketComments to set
	 */
	public void setTicketComments(String ticketComments) {
		this.ticketComments = ticketComments;
	}
	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * @return the ticketStatus
	 */
	public String getTicketStatus() {
		return ticketStatus;
	}
	/**
	 * @param ticketStatus the ticketStatus to set
	 */
	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}
	/**
	 * @return the ticketId
	 */
	public int getTicketId() {
		return ticketId;
	}
	/**
	 * @param ticketId the ticketId to set
	 */
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	/**
	 * @return the ticketType
	 */
	public String getTicketType() {
		return ticketType;
	}
	/**
	 * @param ticketType the ticketType to set
	 */
	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}
	/**
	 * @return the ticketSubtype
	 */
	public String getTicketSubtype() {
		return ticketSubtype;
	}
	/**
	 * @param ticketSubtype the ticketSubtype to set
	 */
	public void setTicketSubtype(String ticketSubtype) {
		this.ticketSubtype = ticketSubtype;
	}
	/**
	 * @return the ticketDesc
	 */
	public String getTicketDesc() {
		return ticketDesc;
	}
	/**
	 * @param ticketDesc the ticketDesc to set
	 */
	public void setTicketDesc(String ticketDesc) {
		this.ticketDesc = ticketDesc;
	}
}
