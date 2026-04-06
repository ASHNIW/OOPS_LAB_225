class Animal {
    String name;

    void eat() {
        System.out.println("The animal is eating");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("Mammal is walking");
    }
}

class Dog extends Mammal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}

public class Hybrid {
    public static void main(String[] args) {

        Cat obj1 = new Cat();
        Dog obj2 = new Dog();

        obj2.eat();
        obj2.walk();
        obj2.bark();

        obj1.eat();
        obj1.meow();
    }
}
