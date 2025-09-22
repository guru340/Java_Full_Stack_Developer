package org.example;

public class Student {


    public Course course;
//  Dependency Injection
//    Setter Injection
    public void setCourse(Course course) {
        this.course = course;
    }
//    Constructor Injection
    public Student() {

    }
public Student(Course course) {
    this.course = course;
}

    public void study(){
        int start=course.Enroll();
        if (start>=1){
            System.out.println("New Journey Started.......");
        }
        else{
            System.out.println("Payment Failed........");
        }
    }
}
