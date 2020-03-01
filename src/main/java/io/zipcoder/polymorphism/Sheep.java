package io.zipcoder.polymorphism;

public class Sheep extends Pet {

    public Sheep(){

    }
    public Sheep(String name) {
        super(name);
    }
    @Override
    public String makeSound() {
        return "Mheeee";
    }
}
