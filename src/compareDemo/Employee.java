package compareDemo;

import java.util.Comparator;

public class Employee implements Comparator<Employee> {
 int id;
 String name;
 String dept;

    public Employee(int id, String name, String dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }

    public Employee() {

    }

    @Override
    public int compare(Employee o1, Employee o2) {
        Employee e1 = (Employee) o1;
        Employee e2 = (Employee) o2;
        return e1.id -e2.id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept=" + dept +
                '}';
    }
}
