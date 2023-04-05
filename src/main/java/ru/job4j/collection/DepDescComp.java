package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] arrayFirst = o1.split("/");
        String[] arraySecond = o2.split("/");
        int rsl = arraySecond[0].compareTo(arrayFirst[0]);
        return rsl != 0 ? rsl : o1.compareTo(o2);
    }
}
