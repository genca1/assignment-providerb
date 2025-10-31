package com.flightproviderb.service;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "AvailabilitySearchRequest", namespace = "http://flightproviderb.service.com")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvailabilitySearchRequest", propOrder = {
        "request"
})
public class AvailabilitySearchRequest {

    @XmlElement(required = true, name = "request", namespace = "http://flightproviderb.service.com")
    private SearchRequest request;

    // Default constructor
    public AvailabilitySearchRequest() {}

    // Getters and setters
    public SearchRequest getRequest() { return request; }
    public void setRequest(SearchRequest request) { this.request = request; }
}
