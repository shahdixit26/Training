package training;

class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void bark() {
        System.out.println("Woof!");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        dog.eat();  // Output: "Buddy is eating."
        dog.bark(); // Output: "Woof!"
    }
}