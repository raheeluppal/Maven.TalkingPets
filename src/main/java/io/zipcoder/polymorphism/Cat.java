package io.zipcoder.polymorphism;

public class Cat extends Pet{


    public Cat(){

    }
    public Cat(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
       return "Meow";
    }
}
