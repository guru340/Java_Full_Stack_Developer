package collection.compareDemo;

public class Student implements Comparable<Student>{
    int id;

    @Override
    public int compareTo(Student o) {
        return this.id-o.id;
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    String name;
}
