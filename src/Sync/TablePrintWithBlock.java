package Sync;

public class TablePrintWithBlock {
    public  void print(int n){
        synchronized (this){
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
}
