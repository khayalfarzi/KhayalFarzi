package Homework.HW7;

public class Fish extends Pet {

    @Override
    public String respond(Pet pet) {
        return " 'Hello, owner. I am - [" + Species.FISH.name() + "]. I miss you!' ";
    }
}