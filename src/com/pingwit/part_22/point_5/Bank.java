package com.pingwit.part_22.point_5;
import java.util.HashMap;
import java.util.Map;
public class Bank {
    private String name;
    private Map<String, Account> accountsById = new HashMap<>();

    public Bank(String name) {
        this.name = name;
    }

    public Map<String, Account> getAccountsById() {
        return accountsById;
    }

    public void setAccountsById(Map<String, Account> accountsById) {
        this.accountsById = accountsById;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", accountsById=" + accountsById +
                '}';
    }
}
