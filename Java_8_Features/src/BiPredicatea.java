import java.util.function.BiPredicate;

public class BiPredicatea {
    public static void main(String[] args) {

       BiPredicate<Integer, Integer> check =
                (a, b) -> a > b;

        System.out.println(check.test(10, 5)); // true
        System.out.println(check.test(3, 8));  // false
    }
}