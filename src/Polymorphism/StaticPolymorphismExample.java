package Polymorphism;

public class StaticPolymorphismExample {
    public static void main(String[] args) {

        int a = 10;
        int b = 100;
        double c = 1.2f;
        double d = 10.00;

        System.out.println(mathsCalculator(a, b));
        mathsCalculator(c, d);


    }

    //method overloading
    //ans = multiple function with same name but with different parameter




    /*
    what is the need of Polymorphism or advantage of Polymorphism
    Programmers code can be reused via Polymorphism.
    Supports a single variable name for multiple data types.
    Reduces coupling between different functionalities.



     */

    //
    //compile time polymorphism or static polymorphism or method overloading
    //It is also known as static polymorphism. This type of
    // polymorphism is achieved by function overloading or operator overloading.
    private static boolean mathsCalculator(int a, int b) {
        System.out.println(a*b);

        return false;
    }

    private static void mathsCalculator(Double a, Double b) {

        System.out.println(a*b);


    }

    private static void mathsCalculator(Float a, Float b) {
        System.out.println(a*b);

    }

    private static void mathsCalculator(Float a, Float b, Float c) {
        System.out.println(a*b);

    }




    //run time polymorphism Method Overriding






}
