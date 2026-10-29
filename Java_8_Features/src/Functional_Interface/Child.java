package Functional_Interface;
@FunctionalInterface
public interface Child extends MyInterface{
    @Override
    default void saybye() {
        System.out.println("Hello");
    }

    @Override
    void sayHello();
}
