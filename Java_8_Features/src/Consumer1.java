import java.util.function.Consumer;

public class Consumer1 {
    public static void main(String[] args) {

      Consumer<String> printName =
                name -> System.out.println(name);

        printName.accept("Mayank");
        printName.accept("Java Developer");
    }
}

class Main {
    public static void main(String[] args) {

        Consumer<Integer> printNumber =
                n -> System.out.println("Number: " + n);

        Consumer<Integer> square =
                n -> System.out.println("Square: " + (n * n));

        printNumber.andThen(square).accept(5);
    }
}