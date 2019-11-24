package Homework.HW9.Controller;

import Homework.HW9.Animals.Pet;
import Homework.HW9.Human.Human;
import Homework.HW9.MyExtraPackage.Extra;
import Homework.HW9.Services.FamilyService;
import Homework.HW9.Human.Family;
import Homework.HW9.Human.Man;
import Homework.HW9.Human.Woman;
import Homework.HW9.dao.CollectionFamilyDao;

import java.util.ArrayList;
import java.util.Scanner;

public class FamilyController {
    private FamilyService familyService;
    private Extra extra;

    public FamilyController(FamilyService familyService) {
        this.familyService = familyService;
    }

    public FamilyController() {

    }

    public FamilyService getFamilyService() {
        return familyService;
    }

    public void setFamilyService(FamilyService familyService) {
        this.familyService = familyService;
    }

    public void createNewFamily() {
        Family family = new Family();
        Man man = new Man();
        Woman woman = new Woman();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Family  ID: ");
        int id = scanner.nextInt();
        System.out.print("Enter Family name ");
        family.setNameFamily(scanner.nextLine());
        System.out.print("Enter Man name: ");
        man.setName(scanner.nextLine());
        System.out.print("Enter Man surname: ");
        man.setSurname(scanner.nextLine());
        System.out.print("Enter Man year: ");
        man.setYear(scanner.nextInt());
        System.out.print("Enter Man IQ: ");
        man.setIQ(scanner.nextInt());
        System.out.print("Enter Woman name: ");
        woman.setName(scanner.nextLine());
        System.out.print("Enter Woman surname: ");
        woman.setSurname(scanner.nextLine());
        System.out.print("Enter Woman year: ");
        woman.setYear(scanner.nextInt());
        System.out.print("Enter Woman IQ: ");
        woman.setIQ(scanner.nextInt());
        try {
            familyService.createNewFamily(id, family.getNameFamily(), man, woman);
            System.out.println("Family creat successfully");
        } catch (Exception e) {
            System.out.println("something went wrong while creating family.");
        }
    }

    public void getFamilyByIndex(int index) {
        System.out.println(familyService.getAllFamilies().get(index));
    }

    public void getAllFamilies() {
        System.out.println(familyService.getAllFamilies());
    }

    public void getFamilyByID(int id) {
        System.out.println(familyService.getFamilyById(id));
    }

    public void getFamiliesBiggerThan() {
        System.out.println(familyService.getFamiliesBiggerThan());
    }

    public void getFamiliesLessThan() {
        System.out.println(familyService.getFamiliesLessThan());
    }

    public void getPets(int index) {
        System.out.println(familyService.getPets(index));
    }

    public void displayAllFamilies() {
        System.out.println(familyService.getAllFamilies());
    }

    public void count() {
        System.out.println(familyService.count());
    }

    public void countFamiliesWithMemberNumber() {
        System.out.println(familyService.countFamiliesWithMemberNumber());
    }

    public void deleteFamilyByIndex(int index) {
        familyService.deleteFamilyByIndex(index);
    }

    public void bornChild(ArrayList<Family> family, String masculie, String feminine) {
        System.out.println(familyService.bornChild(family, masculie, feminine));
    }

    public void adoptChild(ArrayList<Family> family, Human human) {
        System.out.println(familyService.adoptChild(family, human));
    }

    public void addPet(int index, Pet pet) {
        familyService.addPet(index, pet);
    }

    public void saveFamily(ArrayList<Family> familyArrayList) {
        CollectionFamilyDao collectionFamilyDao = new CollectionFamilyDao();
        collectionFamilyDao.saveFamily(familyArrayList);
    }
}