package BankingSystemUsingOOps;

import java.util.Scanner;

public class BankProject {
    //Initially, the program accepts the number of customers
    // we need to add and adds the customer and account details
    // accordingly. Further, it displays the series of menus to operate over the accounts.
    //
    //The series of menus displayed are as follows:
    //
    //Display all account details
    //Search by account number
    //Deposit the amount
    //Withdraw the amount

    //Exit

    public static void main(String[] args) {
        BankDetails bankDetails = new BankDetails();
        String finaAcc = bankDetails.getName();
        bankDetails.openAccount();
        bankDetails.displayAccount();


        System.out.println("********** Banking Application System************");
        System.out.println("Select Options b/t 1 to 5");
        System.out.println("1.Display All Account");
        System.out.println("2.Search By Account Number");
        System.out.println("3.Deposit Money");
        System.out.println("4.Withdrawal Money");
        System.out.println("5.Exit");
        System.out.println("Enter Your Choice");
        Scanner sc = new Scanner(System.in);
        int selected = sc.nextInt();

        switch (selected) {
            case 1 -> bankDetails.displayAccount();

            case 2 -> bankDetails.searchAccountByNo();

            case 3 -> bankDetails.depositMoney();

            case 4 -> bankDetails.withdrawBalance();

            case 5 -> System.out.println("Thanks for choosing us");

            default -> System.out.println("please chose option between 1 to 5");

        }


    }
}
