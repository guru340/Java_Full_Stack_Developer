package OOPS;

import java.sql.SQLOutput;

public class Course {
    String name;
    int Rollno;
//    Default constructor
//    Course(){
//        System.out.println("Counstructor Called......");
//    }
    Course(String name){
        System.out.println(name);
        System.out.println("Para Constructor Called......");
    }

    public static void main(String[] args) {
        System.out.println("Before object Create");
        Course c=new Course("Java");
//        c.name="Java";
//        System.out.println("After object Create");
//        c.learn(c);
        Course c2=new Course("DSA");



    }
    public  static void learn(Course c){
        System.out.println("We are Learning"+c.name);
    }

}
