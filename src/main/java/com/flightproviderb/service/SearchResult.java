package com.flightproviderb.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "AvailabilitySearchResponse", namespace = "http://flightproviderb.service.com")
@XmlAccessorType(XmlAccessType.FIELD)
public class SearchResult {

	@XmlElement(name = "hasError", namespace = "http://flightproviderb.service.com")
	private boolean hasError = false;

	@XmlElement(name = "flightOptions", namespace = "http://flightproviderb.service.com")
	private List<Flight> flightOptions = new ArrayList<>();

	@XmlElement(name = "errorMessage", namespace = "http://flightproviderb.service.com")
	private String errorMessage;

	// Constructors
	public SearchResult() {
	}

	public SearchResult(boolean hasError, List<Flight> flightOptions, String errorMessage) {
		this.hasError = hasError;
		this.flightOptions = flightOptions;
		this.errorMessage = errorMessage;
	}

	// Getters and Setters
	public boolean isHasError() {
		return hasError;
	}

	public void setHasError(boolean hasError) {
		this.hasError = hasError;
	}

	public List<Flight> getFlightOptions() {
		return flightOptions;
	}

	public void setFlightOptions(List<Flight> flightOptions) {
		this.flightOptions = flightOptions;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}