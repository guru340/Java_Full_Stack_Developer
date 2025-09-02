package Sync;

public class TablePrintMethod {
    public synchronized void print(int n){
        for (int i=0;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+" : "+(n*i));
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
