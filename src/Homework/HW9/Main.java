package Homework.HW9;

import Homework.HW9.MyExtraPackage.Extra;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // First Family
        Man m = new Man();
        m.setName("Khayal");
        m.setSurname("Pharzi");
        m.setIQ(99);
        m.setYear(1998);

        Woman w = new Woman();
        w.setName("Gul");
        w.setSurname("Guliyeva");
        w.setIQ(98);
        w.setYear(1998);

        // Second Family
        Man m1 = new Man();
        m1.setName("Vali");
        m1.setSurname("Valiyev");
        m1.setYear(1989);
        m1.setIQ(89);

        Woman w1 = new Woman();
        w1.setName("Ola");
        w1.setSurname("Alizade");
        w1.setYear(1999);
        w1.setIQ(95);

        // Thirth Family
        Man m2 = new Man();
        m2.setName("Ali");
        m2.setSurname("Aliyev");
        m2.setIQ(96);
        m2.setYear(1998);

        Woman w2 = new Woman();
        w2.setName("Lala");
        w2.setSurname("Guluzade");
        w2.setIQ(45);
        w2.setYear(2987);
// ---------------------------------------------------------------------------------------------------------------------
        FamilyController fc = new FamilyController();

        fc.createNewFamily(1, "Farziyevs", m, w);
        fc.createNewFamily(2, "Valiyevs", m1, w1);
        fc.createNewFamily(3, "Aliyevs", m2, w2);

        System.out.println(fc.getFamilyByIndex(0));

        ArrayList<Family> d = new ArrayList<>();
        d.add(fc.getAllFamilies().get(0));
        System.out.println(fc.bornChild(d, m.getName(), w.getName()));
        System.out.println(fc.adoptChild(d, m));

        fc.addPet(1, new Dog("Layka"));

        System.out.println(fc.getPets(1));

        System.out.println(fc.getFamilyByIndex(0));

        fc.getFamiliesBiggerThan();

        System.out.println(fc.getFamilyById(1));

        fc.deleteFamilyByIndex(0);

        System.out.println(fc.getAllFamilies());

        System.out.println(fc.deleteFamily(1));

        fc.deleteFamily("");

        fc.displayAllFamilies();

        fc.count();

        fc.getFamiliesLessThan();

        fc.countFamiliesWithMemberNumber();

        fc.deleteAllChildrenOlderThen(2);
    }

}
