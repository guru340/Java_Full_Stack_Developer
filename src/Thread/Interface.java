package Thread;

class MyTask implements Runnable{

    @Override
    public void run() {
        System.out.println("Runnable...");
    }
}
public class Interface {
    public static void main(String[] args) {
        Thread t=new Thread();
        t.start();
    }
}
