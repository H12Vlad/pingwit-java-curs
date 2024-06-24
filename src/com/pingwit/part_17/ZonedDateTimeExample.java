package com.pingwit.part_17;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;
public class ZonedDateTimeExample {
    public static void main(String[] args) {
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(availableZoneIds);

        ZonedDateTime now = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("toString=" + now);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH-mm-ss VV");
        ZonedDateTime parsedZonedDateTime = ZonedDateTime.parse("10-Nov-1999 12-54-00 America/New_York", dtf);
        System.out.println(dtf.format(parsedZonedDateTime));
        System.out.println(dtf.format(now));
    }
}
