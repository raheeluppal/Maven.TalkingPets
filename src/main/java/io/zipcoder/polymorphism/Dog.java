package io.zipcoder.polymorphism;

public class Dog extends Pet {

    public Dog(){

    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "Woof";
    }

}
