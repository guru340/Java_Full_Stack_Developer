package Thread;
class MyThread1 extends Thread{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}
public class ThreadClass {
    static void main() {
        System.out.println(Thread.currentThread().getName());
        Thread t= Thread.currentThread();
        t.setName("Mayank Thread");
        System.out.println(Thread.currentThread().getName());
        MyThread1 t1=new MyThread1();
        t1.start();

    }


}
