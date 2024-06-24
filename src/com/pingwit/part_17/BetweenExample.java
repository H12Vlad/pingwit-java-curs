package com.pingwit.part_17;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class BetweenExample {
    public static void main(String[] args) {
        LocalDate newYear = LocalDate.of(2023, 12, 31);
        System.out.println(newYear);

        long betweenDays = ChronoUnit.DAYS.between(newYear, newYear.plusDays(1));
        System.out.println("betweenDays=" + betweenDays);

        long betweenMonths = ChronoUnit.MONTHS.between(newYear, newYear.plusDays(1));
        System.out.println("betweenMonths=" + betweenMonths);

        newYear = newYear.plusDays(1);
        System.out.println(newYear);
    }
}
