package Homework.HW9.Animals;

import Homework.HW9.MyExtraPackage.Species;

public class RoboCat extends Pet {

    @Override
    public String respond(Pet pet) {
        return " 'Hello, owner. I am - [" + Species.ROBOCAT.name() + "]. I miss you!' ";
    }

}
