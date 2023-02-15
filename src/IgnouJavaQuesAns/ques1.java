package IgnouJavaQuesAns;

public class ques1 {
    //Write a Java program to create student class. Define proper constructor to initialize
    //student class object. Define methods to get details of any student (the details may
    //include student name, address, program of study, age). You need to take care of
    //exceptions handling in this program.
    public static void main(String[] args) {
        getDetail();
    }

    private static void getDetail() {
        Student student = new Student("Sumit Rai", 244, 25);
        System.out.println(student.age);
        System.out.println(student.name);
        System.out.println(student.rollNo);
    }


    public static class Student{

        String  name;
        int  rollNo;
        int  age;
        Student(String name, int rollNo,  int age){
            this.name = name;
            this.age = age;
            this.rollNo = rollNo;
        }
    }
}
