package collection.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberLisr {
    static void main() {
        List<Number> list=new ArrayList<>();
        list.add(new Number(50));
        list.add(new Number(99));
        list.add(new Number(67));
        list.add(new Number(66));
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
