
package Homework.HW9.Human;

import Homework.HW9.MyExtraPackage.DayOfWeek;
import Homework.HW9.Interface.HumanCreator;
import Homework.HW9.MyExtraPackage.Names;
import Homework.HW9.Animals.Pet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;


public class Person extends Human implements HumanCreator {

    Random rnd = new Random();

    public static ArrayList<String> NameBoys() {
        ArrayList<String> name = new ArrayList<>();
        name.add(Names.Khayal.name());
        name.add(Names.Ali.name());
        name.add(Names.Elshan.name());
        name.add(Names.Vali.name());
        name.add(Names.Nicat.name());
        name.add(Names.Pasha.name());
        name.add(Names.Rashad.name());
        name.add(Names.Samir.name());
        name.add(Names.Ulvi.name());
        name.add(Names.Rashadat.name());
        return name;
    }

    public static ArrayList<String> NameGirls() {
        ArrayList<String> name = new ArrayList<>();
        name.add(Names.Gul.name());
        name.add(Names.Koko.name());
        name.add(Names.Lala.name());
        name.add(Names.Nikola.name());
        name.add(Names.Nono.name());
        name.add(Names.Pupu.name());
        name.add(Names.Afsana.name());
        name.add(Names.Aida.name());
        name.add(Names.Samira.name());
        name.add(Names.Parvin.name());
        return name;
    }

    public String randomName() {
        int rndNumber = rnd.nextInt(2);
        String name = null;

        switch (rndNumber) {
            case 0: {
                name = NameGirls().get(rnd.nextInt(10));
                break;
            }
            case 1: {
                name = NameBoys().get(rnd.nextInt(10));
                break;
            }
        }
        return name;
    }

    @Override
    public ArrayList<Human> bornChild(String father, String mother) {
        ArrayList<Human> getChild = new ArrayList<>();
        HashMap<String, String> scedule = new HashMap<>();
        scedule.put(DayOfWeek.SATURDAY.name(), "go to courses; watch a film");
        scedule.put(DayOfWeek.SUNDAY.name(), " do home work ");

        Child child = new Child();
        child.setName(randomName());
        child.setSurname(father);
        child.setYear(2020);
        child.setIQ(rnd.nextInt(100));
        child.setScedule(scedule);
        getChild.add(child);
        return getChild;

    }

    @Override
    public String greetPet(Pet pet) {

        return "";
    }

}
