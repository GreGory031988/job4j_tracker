package ru.job4j.format;

public class Format {
    public static void getGreeting(String name, int age) {
        System.out.println(String.format("Привет! Я %2$s, возраст: %s", age, name));
    }

    public static void main(String[] args) {
        getGreeting("Елена", 22);
    }
}
