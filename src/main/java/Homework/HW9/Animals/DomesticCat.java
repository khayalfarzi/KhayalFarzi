package Homework.HW9.Animals;

import Homework.HW9.Interface.Foulable;
import Homework.HW9.MyExtraPackage.Species;

public class DomesticCat extends Pet implements Foulable {

    @Override
    public String respond(Pet pet) {
        return " 'Hello, owner. I am - [" + Species.DOMESTICCAT.name() + "]. I miss you!' ";
    }

    @Override
    public String foul() {
        return "  'I need to cover it up' ";
    }
}