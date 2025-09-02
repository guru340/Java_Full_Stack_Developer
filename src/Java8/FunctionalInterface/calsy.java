package Java8.FunctionalInterface;
@FunctionalInterface
public interface calsy {
    int add(int a ,int b);



}
class child implements calsy{
    @Override
    public int add(int a, int b) {
        return 0;
    }
}
class Driver{
    static void main() {
        calsy op=(a,b)->a+b;
        System.out.println(op);
    }
}
