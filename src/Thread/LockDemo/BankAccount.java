package Thread.LockDemo;

import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int bal=10000;
    private final ReentrantLock lock=new ReentrantLock();
    public void withdraw(String threadName,int amount) {
        System.out.println(threadName + " is trying to withdraw " + amount + " Remaining :" + amount);
        if (lock.tryLock()) {
            lock.lock();
            try {

                if (bal >= amount) {
                    Thread.sleep(2000);
                    bal = bal - amount;
                    System.out.println("Withdrawn :" + bal);
                } else {
                    System.out.println("Insuffiicent balance");
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally
            {
                lock.unlock();
            }
        }else {
            System.out.println("Let me Some other task");
        }
    }
}