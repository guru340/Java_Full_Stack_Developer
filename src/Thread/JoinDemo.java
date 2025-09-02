package Thread;
class JoinThread extends Thread{
    @Override
    public void run() {
        for (int i=1;i<=5;i++){
            System.out.println("Child -Thread");
        }
    }
}
public class JoinDemo {
    static void main() throws InterruptedException{
        JoinThread t1=new JoinThread();
        t1.start();
        t1.join();//main-jo line excute krega wahi wait krega
        for (int i=1;i<=5;i++){
            System.out.println("Main-Thread");
        }
    }
}
