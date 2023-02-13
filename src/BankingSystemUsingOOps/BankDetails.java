package BankingSystemUsingOOps;

import java.util.Scanner;

public class BankDetails {
    public String getName() {
        return name;
    }

    private String name;

    public int getAccNo() {
        return accNo;
    }

    private int accNo;

    private Double balance;
    private Double withdrawBalance;
    private Double depositBalance;
    Scanner sc = new Scanner(System.in);

    public void openAccount() {

        System.out.println("Please Enter Account Number");
        accNo = sc.nextInt();

        System.out.println("Enter your Name");
        name = sc.next();

        System.out.println("Enter account opening Balance");
        balance = sc.nextDouble();


    }

    //method to display account details
    public void displayAccount() {

        System.out.println("your account no is : - " + accNo);
        System.out.println("your name is: -" + name);
        System.out.println("Enter account opening Balance: -" + balance);
    }


    //method for withdraw balance
    public void withdrawBalance() {

        System.out.println("Enter the amount to withdraw Balance");
        withdrawBalance = sc.nextDouble();
        if (balance != null) {
            double v = balance - withdrawBalance;
            System.out.println("thank you for your request your final balance is " + v);

        }

    }

    public void depositMoney() {
        System.out.println("Enter the amount to  deposit");
        depositBalance = sc.nextDouble();
        Double finalBalance = balance + depositBalance;
        System.out.println("Thank you for deposit your balance your final balance is " + finalBalance);

    }

    public void searchAccountByNo() {
        System.out.println("Enter Your Account number to search Your Details");

        if (name != null) {
            System.out.println("your name is " + name);
            System.out.println("your Account no is  " + accNo);
            System.out.println("Your Bank Balance is " + balance);


        }

    }
}
