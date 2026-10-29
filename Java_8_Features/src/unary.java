import java.util.function.UnaryOperator;

public class unary {
    public static void main(String[] args) {

        UnaryOperator<Integer> square = n -> n * n;

        System.out.println(square.apply(5));
        System.out.println(square.apply(10));
    }
}