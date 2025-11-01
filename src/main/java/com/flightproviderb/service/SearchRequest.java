package com.flightproviderb.service;

import javax.xml.bind.annotation.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@XmlRootElement(name = "AvailabilitySearchRequest", namespace = "http://flightproviderb.service.com")
@XmlAccessorType(XmlAccessType.FIELD)
public class SearchRequest {

	@XmlElement(name = "departure", namespace = "http://flightproviderb.service.com")
	private String departure;

	@XmlElement(name = "arrival", namespace = "http://flightproviderb.service.com")
	private String arrival;

	@XmlElement(name = "departureDate", namespace = "http://flightproviderb.service.com")
	private String  departureDateString;

	// Default constructor
	public SearchRequest() {}

	public SearchRequest(String departure, String arrival, String departureDate) {
		this.departure = departure;
		this.arrival = arrival;
		this.departureDateString = departureDate;
	}

	// Getters and setters
	public String getDeparture() { return departure; }
	public void setDeparture(String departure) { this.departure = departure; }

	public String getArrival() { return arrival; }
	public void setArrival(String arrival) { this.arrival = arrival; }

	public LocalDateTime getDepartureDate() {
		return departureDateString != null ?
				LocalDateTime.parse(departureDateString, DateTimeFormatter.ISO_DATE_TIME) : null;
	}

	public void setDepartureDate(LocalDateTime departureDate) {
		this.departureDateString = departureDate != null ?
				departureDate.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME) : null;
	}
}

