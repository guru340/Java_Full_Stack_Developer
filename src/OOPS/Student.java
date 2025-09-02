package OOPS;

public class Student {
    String name;
    int age;

    Student(int i, String sonal, String bba){
//        It Will call the parametized Construtor,it never give null when you it will pass to para constructot
            this("Unknown",0);
    }
    Student(String name,int age){
            this.name=name;
            this.age=age;
    }

    public static void main(String[] args) {
        Student s1=new Student(12, "Sonal", "BBA");
        s1.StudentDetails();
        Student s2=new Student("java",12);
        s2.StudentDetails();
    }
    void StudentDetails(){
        System.out.println("name"+name+"age"+age);
//        Here this will call the default constuctor ,So here it will print Unknown
        hello(this);
    }
    void hello(Student s){
        System.out.println("Hello");

    }
}
