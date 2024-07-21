interface Animal {
    void makeSound();

    default void eat() {
        System.out.println("This animal is eating.");
    }
}

class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}

class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound(); 
        dog.eat();       
    }
}
