package ru.job4j.collection;

import java.util.HashSet;

public class UniqueText {
    public boolean isEquals(String originText, String duplicateText) {
        boolean rsl = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
            for (String org : origin) {
                check.add(org);
            }
            for (String dbl : text) {
                if (!check.contains(dbl)) {
                    rsl = false;
                    break;
                }
            }
        return rsl;
    }
}
