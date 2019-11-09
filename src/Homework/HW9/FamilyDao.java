package Homework.HW9;

import java.util.ArrayList;
import java.util.List;

public interface FamilyDao<T> {

    List<T> getAllFamilies();

    List<T> getFamilyByIndex(int index);

    boolean deleteFamily(int index);

    boolean deleteFamily(String family);

    void saveFamily(List<T> family);

    void displayAllFamilies();

    List<T> getFamiliesBiggerThan();

    List<T> getFamiliesLessThan();

    ArrayList<Integer> countFamiliesWithMemberNumber();

    void createNewFamily(int ID, String name, Human man, Human woman);

    void deleteFamilyByIndex(int index);

    ArrayList<T> bornChild(ArrayList<T> family, String masculie, String feminine);

    List<T> adoptChild(ArrayList<T> family, Human human);

    void deleteAllChildrenOlderThen(int i);

    int count();

    List<T> getFamilyById(int id);

    List<Pet> getPets(int index);

    void addPet(int index, Pet pet);

}
