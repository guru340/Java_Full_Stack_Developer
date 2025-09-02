package collection;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
    static void main() {
        Vector<Integer> n1=new Vector<>();
        n1.add(21);
        n1.add(22);
        n1.add(23);
        n1.add(24);
        Enumeration<Integer> e= n1.elements();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
        Iterator<Integer> I=n1.iterator();
        while(I.hasNext()){
//            System.out.println(I.next());
                int data=I.next();
                if(data==30){
                    I.remove();
                }
            System.out.println(data);

        }


    }
}
