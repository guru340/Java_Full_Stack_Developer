package AbstractDemo;

public abstract class vehicle {
    public vehicle(String brand) {
        this.brand = brand;
    }

    String brand;
    abstract void start();
}
