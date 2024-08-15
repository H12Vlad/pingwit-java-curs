package com.pingwit.part_22.homework.task_2;

import java.time.LocalDate;

public class WebSiteStatistic {
    private String username;
    private String website;
    private LocalDate visitDate;

    public WebSiteStatistic(String username, String website, LocalDate visitDate) {
        this.username = username;
        this.website = website;
        this.visitDate = visitDate;
    }

    public String getUsername() {
        return username;
    }

    public String getWebsite() {
        return website;
    }

    public LocalDate getVisitDate() {
        return visitDate;
    }
}