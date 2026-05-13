// Parent Class
class Animal {

    void eat() {
        System.out.println("Animal is eating");
    }
}

// Child Class
class Dog extends Animal {

    void bark() {
        System.out.println("Dog is barking");
    }
}

// Main Class
public class Test {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.eat();   // Inherited method from Animal
        d.bark();  // Dog class method
    }
}