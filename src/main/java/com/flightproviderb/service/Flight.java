package com.flightproviderb.service;

import com.flightproviderb.config.LocalDateTimeAdapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@XmlAccessorType(XmlAccessType.FIELD)
public class Flight {


	@XmlElement(name = "flightNumber", namespace = "http://flightproviderb.service.com")
	private String flightNumber;

	@XmlElement(name = "departure", namespace = "http://flightproviderb.service.com")
	private String departure;

	@XmlElement(name = "arrival", namespace = "http://flightproviderb.service.com")
	private String arrival;

	@XmlElement(name = "departuredatetime", namespace = "http://flightproviderb.service.com")
	@XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
	private LocalDateTime departuredatetime;

	@XmlElement(name = "arrivaldatetime", namespace = "http://flightproviderb.service.com")
	@XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
	private LocalDateTime arrivaldatetime;

	@XmlElement(name = "price", namespace = "http://flightproviderb.service.com")
	private BigDecimal price;
	

	public Flight(String flightNumber, String departure, String arrival, LocalDateTime departuredatetime,
			LocalDateTime arrivaldatetime, BigDecimal price) {
		super();
		this.flightNumber = flightNumber;
		this.departure = departure;
		this.arrival = arrival;
		this.departuredatetime = departuredatetime;
		this.arrivaldatetime = arrivaldatetime;
		this.price = price;
	}
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getDeparture() {
		return departure;
	}
	public void setDeparture(String departure) {
		this.departure = departure;
	}
	public String getArrival() {
		return arrival;
	}
	public void setArrival(String arrival) {
		this.arrival = arrival;
	}
	public void setDestination(String destination) {
		this.arrival = destination;
	}
	public LocalDateTime getDeparturedatetime() {
		return departuredatetime;
	}
	public void setDeparturedatetime(LocalDateTime departuredatetime) {
		this.departuredatetime = departuredatetime;
	}
	public LocalDateTime getArrivaldatetime() {
		return arrivaldatetime;
	}
	public void setArrivaldatetime(LocalDateTime arrivaldatetime) {
		this.arrivaldatetime = arrivaldatetime;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
}
