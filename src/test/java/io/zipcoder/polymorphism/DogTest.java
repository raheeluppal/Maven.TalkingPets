package io.zipcoder.polymorphism;
import org.junit.Assert;
import org.junit.Test;

public class DogTest {

    @Test
    public void makeSoundTest(){
        Dog joker = new Dog("joker");
        String expected = "Woof";
        String actual = joker.makeSound();
        Assert.assertEquals((expected), actual);
    }
}
