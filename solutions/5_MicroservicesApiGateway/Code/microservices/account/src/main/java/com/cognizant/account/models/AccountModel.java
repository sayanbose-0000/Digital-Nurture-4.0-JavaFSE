package com.cognizant.account.models;

public class AccountModel {
    private String number;
    private String type;
    private int balance;
    
    public AccountModel(String number, String type, int balance) {
        this.number = number;
        this.type = type;
        this.balance = balance;
    }
    
    
    public String getNumber() {
        return number;
    }
    
    public String getType() {
        return type;
    }
    
    public int getBalance() {
        return balance;
    }
}