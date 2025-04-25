// Single Inheritance
class Animal {
    void speak() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal { // Single Inheritance
    void bark() {
        System.out.println("Woof!");
    }
}

// Multilevel Inheritance
class Puppy extends Dog { // Multilevel Inheritance
    void weep() {
        System.out.println("Whine...");
    }
}

// Multiple Inheritance via Interfaces (Java doesn't support multiple class inheritance)
interface Swimmer {
    void swim();
}

class Duck extends Animal implements Swimmer { // Multiple Inheritance
    public void swim() {
        System.out.println("Swimming...");
    }

    void quack() {
        System.out.println("Quack!");
    }
}

// Hierarchical Inheritance
class Cat extends Animal { // Another child of Animal
    void meow() {
        System.out.println("Meow!");
    }
}

// Main class to test
class InheritanceDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Puppy puppy = new Puppy();
        Duck duck = new Duck();
        Cat cat = new Cat();

        System.out.println("Dog:");
        dog.speak();
        dog.bark();

        System.out.println("\nPuppy:");
        puppy.speak();
        puppy.bark();
        puppy.weep();

        System.out.println("\nDuck:");
        duck.speak();
        duck.swim();
        duck.quack();

        System.out.println("\nCat:");
        cat.speak();
        cat.meow();
    }
}


