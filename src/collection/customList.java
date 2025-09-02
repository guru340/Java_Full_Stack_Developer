package collection;

import OOPS.Student;

import java.util.ArrayList;
import java.util.List;

class student{
    int id;
    String name;
    String course;

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
                '}';
    }

    public student(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }


}
public class customList {
    static void main(String[] args) {
        student n1=new student(12,"Sonal","BBA");
        student n2=new student(11,"Mayank","B.tech");
        List<student> s1=new ArrayList<>();
        s1.add(n1);
        s1.add(n2);
        System.out.println(s1);
    }

}
