package com.pingwit.part_22.point_5;
import java.util.Map;
public class BankService {
    boolean send(User user, Bank bank, Double amount, String toUserId) {
        validateSendingAmount(amount);

        Map<String, Account> bankAccountsById = bank.getAccountsById();
        Account account = bankAccountsById.get(user.passport());

        Double accountAmount = account.getAmount();

        if (accountAmount < amount) {
            throw new IllegalArgumentException("Sorry, not enough money, available to send: " + accountAmount);
        }

        account.setAmount(accountAmount - amount);

        Account toAccount = bankAccountsById.get(toUserId);

        Double toAccountAmount = toAccount.getAmount();
        if (toAccountAmount == null) {
            toAccount.setAmount(amount);
        } else {
            toAccount.setAmount(toAccount.getAmount() + amount);
        }

        return true;
    }

    private static void validateSendingAmount(Double amount) {
        if (amount == null) {
            throw new IllegalArgumentException("You cant send null money");
        }

        if (amount <= 0) {
            throw new IllegalArgumentException("You can't send negative or zero amount of money");
        }
    }
}
