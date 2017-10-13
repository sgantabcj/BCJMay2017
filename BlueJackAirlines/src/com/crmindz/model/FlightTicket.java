package com.crmindz.model;

public class FlightTicket {
	private String origin;
	private String destination;
	private String departDate;
	private double fare;
	/**
	 * @return the origin
	 */
	public String getOrigin() {
		return origin;
	}
	/**
	 * @param origin the origin to set
	 */
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	/**
	 * @return the destination
	 */
	public String getDestination() {
		return destination;
	}
	/**
	 * @param destination the destination to set
	 */
	public void setDestination(String destination) {
		this.destination = destination;
	}
	/**
	 * @return the departDate
	 */
	public String getDepartDate() {
		return departDate;
	}
	/**
	 * @param departDate the departDate to set
	 */
	public void setDepartDate(String departDate) {
		this.departDate = departDate;
	}
	/**
	 * @return the fare
	 */
	public double getFare() {
		return fare;
	}
	/**
	 * @param fare the fare to set
	 */
	public void setFare(double fare) {
		this.fare = fare;
	}
	

}
