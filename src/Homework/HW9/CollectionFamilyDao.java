package Homework.HW9;

import java.util.ArrayList;
import java.util.List;

public class CollectionFamilyDao implements FamilyDao<Family> {
    private final ArrayList<Family> dataBase;

    public CollectionFamilyDao(ArrayList<Family> dataBase) {
        this.dataBase = dataBase;
    }

    public ArrayList<Family> getDataBase() {
        return dataBase;
    }

    @Override
    public void saveFamily(List<Family> family) {
        for (int i = 0; i < family.size(); i++) {
            dataBase.add(family.get(i));
        }
    }

    @Override
    public List<Family> getAllFamilies() {
        return null;
    }

    @Override
    public List<Family> getFamilyByIndex(int index) {
        return null;
    }

    @Override
    public boolean deleteFamily(int index) {
        return false;
    }

    @Override
    public boolean deleteFamily(String family) {
        return false;
    }

    @Override
    public void displayAllFamilies() {

    }

    @Override
    public List<Family> getFamiliesBiggerThan() {
        return null;
    }

    @Override
    public List<Family> getFamiliesLessThan() {
        return null;
    }

    @Override
    public ArrayList<Integer> countFamiliesWithMemberNumber() {
        return null;
    }

    @Override
    public void createNewFamily(int ID, String name, Human man, Human woman) {

    }

    @Override
    public void deleteFamilyByIndex(int index) {

    }

    @Override
    public ArrayList<Family> bornChild(ArrayList<Family> family, String masculie, String feminine) {
        return null;
    }

    @Override
    public List<Family> adoptChild(ArrayList<Family> family, Human human) {
        return null;
    }

    @Override
    public void deleteAllChildrenOlderThen(int i) {

    }

    @Override
    public int count() {
        return 0;
    }

    @Override
    public List<Family> getFamilyById(int id) {
        return null;
    }

    @Override
    public List<Pet> getPets(int index) {
        return null;
    }

    @Override
    public void addPet(int index, Pet pet) {

    }
}
