package ru.job4j.tracker.oop;

public class DummyDic {
    String engToRus(String eng) {
        return "Неизвестное слово " + eng;
    }

    public static void main(String[] args) {
        DummyDic dictionary = new DummyDic();
        System.out.println(dictionary.engToRus("peace"));
    }
}
