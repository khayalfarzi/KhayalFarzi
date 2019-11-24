package Homework.HW9.dao;

import java.util.ArrayList;
import java.util.List;

public interface FamilyDao<T> {

    List<T> getAllFamilies();

    List<T> getFamilyByIndex(int index);

    boolean deleteFamily(int index);

    boolean deleteFamily(String family);

    void saveFamily(List<T> family);
}
