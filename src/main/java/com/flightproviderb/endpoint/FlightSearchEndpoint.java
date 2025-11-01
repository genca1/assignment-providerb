package com.flightproviderb.endpoint;

import com.flightproviderb.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class FlightSearchEndpoint {

    private static final String NAMESPACE_URI = "http://flightproviderb.service.com";

    @Autowired
    private SearchService searchService;


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "AvailabilitySearchRequest")
    @ResponsePayload
    public SearchResult availabilitySearch(@RequestPayload SearchRequest request) {
        // Convert JAXB request to your domain object
        com.flightproviderb.service.SearchRequest domainRequest =
                new com.flightproviderb.service.SearchRequest(
                        request.getDeparture(),
                        request.getArrival(),
                        request.getDepartureDate().toString()
                );

        // Call your service
        return searchService.availabilitySearch(domainRequest);
    }
}
