package com.company;

public class Bank {

    private String name;
    private double cashInVault;

    public void setName(String newName){
        name = newName;
    }

    public String getName(){
        return name;
    }

    public void setValue(double X){
        cashInVault = X;
    }

    public void deposit(double x){
        cashInVault = cashInVault + x;
        System.out.println(name+" has accepted a deposit of "+x+", the updated balance is "+cashInVault);
    }

    public void withdraw(double x){
        cashInVault = cashInVault - x;
        System.out.println(name+" has withdrawn an amount of "+x+", the updated balance is "+cashInVault);
    }

    public void checkBalance(){
        System.out.println("The current balance is "+cashInVault);
    }
}
