package com.pingwit.part_22.point_4;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
public class HashSetExample {
    public static void main(String[] args) {
        Set<Piano> pianos = new HashSet<>();

        pianos.add(new Piano("YAMAHA", "black", true));
        pianos.add(new Piano("YAMAHA", "white", false));
        pianos.add(new Piano("CASIO", "white", true));
        pianos.add(new Piano("Gdańsk", "pink", false));
        pianos.add(new Piano("Gdańsk", "white", false));

        for (Piano piano : pianos) {
            System.out.println(piano);
        }

        System.out.println(pianos.size());

        Map<Piano, Integer> pianosMap = new HashMap();
        pianosMap.put(new Piano("YAMAHA", "black", true), 44);
        pianosMap.put(new Piano("YAMAHA", "white", false), 44);
        pianosMap.put(new Piano("CASIO", "white", true), 44);
        pianosMap.put(new Piano("Gdańsk", "pink", false), 44);
        pianosMap.put(new Piano("Gdańsk", "pink", false), 33);

        for (Map.Entry<Piano, Integer> pianoIntegerEntry : pianosMap.entrySet()) {
            System.out.println(pianoIntegerEntry);
        }
    }
}
