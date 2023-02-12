package Encapsulation;

public class FindArea {
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {

        this.breadth = breadth;
    }

    int length;
    int breadth;

//    FindArea(int length , int breadth){
//        this.length = length;
//        this.breadth = breadth;
//
//    }

    public void getArea(){
        int area = length * breadth;
        System.out.println(area);
    }
}
