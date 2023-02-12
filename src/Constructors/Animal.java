package Constructors;

public class Animal {

    public static String colour;
   public static int legs;


   public Animal(){

       System.out.println("this is dafult");

   }

    public Animal(String NewColour, int Newlegs){
        colour = NewColour;
        legs = Newlegs;


    }

   public void  walk(){
        System.out.println("walking");
    }



}
