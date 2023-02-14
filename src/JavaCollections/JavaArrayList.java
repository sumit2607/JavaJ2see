package JavaCollections;

import java.util.ArrayList;

public class JavaArrayList {

    //java arraylist uses a dyanamic aray for stoaring the element. it is like an array, but there us no size limit
    //we can add or remove element anytime
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(4);
        al.add(4);
        al.add(4);
        al.add(4);
        al.add(4);
        al.add(4);
        al.add(4);
        al.add(4);
        al.add(4);
        al.add(4);
        al.remove(3);
        al.size();
        //al.addAll(1,2);
        System.out.println(al.size());
        System.out.println(al.contains(1));


        if (al.contains(1)){
            System.out.println("hahahahha");
        }else {
            System.out.println("noooo");
        }
    }
}
