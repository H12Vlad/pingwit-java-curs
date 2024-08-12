package com.pingwit.part_22.point_5;
import java.util.Map;
public class BankExample {
    public static void main(String[] args) {
        User egorka = new User("Egorka", "Pingwit", "WorldPassport");
        User mop = new User("MOP", "Roborock", "ChinaPassport");
        User olya = new User("Olya", "Skladowska", "PolishPassport");

        Bank bank = new Bank("GoldmanSuxx");

        Map<String, Account> accounts = Map.of(
                "WorldPassport", new Account("WorldPassport", "USD", 1700.0, egorka),
                "ChinaPassport", new Account("ChinaPassport", "USD", null, mop),
                "PolishPassport", new Account("PolishPassport", "USD", 0.0, olya)
        );

        bank.setAccountsById(accounts);

        System.out.println("Before transaction");
        for (Map.Entry<String, Account> stringAccountEntry : bank.getAccountsById().entrySet()) {
            System.out.println(stringAccountEntry);
        }
        BankService bankService = new BankService();
        boolean sendResult = bankService.send(egorka, bank, -1000.0, "ChinaPassport");

        System.out.println("sendResult: " + sendResult);

        System.out.println("After transaction");
        for (Map.Entry<String, Account> stringAccountEntry : bank.getAccountsById().entrySet()) {
            System.out.println(stringAccountEntry);
        }
    }
}
