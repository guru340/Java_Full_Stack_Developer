package AbstractDemo;

public interface Animal {
    void animalound();
    void animaleat();
}
class Dog implements Animal{

    @Override
    public void animalound() {
        System.out.println("Dog Bark");
    }

    @Override
    public void animaleat() {
        System.out.println("Dog Eat Predige");
    }

    static void main() {
        Animal dog=new Dog();
        dog.animaleat();
        dog.animalound();
    }
}
