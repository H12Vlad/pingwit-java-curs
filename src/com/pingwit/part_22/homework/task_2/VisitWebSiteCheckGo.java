package com.pingwit.part_22.homework.task_2;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

// очень хорошо
public class VisitWebSiteCheckGo {
    public static void main(String[] args) {
        List<WebSiteStatistic> visits = new ArrayList<>();
        visits.add(new WebSiteStatistic("Alice", "example.com", LocalDate.of(2024, 12, 10)));
        visits.add(new WebSiteStatistic("Bob", "example.com", LocalDate.of(2024, 8, 15)));
        visits.add(new WebSiteStatistic("Charlie", "example.com", LocalDate.of(2024, 5, 25)));
        visits.add(new WebSiteStatistic("Alice", "another-site.com", LocalDate.of(2019, 8, 12)));
        visits.add(new WebSiteStatistic("Bob", "another-site.com", LocalDate.of(2023, 10, 5)));
        visits.add(new WebSiteStatistic("Charlie", "another-site.com", LocalDate.of(2023, 1, 18)));
        visits.add(new WebSiteStatistic("Dave", "example.com", LocalDate.of(2003, 5, 20)));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter month (1-12): ");
        int monthInput = scanner.nextInt();
        Month selectedMonth = Month.of(monthInput);

        Map<String, Set<String>> siteVisits = new HashMap<>();

        for (WebSiteStatistic visit : visits) {
            if (visit.getVisitDate().getMonth() == selectedMonth) {
                String site = visit.getWebsite();
                String user = visit.getUsername();

                siteVisits.putIfAbsent(site, new HashSet<>());
                siteVisits.get(site).add(user);
            }
        }

        for (Map.Entry<String, Set<String>> entry : siteVisits.entrySet()) {
            String site = entry.getKey();
            int userCount = entry.getValue().size();
            System.out.println("Сайт: " + site + " | Количество уникальных пользователей: " + userCount);
        }
    }
}