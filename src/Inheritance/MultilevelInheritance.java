package Inheritance;

public class MultilevelInheritance {
    public static void main(String[] args) {

        Three three = new Three();
        three.sumit();
        three.kumar();
        three.rai();


    }

    public static class one{

        void sumit(){
            System.out.println("i am from function  sumit");
        }
    }

    public static class Two extends one{

        void kumar() {
           // super.printSomething();
            System.out.println("i am from function  kumar");
        }
    }

    public static class Three extends Two{
        void rai() {
            //super.printSomething();
            System.out.println("i am from function  rai");
        }
    }
}
