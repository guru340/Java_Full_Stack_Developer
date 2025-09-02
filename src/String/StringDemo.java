package String;

import java.util.SplittableRandom;

public class StringDemo {
    public static void main(String[] args) {
        String s1=new String("Mayank");
        String s2="Mayank";
        String s3="Mayank";
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
    }


}
