package Lambda_Expression;

interface  Stringfunction{
    String run(String str);
}
public class MethodParameter {
    static void main() {
        Stringfunction str=(s)->s+"!";
        Stringfunction str1=(s2 )->s2+"?";
        System.out.println(str1);
        System.out.println(str);
    }

    public static void printFormatted(String str, Stringfunction format) {
        String result = format.run(str);
        System.out.println(result);
    }
}
