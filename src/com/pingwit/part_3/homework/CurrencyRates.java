package com.homeworks_part3;

public class CurrencyRates {
    public static void main(String[] args) {
        int dollars = 22;
        int currencyId = 1;

        double convertedDollars;
        switch (currencyId){
            case 1:
                convertedDollars = dollars * 4.28;
                System.out.println("Currency to Dollarss: " + convertedDollars);
                break;
            default:
                System.out.println("Problem identifical ID");



            }

        }

    }
