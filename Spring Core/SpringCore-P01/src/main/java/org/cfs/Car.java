package org.cfs;

public class Car {

    public Car(Engine engine) {
        this.engine = engine;
    }
    public Car(){
        System.out.println("Car Default Constructor");
    }
    public Engine getEngine() {
        System.out.println("Car Constructor.......");
        return engine;
    }

    public void setEngine(Engine engine) {
        System.out.println("SetEngine() called.....");
        this.engine = engine;
    }

    private Engine engine;

    public void drive(){
        int start=engine.start();
        if (start>=1){
            System.out.println("Lets drive");
        }else {
            System.out.println("Engine not started Yet.......");
        }
    }
}
