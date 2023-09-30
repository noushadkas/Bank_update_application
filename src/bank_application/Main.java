package bank_application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        SBI.rateOfInterest=7;
        HdfcBank.rateOfInterest=6;
        SBI account1 = new SBI(50000, "123","dev");
        SBI account2 = new SBI(200000, "456", "Rakshit");

        HdfcBank account3 = new HdfcBank(150000,"789", "mehran");

      //wrong password check balance
        int balance = account1.checkBalance("124");
        System.out.println("the account balancwe is "+balance);
        //right  password check balance
        int balanceCheck = account1.checkBalance("123");
        System.out.println("the balance for account is"+balanceCheck);

     //add money in the money then total money
        String bankMessage=account2.addMoney(50000);
        System.out.println(bankMessage);

        //wron password

        String message=account3.withdrawMoney(50000,"1234");
        System.out.println(message);

    //right passowrd
        String message1= account3.withdrawMoney(50000,"789");
        System.out.println(message1);
// sbi bank
          double interest = account1.calculateTotalInterest(20);
        System.out.println("the interest money you will get is "+interest);
       //HDFC account
        double interest1 = account3.calculateTotalInterest(20);
        System.out.println("the total interest you will get"+interest1);

//
//        System.out.println("make it dynamic ");
//        System.out.println("welcome tp sbi , please enter the detail to create the account");
//        System.out.println("enter name");
//        Scanner sc = new Scanner(System.in);
//
//        String name =sc.next();
//
//        System.out.println("enter the balance ");
//        int initalBalance = sc.nextInt();
//        System.out.println("enter the password");
//
//        String password = sc.next();
//        SBI sbiAccount = new SBI(initalBalance, password, name);
//
//        System.out.println("enter the money and password to add");


        }


    }


