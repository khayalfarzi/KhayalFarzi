package Homework.HW9.Human;


import Homework.HW9.Animals.Pet;

public class Woman extends Human {

    public String makeUp() {
        return "All woman like make Up";
    }

    @Override
    public String greetPet(Pet pet) {
        return " Hello, [" + pet.getNickname() + "] ";
    }

}
