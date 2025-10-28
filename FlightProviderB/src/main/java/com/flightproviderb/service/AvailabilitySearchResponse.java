package com.flightproviderb.service;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "hasError",
        "flights",
        "errorMessage"
})
@XmlRootElement(name = "AvailabilitySearchResponse", namespace = "http://flightproviderb.service.com")
public class AvailabilitySearchResponse {

    protected boolean hasError;

    @XmlElement(name = "flight")
    protected List<Flight> flights;

    protected String errorMessage;

    public AvailabilitySearchResponse() {
        flights = new ArrayList<>();
    }

    // getters and setters
    public boolean isHasError() { return hasError; }
    public void setHasError(boolean value) { this.hasError = value; }

    public List<Flight> getFlights() { return flights; }
    public void setFlights(List<Flight> value) { this.flights = value; }

    public String getErrorMessage() { return errorMessage; }
    public void setErrorMessage(String value) { this.errorMessage = value; }
}

