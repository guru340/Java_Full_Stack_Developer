package Java8.Lambda;

public class Driver {
    static void main() {
        Runnable task=()-> {
            for (int i=0;i<=5;i++){
                System.out.println("Hello Task");
            }

        };
        new Thread(task).start();

        for (int i=0;i<=5;i++){
            System.out.println("Hello.........");
        }
    }
}
