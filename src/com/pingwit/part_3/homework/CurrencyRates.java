
package com.pingwit.part_3.homework;

// отформатируй код
public class CurrencyRates {
    public static void main(String[] args) {
        int zloty = 10;
        int currencyId = 2;

        double convertedZloty;
        switch (currencyId) {
            case 1: // как насчет добавить больше 1 кейса?
                convertedZloty = zloty * 4.00;
                System.out.println("Currency to Dollars: " + convertedZloty); // опечатка в слове Dollarss
                break;
            case 2: // как насчет добавить больше 1 кейса?
                convertedZloty = zloty * 0.048;
                System.out.println("Currency to Indian rupees: " + convertedZloty);
                break;
            case 3: // как насчет добавить больше 1 кейса?
                convertedZloty = zloty * 4.32;
                System.out.println("Currency to Euro: " + convertedZloty);
                break;
            case 4: // как насчет добавить больше 1 кейса?
                convertedZloty = zloty * 0.13;
                System.out.println("Currency to Egyptian pound: " + convertedZloty);
                break;

            default:
                System.out.println("Identification ID issue: "); // думаю над текстом ошибки еще стоит поработать
        }
    }
}
