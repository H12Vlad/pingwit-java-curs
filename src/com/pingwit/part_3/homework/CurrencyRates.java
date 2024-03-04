
package com.pingwit.part_3.homework; // добавь в конце строки абзац, чтобы отделить пакет от названия класса

public class CurrencyRates {
    public static void main(String[] args) {
        int zloty = 10;
        int currencyId = 2;
        double convertedZloty;
        switch (currencyId) {
            case 1:
                convertedZloty = zloty * 4.00;
                System.out.println("Currency to Dollars: " + convertedZloty);
                break;
            case 2:
                convertedZloty = zloty * 0.048;
                System.out.println("Currency to Indian rupees: " + convertedZloty);
                break;
            case 3:
                convertedZloty = zloty * 4.32;
                System.out.println("Currency to Euro: " + convertedZloty);
                break;
            case 4:
                convertedZloty = zloty * 0.13;
                System.out.println("Currency to Egyptian pound: " + convertedZloty);
                break;
            default:
                System.out.println("Identification ID issue: ");
        }
    }
}
