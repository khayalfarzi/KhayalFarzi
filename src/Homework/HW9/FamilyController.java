package Homework.HW9;

import java.util.ArrayList;
import java.util.List;

public class FamilyController extends FamilyService {

    @Override
    public void createNewFamily(int ID, String name, Human man, Human woman) {
        super.createNewFamily(ID, name, man, woman);
    }

    @Override
    public List<Family> getFamilyByIndex(int index) {
        return super.getFamilyByIndex(index);
    }

    @Override
    public void deleteFamilyByIndex(int index) {
        super.deleteFamilyByIndex(index);
    }

    @Override
    public List<Family> getFamilyById(int id) {
        return super.getFamilyById(id);
    }

    @Override
    public List<Family> getAllFamilies() {
        return super.getAllFamilies();
    }

    @Override
    public boolean deleteFamily(int index) {
        return super.deleteFamily(index);
    }

    @Override
    public boolean deleteFamily(String family) {
        return super.deleteFamily(family);
    }

    @Override
    public void displayAllFamilies() {
        super.displayAllFamilies();
    }

    @Override
    public void saveFamily(List<Family> family) {
        super.saveFamily(family);
    }

    @Override
    public int count() {
        return super.count();
    }

    @Override
    public List<Family> getFamiliesBiggerThan() {
        return super.getFamiliesBiggerThan();
    }

    @Override
    public List<Family> getFamiliesLessThan() {
        return super.getFamiliesLessThan();
    }

    @Override
    public ArrayList<Integer> countFamiliesWithMemberNumber() {
        return super.countFamiliesWithMemberNumber();
    }

    @Override
    public List<Pet> getPets(int index) {
        return super.getPets(index);
    }

    @Override
    public void addPet(int index, Pet pet) {
        super.addPet(index, pet);
    }

    @Override
    public ArrayList<Family> bornChild(ArrayList<Family> family, String masculie, String feminine) {
        return super.bornChild(family, masculie, feminine);
    }

    @Override
    public List<Family> adoptChild(ArrayList<Family> family, Human human) {
        return super.adoptChild(family, human);
    }

    @Override
    public void deleteAllChildrenOlderThen(int i) {
        super.deleteAllChildrenOlderThen(i);
    }
}
