package Homework.HW9.dao;

import Homework.HW9.Human.Family;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class CollectionFamilyDao implements FamilyDao<Family> {
    private HashSet<Family> DataBase;

    @Override
    public void saveFamily(List<Family> family) {
        DataBase.addAll(family);
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
}
