package Predictions;

import java.util.function.Predicate;

public class main {
    static void main() {
        Predicate<Integer> lessthan10=n->n<10;
        Predicate<Integer> greater20=n->n>20;
        System.out.println(greater20.and(lessthan10).test(35));
        System.out.println(lessthan10.or(greater20).test(50));
        System.out.println(greater20.negate().test(10));

    }
}
