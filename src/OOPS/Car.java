package OOPS;

public class Car {
    String Color;
    String Brand;
    int speed;




    public static void main(String[] args) {
        Car car1=new Car();
        car1.Brand="Macerdes";
        Car.run();
    }
    //    Behaviour
    public static void run(){
        System.out.println("Car Running");
    }

}
