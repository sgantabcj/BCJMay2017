package com.crmindz.bcjmay2017.classes.simple.lab6;

public class Demo {
	public static void main(String[] args) {
		Ticket ticketOne = new Ticket();
		Ticket ticketTwo = new Ticket(18, 1);
		Ticket ticketThree = new Ticket(2, 18);

		if (ticketOne.validateTravelPoints()) {
			ticketOne.calculateTicketAmount();
		} else {
			System.out.print("Please enter valid starting and ending points");
		}
		if (ticketTwo.validateTravelPoints()) {
			ticketTwo.calculateTicketAmount();
		} else {
			System.out.print("Please enter valid starting and ending points");
		}
		if (ticketThree.validateTravelPoints()) {
			ticketThree.calculateTicketAmount();
		} else {
			System.out.print("Please enter valid starting and ending points");
		}

		System.out.printf("Ticket one amount: %d\nTicket two amount: %d\nTicket three amount: %d",
				ticketOne.getTicketAmount(), ticketTwo.getTicketAmount(), ticketThree.getTicketAmount());
	}
}
