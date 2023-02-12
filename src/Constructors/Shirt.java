package Constructors;

public class Shirt {


    public static int size;
    public static String Colour;

    public  Shirt(){
        System.out.println("1st Constructor");
    }

    public Shirt(String NewColour, int NewSize) {
        size = NewSize;
        Colour = NewColour;

    }

    public void putOn() {
        System.out.println("Shirt is put on ");
    }

    public void putOff() {
        System.out.println("Shirt is put off");
    }


}
