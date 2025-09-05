package Sorting;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorDemo {
    static void main() {
        TreeSet<Student> ls=new TreeSet<>(new Mycomparator());
        ls.add(new Student(1,"Mayank",25));
        ls.add(new Student(5,"Maank",20));
        ls.add(new Student(8,"Myank",2));
        ls.add(new Student(6,"Mynk",5));
        System.out.println(ls);

        Comparator<Student> byroll=(s1, s2)->s1.no-s2.no;
        Comparator<Student> studentComparator = Comparator.comparing(Student::getName)
                .thenComparing(Student::getNo);
    }
}
