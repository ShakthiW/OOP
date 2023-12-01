package org.example;

public class BankAccount {

    private double balance;
    private String accountNumber;

    public BankAccount(double initialBalance){
        balance = initialBalance;
    }
    public void deposit(double amount){
        //code
        balance += amount;
    }
    public void withdraw(double amount){
        //code
        balance -= amount;
    }
    public double getBalance(){
        //code
        return balance;
    }
    public void close(){
        //here
        balance = 0;
    }
}