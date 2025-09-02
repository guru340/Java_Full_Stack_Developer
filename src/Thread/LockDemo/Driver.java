package Thread.LockDemo;

public class Driver {
    static void main() {
        BankAccount acc=new BankAccount();
        Runnable t1=()->acc.withdraw("Goolo Moolo",5000);
        Runnable t2=()->acc.withdraw("papa",4000);
        new Thread(t1).start();
        new Thread(t2).start();
    }
}
