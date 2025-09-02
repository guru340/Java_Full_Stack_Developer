package Thread;
class Mythread extends Thread{
    @Override
    public void run(){
        System.out.println("Thread Chlid Class");
    }
}
public class ThreadDemo {
    public static void main(String[] args) {
        Mythread th=new Mythread();
        th.start();
    }
}
