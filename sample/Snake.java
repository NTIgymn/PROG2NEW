package sample;

public class Snake extends Animal {

    public Snake(String color) {
        super(color);
    }

    void speak() {
        System.out.println("Snaek is barking!");
    }

    void sleep() {
        System.out.println("Snaek is sleeping!");
    }

    void eat() {
        System.out.println("Snaek is eating.");
    }

    @Override
    public void walk() {
        System.out.println("Slithering!");
    }
}
