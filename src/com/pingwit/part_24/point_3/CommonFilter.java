package com.pingwit.part_24.point_3;

public class CommonFilter {
    boolean filter(Integer x) {
        return x < 10;
    }

    boolean filter(String x) {
        return Integer.valueOf(x) > 0;
    }

    static boolean staticFilter(Integer x) {
        return x != 5;
    }
}
