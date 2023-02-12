package Abstractions;

public class AbstractionsExample {


    interface MainCar {
        void start();
        //abstract meaning
        //existing in thought or as an idea but not having a physical or concrete existence.
    }

     public static class Car extends Vehicle implements TwoWheeler {

          void start() {
            System.out.println("start");
        }
    }

    public static class Vehicle implements TwoWheeler, ThreeWheeler, FourWheeler {


        @Override
        public void startByKey() {

        }

        @Override
        public void startByKick() {

        }

        @Override
        public void startByHand() {

        }
    }

    public static void main(String[] args) {

        Vehicle bmw = new Vehicle();
        bmw.startByHand();

    }
}
