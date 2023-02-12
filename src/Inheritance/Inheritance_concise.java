package Inheritance;

public class Inheritance_concise {

    public static void main(String[] args) {

        Engineer e1 = new Engineer();
        int salary = e1.salary;
        System.out.println(salary+ e1.benefit);
    }

    public static class  Employee{
        int salary = 90000;
    }

    public static class  Engineer extends  Employee{
        int benefit = 30000;
    }
}
