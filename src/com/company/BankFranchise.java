package com.company;

import java.util.Scanner;

public class BankFranchise {

    public static void main(String[] args) {
// this is a test comment
    Scanner scan = new Scanner(System.in);
    Bank bank1 = new Bank();
    Bank bank2 = new Bank();
    int menuChoice = -1;  //needs an input for a text based ATM
    int bankNum = 1; //easier to keep track of bank 1 or bank 2 with numbers over a string
    double amt = 0; // for withdrawing or depositing custom amounts

    bank1.setName("Wells Fargo");
    bank1.setValue(100000);
    bank2.setName("US Bank");
    bank2.setValue(100000);


    while(menuChoice != 5){
        System.out.println("[1] switch banks");
        System.out.println("[2] make a deposit");
        System.out.println("[3] make a withdraw");
        System.out.println("[4] check balance");
        System.out.println("[5] exit");
        if(bankNum == 1)
            System.out.print("Welcome to "+bank1.getName()+". Please select from the above menu options:");
        else
            System.out.print("Welcome to "+bank2.getName()+". Please select from the above menu options:");
        menuChoice = scan.nextInt();

        if(menuChoice == 1)
            bankNum = bankNum*-1;
        else if(menuChoice == 2){
            if(bankNum == 1){
                System.out.print("How much do you want to deposit in your "+bank1.getName()+" account?");
                amt = scan.nextDouble();
                bank1.deposit(amt);
            }else {
                System.out.print("How much do you want to deposit in your "+bank2.getName()+" account?");
                amt = scan.nextDouble();
                bank2.deposit(amt);
            }
        } else if(menuChoice == 3){
            if(bankNum == 1){
                System.out.print("How much do you want to withdraw from your "+bank1.getName()+" account?");
                amt = scan.nextDouble();
                bank1.withdraw(amt);
            }else {
                System.out.print("How much do you want to withdraw from your "+bank2.getName()+" account?");
                amt = scan.nextDouble();
                bank2.withdraw(amt);
            }
        } else if(menuChoice == 4){
            if(bankNum == 1)
                bank1.checkBalance();
            else
                bank2.checkBalance();
        } else if(menuChoice == 5)
            break;
        else
            System.out.println("I dont understand what you want to do.");

        for(int x=1; x<6; x++){
            System.out.println("\b");
        }
    }

    for(int x=1; x<3; x++){
        System.out.println("\b");
    }
    System.out.println("Have a nice day!");











    }
}
