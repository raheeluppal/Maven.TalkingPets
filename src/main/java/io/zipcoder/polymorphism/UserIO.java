package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by leon on 11/6/17.
 */
public class UserIO {

    ArrayList<Pet> pets = new ArrayList<Pet>();


    public void addPet(Pet petToAdd) {
        pets.add(petToAdd);
    }

    public Integer numOfPets() {
        return pets.size();
    }

    public static String getUserInput() {
        Scanner readInput = new Scanner(System.in);
        String userInput = readInput.nextLine();
        return userInput;
    }


    public static Integer getNumber() {
        Integer numberInput = 0;
        boolean validNumber = false;

        while (validNumber == false) {
            try {
                Scanner readInput = new Scanner(System.in);
                String holder = readInput.nextLine();
                numberInput = Integer.parseInt(holder);
                validNumber = true;

            } catch (NumberFormatException e) {
                System.out.print("Error : Enter a Number  : ");
            }
        }
        return numberInput;
    }

    public Pet collectPetType(){
        System.out.println("Enter your pet type       ");
        System.out.print  ("Cat /  Dog  / Sheep     : ");
        //                 "Error Invalid Pet type  :"
        String petType = getUserInput();

        boolean correctType = false;

        Pet unknown = null;

        while (!correctType) {
            if (petType.equalsIgnoreCase("cat")) {
                unknown = new Cat();
                correctType = true;
            } else if (petType.equalsIgnoreCase("dog")) {
                unknown = new Dog();
                correctType = true;
            } else if (petType.equalsIgnoreCase("sheep")) {
                unknown = new Sheep();
                correctType = true;
            }else {
                System.out.print("Error Invalid Pet type  : ");
                //               "Error Invalid Pet type  : "
                petType = getUserInput();
            }
        }
        return unknown;
    }
    public String getPetName(){
        //                 "Error Invalid Pet type  : "
        System.out.print("Enter your Pet Name     : ");
        String name = getUserInput();
        return name;
    }

    // ****************************************************************************

    public static void main(String[] args){

        UserIO userIO = new UserIO();

        System.out.print("How many Pets Do you Have ?  : ");
        Integer numberOfPets = getNumber();

        for(int x = 1; x <= numberOfPets; x++) {
            Pet petChoice = userIO.collectPetType();
            String name =  userIO.getPetName();
            petChoice.setName(name);
            userIO.addPet(petChoice);
        }

        System.out.println("\n" + "    HERE ARE YOUR PETS     ");
        System.out.println("___________________________" + "\n");

        int count = 1;
        for(Pet element : userIO.pets){
            if(element instanceof Cat){
                System.out.println(count + "     Cat   -  " + element.getName());
                count++;
            }else if(element instanceof Dog){
                System.out.println(count + "     Dog   -  " + element.getName());
                count ++;
            }else{
                System.out.println(count + "     Sheep -  " + element.getName());
                count++;
            }
        }
    }
}
