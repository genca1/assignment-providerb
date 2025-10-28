package com.flightproviderb.endpoint;

import com.flightproviderb.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.time.format.DateTimeFormatter;

@Endpoint
public class FlightSearchEndpoint {

    private static final String NAMESPACE_URI = "http://flightproviderb.service.com";

    @Autowired
    private SearchService searchService;


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "AvailabilitySearchRequest")
    @ResponsePayload
    public AvailabilitySearchResponse availabilitySearch(@RequestPayload AvailabilitySearchRequest request) {
        // Convert JAXB request to your domain object
        com.flightproviderb.service.SearchRequest domainRequest =
                new com.flightproviderb.service.SearchRequest(
                        request.getRequest().getDeparture(),
                        request.getRequest().getArrival(),
                        request.getRequest().getDepartureDate().toString()
                );

        // Call your service
        com.flightproviderb.service.SearchResult domainResult =
                searchService.availabilitySearch(domainRequest);

        // Convert domain result to JAXB response
        AvailabilitySearchResponse response = new AvailabilitySearchResponse();
        // Map fields from domainResult to response
        response.setHasError(domainResult.isHasError());
        response.setErrorMessage(domainResult.getErrorMessage());
        response.setFlights(domainResult.getFlightOptions());
        // ... map other fields

        return response;
    }
}
