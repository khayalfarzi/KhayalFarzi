package Homework.HW7;

public class RoboCat extends Pet {

    @Override
    public String respond(Pet pet) {
        return " 'Hello, owner. I am - [" + Species.ROBOCAT.name() + "]. I miss you!' ";
    }

}