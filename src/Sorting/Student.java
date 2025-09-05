package Sorting;

public class Student {
    int marks;
    String name;
    int no;

    public Student(int marks, String name, int no) {
        this.marks = marks;
        this.name = name;
        this.no = no;
    }

    @Override
    public String toString() {
        return "Student{" +
                "marks=" + marks +
                ", name='" + name + '\'' +
                ", no=" + no +
                '}';
    }

    public int getNo() {
        return no;
    }

    public void setNo(int roll) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}
