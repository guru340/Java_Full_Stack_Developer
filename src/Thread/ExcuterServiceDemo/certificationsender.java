package Thread.ExcuterServiceDemo;

public class certificationsender implements Runnable {
    private final String stdName;
    public certificationsender(String stdName)
    {
        this.stdName=stdName;
    }

    @Override
    public void run() {

        System.out.println("sending certificate to "+stdName +
                " by thread "+Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("certificate sent "+stdName +
                " by thread "+Thread.currentThread().getName());
    }
}

