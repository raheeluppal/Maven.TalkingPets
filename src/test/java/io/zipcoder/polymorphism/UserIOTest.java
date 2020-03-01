package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class UserIOTest {

    UserIO testMainApp = new UserIO();

    @Test
    public void addPetTest() {
        Cat kitty = new Cat("Kitty");
        Dog Sitty = new Dog("Sitty");
        Sheep sheeop = new Sheep("Sheepo");

        testMainApp.addPet(kitty);
        testMainApp.addPet(Sitty);
        testMainApp.addPet(sheeop);

        int expected = 3;
        int actual = testMainApp.pets.size();

        Assert.assertEquals(expected,actual);

    }
}
