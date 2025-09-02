package collection;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    static void main() {
        Set<Integer> s1=new HashSet<>();
        s1.add(22);
        s1.add(26);
        s1.add(26);
        s1.add(24);
        s1.add(23);
        s1.add(22);
        System.out.println(s1);

    }
}
