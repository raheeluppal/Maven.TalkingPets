package io.zipcoder.polymorphism;
import org.junit.Assert;
import org.junit.Test;

public class CatTest {

    @Test
    public void makeSoundTest(){
        Cat joker = new Cat("joker");
        String expected = "Meow";
        String actual = joker.makeSound();
        Assert.assertEquals((expected), actual);
    }

}
