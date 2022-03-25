package com.company;

public class Account {
    private String name;
    private String number;
    private double balanceQuantity;
    private double balance;

    public Account (String number, String name, double balance, double balanceQuantity) {
        this.number = number;
        this.name = name;
        this.balance = balance;
        this.balanceQuantity = balanceQuantity;
    }

    public String getNumber() { return number; }

    public void setNumber(String number) { this.number = number; }

    public String getName () { return name; }

    public void setName(String name) { this.name = name; }

    public double getBalanceQuantity() { return balanceQuantity; }

    public void setBalanceQuantity(double balanceQuantity) { this.balanceQuantity = balanceQuantity; }

    public double getBalance() { return balance; }

    public void setBalance(double balance) { this.balance = balance; }

    @Override
    public String toString() {
        return "Number - " + getNumber() + "; Name - " + getName() + "; Quantity - " + getBalanceQuantity() + "; Balance - " + getBalance();
    }
}