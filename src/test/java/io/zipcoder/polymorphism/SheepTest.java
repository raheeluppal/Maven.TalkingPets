package io.zipcoder.polymorphism;
import org.junit.Assert;
import org.junit.Test;

public class SheepTest extends PetTest {

    @Test
    public void makeSoundTest(){
        Sheep joker = new Sheep("joker");
        String expected = "Mheeee";
        String actual = joker.makeSound();
        Assert.assertEquals((expected), actual);
    }
}
