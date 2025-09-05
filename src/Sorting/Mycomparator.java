package Sorting;

import java.util.Comparator;

public class Mycomparator implements Comparator<Student> {


    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }
}
