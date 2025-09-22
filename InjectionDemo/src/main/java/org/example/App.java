package org.example;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        Student stu=new Student();

//        Dependency Injection
        stu.course=new DSA();
        stu.study();
    }
}
