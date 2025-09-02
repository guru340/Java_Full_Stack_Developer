package Sync;

public class TesatSync {
    static void main() {
        System.out.println("Sync Method.....................................");
        TablePrintMethod t=new TablePrintMethod();
        Thread t1=new MyThread1(t);
        Thread t2=new MyThread1(t);
        t1.setName("T1");
        t2.setName("T2");

        t1.start();
        t2.start();

        try{
            System.out.println("Main Thread Creating");
            t1.join();
            t2.join();
            System.out.println("Mina Thread Created");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
