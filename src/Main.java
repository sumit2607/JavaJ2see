import Constructors.Animal;
import Constructors.Shirt;

import static Constructors.Animal.colour;

public class Main {
    public static void main(String[] args) {
//        Shirt shirt = new Shirt();
//        Shirt shirt1 = new Shirt("Yellow" , 45);
//        shirt.putOn();
//        System.out.println(shirt1.Colour);
//        System.out.println(shirt1.size);

        Animal animal= new Animal("brown" , 4);
        animal.walk();
        System.out.println(animal.colour);
        System.out.println(animal.legs);

    }
}

//if we have default constructors then why we  have to create another cunstructors
//ans   we may requeired to add some parameter
//there is no destructor in java because of Garbage collector
