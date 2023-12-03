package ru.job4j.tracker.output;

public class ConsoleOut implements Output {

    @Override
    public void println(Object obj) {
        System.out.println(obj);
    }
}
