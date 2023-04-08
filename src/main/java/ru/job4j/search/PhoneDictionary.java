package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> getName = (i) -> (i).getName().contains(key);
        Predicate<Person> getSurname = (i) -> (i).getSurname().contains(key);
        Predicate<Person> getPhone = (i) -> (i).getPhone().contains(key);
        Predicate<Person> getAddress = (i) -> (i).getAddress().contains(key);
        Predicate<Person> combine = getName.or(getSurname).or(getPhone).or(getAddress);
        ArrayList<Person> result = new ArrayList<>();
        for (var person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
