package com.flightproviderb.config;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class LocalDateTimeAdapter extends XmlAdapter<String, LocalDateTime> {

    // Define the ISO format used for XML dateTime
    private final DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;

    @Override
    public LocalDateTime unmarshal(String v) throws Exception {
        if (v == null || v.trim().isEmpty()) {
            return null;
        }
        return LocalDateTime.parse(v, formatter);
    }

    @Override
    public String marshal(LocalDateTime v) throws Exception {
        if (v == null) {
            return null; // Return null if the object is null
        }
        return v.format(formatter);
    }
}