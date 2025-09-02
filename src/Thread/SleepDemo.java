package Thread;
class SleepThread extends Thread{
    @Override
    public void run() {
        for (int i=1;i<5;i++){
            System.out.println(getName()+"-------"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread Interupted");
            }
        }
    }
}
public class SleepDemo {
    static void main() {
        System.out.println(Thread.currentThread().getName());
        SleepThread t1=new SleepThread();
        t1.start();
    }
}
