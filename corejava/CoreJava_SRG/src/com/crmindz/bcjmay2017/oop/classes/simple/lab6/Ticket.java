package com.crmindz.bcjmay2017.oop.classes.simple.lab6;

public class Ticket {
	private int startPoint = 2;
	private int endPoint = 18;
	private int ticketAmount;
	
	public Ticket(){
		
	}
	
	public Ticket(int startPoint, int endPoint){
		this.startPoint = startPoint;
		this.endPoint =endPoint;
	}

	/**
	 * @return the startPoint
	 */
	public int getStartPoint() {
		return startPoint;
	}

	/**
	 * @return the endPoint
	 */
	public int getEndPoint() {
		return endPoint;
	}

	/**
	 * @return the ticketAmount
	 */
	public int getTicketAmount() {
		return ticketAmount;
	}
	
	public boolean validateTravelPoints(){
		if(getStartPoint()!=0 && getEndPoint()!=0 && getEndPoint()>getStartPoint()){
			return true;
		}else{
			return false;
		}
	}
	
	public void calculateTicketAmount(){
			this.ticketAmount = (this.endPoint-this.startPoint)*20;			
	}

	
}
