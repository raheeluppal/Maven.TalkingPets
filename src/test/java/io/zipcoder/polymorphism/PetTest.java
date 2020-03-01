package io.zipcoder.polymorphism;
import org.junit.Assert;
import org.junit.Test;

public class PetTest{

    @Test
    public void getNameTest(){

        String name = "Minky";
        Cat minky = new Cat(name);

        String expected = "Minky";
        String actual = minky.getName();
        Assert.assertEquals((expected), actual);
    }
    @Test
    public void SetNameTest(){
        Cat noName = new Cat();
        noName.setName("Joker");
        String expected = "Joker";
        String actual = noName.getName();
        Assert.assertEquals((expected), actual);
    }
}
