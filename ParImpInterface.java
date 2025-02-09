// WAP that show the partial implementation of interface.
interface Animal {
    void makeSound();
}

class Dog implements Animal {
    public void makeSound() {
        System.out.println("Dog says: Woof Woof!");
    }
}

class Cat implements Animal {
    public void makeSound() {
        System.out.println("Cat says: Meow Meow!");
    }
}


public class ParImpInterface {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.makeSound();
        myCat.makeSound();
    }
}