package com.unitedcoder.conditions;

import java.util.Scanner;

public class ATMDemo2 {
    public static void main(String[] args) {
        int pin=1234;
        int balance = 10000;
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter your password:");
        String password=input.nextLine();
        if (Integer.parseInt(password)==pin) {
            System.out.println("Please select the menu: Transfer money, Deposit money, Withdraw money");
            String menu=input.nextLine();
            if (menu.equalsIgnoreCase("withdraw money")) {
                System.out.println("Your balance is " + balance);
                System.out.println("Please enter withdraw amount:");
                int withdrawAmount = input.nextInt();
                if (withdrawAmount <= balance) {
                    System.out.println("Please take your money, Enjoy!!!");
                    System.out.printf("Your current balance is %d", balance - withdrawAmount);
                } else {
                    System.out.println("Withdraw amount is greater than your balance!");
                }
            } else if (menu.equalsIgnoreCase("deposit money")){
                System.out.println("Please put your money into the ATM");
                int depositAmount =input.nextInt();
                System.out.println(String.format("You have deposit amount %d ",depositAmount));
                System.out.printf(String.format("Your current balance is %d",balance+depositAmount));
            } else if (menu.equalsIgnoreCase("transfer money")){
                System.out.println("Please enter Iban number and transfer amount:");
                input.nextLine();
                int transferAmount=input.nextInt();
                if (transferAmount <=balance){
                    System.out.println("Transfer successful!");
                    System.out.println(String.format("Your current balance is %d",balance-transferAmount));

                }else {
                    System.out.println(String.format("Insufficient balance!!!\nYour balance is %d,\nPlease enter amount less than your balance!",balance));
                }
            }
        } else {
            System.out.println("Please enter correct pin number.");
        }
    }

}
