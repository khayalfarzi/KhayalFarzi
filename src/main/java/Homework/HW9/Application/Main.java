package Homework.HW9.Application;

import Homework.HW9.Animals.Dog;
import Homework.HW9.Controller.FamilyController;
import Homework.HW9.Human.Family;
import Homework.HW9.Services.FamilyService;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FamilyController fc = new FamilyController(new FamilyService());

        fc.createNewFamily();
        fc.createNewFamily();

        fc.addPet(0, new Dog("Layka"));

        fc.count();

        fc.getFamiliesBiggerThan();

        fc.getFamiliesLessThan();

        fc.getAllFamilies();

        fc.countFamiliesWithMemberNumber();

        fc.deleteFamilyByIndex(0);

        fc.displayAllFamilies();

        fc.getPets(0);

        fc.getFamilyByID(1);
    }

}
