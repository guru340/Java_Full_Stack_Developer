package StaticMethod;

interface  A{
    static void sayHello(){
        System.out.println("Hello Mitr");
    }
}
public class Main implements A{
    static void main() {
        Main main=new Main();
        A.sayHello();

    }
}
