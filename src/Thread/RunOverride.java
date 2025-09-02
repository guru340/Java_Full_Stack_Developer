package Thread;

class MyRun extends Thread{

}
public class RunOverride {
    public static void main(String[] args) {
        MyRun th=new MyRun();
        th.start();
        System.out.println("Main");
    }
}
