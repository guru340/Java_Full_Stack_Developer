import java.util.function.BiFunction;

public class Bifunc {
    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> sum =
                (a, b) -> a + b;

        System.out.println(sum.apply(10, 20)); // 30
        System.out.println(sum.apply(5, 7));    
    }
}