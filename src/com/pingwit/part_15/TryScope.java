package com.pingwit.part_15;

public class TryScope {
    public static void main(String[] args) {
        String text = "dfdfdf";
        try {
            text = "121313";

        } catch (Exception e) {
            System.out.println("Exception produced by: " + text);
        } finally {

        }
    }
}