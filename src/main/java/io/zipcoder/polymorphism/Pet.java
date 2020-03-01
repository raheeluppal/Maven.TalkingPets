package io.zipcoder.polymorphism;

public abstract class Pet{

    String name;

    public Pet(){

    }
    public Pet(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String makeSound(){
        return null;
    }


}
