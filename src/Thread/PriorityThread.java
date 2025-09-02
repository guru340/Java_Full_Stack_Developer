package Thread;
class MyThread2 extends Thread{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getPriority());
    }
}
public class PriorityThread {
    static void main() {
        MyThread2 t=new MyThread2();
        t.setPriority(Thread.MIN_PRIORITY);



        MyThread2 t1=new MyThread2();
        t1.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t.start();
    }
}
