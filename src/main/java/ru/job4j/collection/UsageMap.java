package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("grinrb@gmail.ru", "Kashin Grigorii Aleksandrovich");
        map.put("kashinays@yandex.ru", "Kashina Julia Sergeevna");
        map.put("grinrb@gmail.ru", "Kashin Michael Aleksandrovich");
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " - " + value + ";");
        }
    }
}
