package Polymorphism;

public class DynamicPolymorphism {

    public static void main(String[] args) {


        son john = new son();
        john.walk();

        secondSon JohnSenior = new secondSon();
        JohnSenior.walk();

    }


    public static class Parent {

        void walk() {
            System.out.println("parent is walking");
        }

    }

    public static class son extends Parent {
        @Override
        void walk() {
            System.out.println("walking Differently");
        }
    }

    public static class secondSon extends Parent{

        @Override
        void walk() {
           // super.walk();
            System.out.println("walking 2 step at one time");
        }
    }


}
