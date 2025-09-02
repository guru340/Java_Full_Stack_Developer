package Exceptionhandling;

public class ExceptionIndepth {
    public static void main(String[] args) {
        m1();
    }
    public static void m1(){
      m2();
        System.out.println("Hello m1");
    }
    public static void m2(){
        m3();
        System.out.println("Hello m1");
    }
    public static void m3(){
        System.out.println(10/0);
        System.out.println("Hello m1");
    }
}
