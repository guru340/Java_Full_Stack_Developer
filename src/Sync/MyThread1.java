package Sync;

public class MyThread1 extends Thread {
    TablePrintMethod t;
    MyThread1(TablePrintMethod t){
        this.t=t;
    }
    @Override
    public void run(){
        t.print(5);
    }
}
