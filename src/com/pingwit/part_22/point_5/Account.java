package com.pingwit.part_22.point_5;

import java.math.BigDecimal;
public class Account {
    private String id;
    private String currency;
    private Double amount;
    private User user;

    public Account(String id, String currency, Double amount, User user) {
        this.id = id;
        this.currency = currency;
        this.amount = amount;
        this.user = user;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", currency='" + currency + '\'' +
                ", amount=" + amount +
                ", user=" + user +
                '}';
    }
}
