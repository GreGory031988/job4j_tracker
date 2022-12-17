package ru.job4j.tracker;

public class Action implements UserAction {
    private final Output out;

    public Action(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Exit Program";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        return false;
    }
}