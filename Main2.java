package training;

abstract class Ani1 {
    String name;
    int age;

    Ani1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract void makeSound();
}

class Dog2 extends Ani1 {
    Dog2(String name, int age) {
        super(name, age);
    }

    void makeSound() {
        System.out.println("The dog " + name + " barks.");
    }
}

class Cat extends Ani1 {
    Cat(String name, int age) {
        super(name, age);
    }

    void makeSound() {
        System.out.println("The cat " + name + " meows.");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Dog2 dog = new Dog2("Buddy", 3);
        Cat cat = new Cat("Whiskers", 5);

        dog.makeSound(); // Output: The dog Buddy barks.
        cat.makeSound(); // Output: The cat Whiskers meows.
    }
}
