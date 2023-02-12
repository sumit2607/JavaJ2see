package Abstractions.Practice;

public class AbsPractice {

    abstract public static class Pen {
        void write() {
            System.out.println("Pen can Write");
        }

        void Refill() {

            System.out.println("Pen Can Refill");

        }
    }

    public class Q1 extends Pen {
        @Override
        void Refill() {
            super.Refill();
        }

        @Override
        void write() {
            super.write();
        }

        void ChangeNib() {

        }
    }


    public static class Monkey {

        void Bite() {

        }

        void Jump() {

        }
    }


    public static class Human extends Monkey implements BasicAnimal {
        @Override
        public void eat() {

        }

        @Override
        public void step() {

        }

        @Override
        void Bite() {
            super.Bite();
        }

        @Override
        void Jump() {
            super.Jump();
        }
    }

   abstract public static class Telephone{

       abstract void Ring();

      abstract void DiscConnect();

   }


   public static class SmartPhone extends Telephone{


       @Override
       void Ring() {

       }

       void Ring(int i) {
           i = 1;

           System.out.println(i);

       }

       @Override
       void DiscConnect() {

       }
   }




    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.Ring(1);

    }
}
