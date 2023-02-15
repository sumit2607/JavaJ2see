package IgnouJavaQuesAns;

import java.util.Scanner;

public class MakeCalculator {

    //Write a Java program to create a simple calculator. This calculator should perform
    //+, —, *, /. You need to take care of exceptions handling properly in this program.
    public static void main(String[] args) {
        getCalculation();

    }

    private static void getCalculation() {
        System.out.println("Please Select between 1 to 5,      " +
                "1 for plus , 2 for minus , 3 for divide, 4 multiply");
        Scanner sc = new Scanner(System.in);
        int selected = sc.nextInt();
        System.out.println("please select first number");
        int firstNumber = sc.nextInt();
        System.out.println("Please select second Number");
        int secondNumber = sc.nextInt();
        switch (selected) {

            case 1 -> {
                plusNumber(firstNumber, secondNumber);
                break;
            }

            case 2 -> {
                minusNumber(firstNumber, secondNumber);
                break;
            }

            case 3 -> {
                divideNumber(firstNumber, secondNumber);
                break;
            }

            case 4 ->{
                multiplyNumber(firstNumber, secondNumber);
            }


            default -> System.out.println("Please select between above input");
        }


    }

    private static void multiplyNumber(int firstNumber, int secondNumber) {

        System.out.println("final result "+firstNumber * secondNumber);
    }

    private static void divideNumber(int firstNumber, int secondNumber) {
        System.out.println(firstNumber / secondNumber);
    }

    private static void minusNumber(int firstNumber, int secondNumber) {
        System.out.println(firstNumber - secondNumber);
    }

    private static void plusNumber(int firstNumber, int secondNumber) {
        System.out.println(firstNumber + secondNumber);
    }
}
