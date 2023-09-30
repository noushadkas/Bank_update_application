package bank_application;

import java.util.UUID;

public class SBI implements BankInterface{


    private int balance;
private String accountNo;
private String password;
public  String name;
public  static int rateOfInterest;


    public  SBI(int balance, String password , String name){

        this.accountNo= UUID.randomUUID().toString();
        this.balance = balance;
        this.password=password;
        this.name=name;
    }



        @Override
    public int checkBalance(String password) {
    if(password==this.password){
        return balance;
    }
    return -1;

    }


    @Override
    public String addMoney(int money) {


            balance = balance+money;
        String message = money+ " has been added to the account "+accountNo+""+
                "the total balance is now "+balance;
            return message;
    }

    @Override
    public String withdrawMoney(int drawMoney, String password) {
            if(password==this.password){

                if(drawMoney>balance){
                    return "Insufficent balance";
                }
                else{
                    balance = balance-drawMoney;

                   return  "Money withdrawn suceessfully. Total balance is "+balance;
                }

            }
            else{
                return "Wrong password";
            }

        }



    @Override
    public String changePassword(String oldPassword, String newPassword) {
        if(this.password.equals(oldPassword)){
            //compareTo could be used
            this.password = newPassword;
            return "Password has been updated is successfully ";

        }
        else{
            return "Wrong Password";
        }
    }

    @Override
    public double calculateTotalInterest(int years) {

        double interest = balance * years *rateOfInterest/100;
        return interest;
    }
}


