import java.util.Random;
import java.util.function.Supplier;

public class Suppliers {

        public static void main(String[] args) {

            Supplier<String> message =
                    () -> "Welcome to Java 8";

            System.out.println(message.get());
        }

}

 class sups {
    public static void main(String[] args) {

        Supplier<Integer> randomNumber =
                () -> new Random().nextInt(100);

        System.out.println(randomNumber.get());
        System.out.println(randomNumber.get());
    }
}