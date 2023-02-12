package Inheritance;

public class InheritanceBasic {
    public static void main(String[] args) {
        Son son = new Son();
        son.Height();


    }

    //why we need Inheritance
    /*
    code usability
    method overriding
    Abstraction

    Inheritance is a main pillar of op's. it's a feature by witch one class is allowed to inheritance
    all the properties of another class

     */

    public static class  Father{

        void Height(){
            System.out.println("Father height is 6 feet ");
        }
    }

    public static class Son extends Father{


        @Override
        void Height() {
            //super.Height();
            System.out.println("son height is 6 feet");
        }
    }


}
