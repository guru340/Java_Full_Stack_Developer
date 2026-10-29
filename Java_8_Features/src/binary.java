import java.util.function.BinaryOperator;

public class binary {
    public static void main(String[] args) {

        BinaryOperator<Integer> sum = (a, b) -> a + b;

        System.out.println(sum.apply(10, 20));
        System.out.println(sum.apply(5, 7));
    }
}
