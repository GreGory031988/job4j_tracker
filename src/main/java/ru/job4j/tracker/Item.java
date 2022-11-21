package ru.job4j.tracker;

public class Item {
    private int id;
    private String name;

    public Item(String name) {
        this.name = name;
    }

    public Item(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Item() {
    }

    public void printInfo() {
        System.out.println(name);
        System.out.println(id);
        System.out.println();
    }

    public static void main(String[] args) {
        Item first = new Item();
        first.printInfo();
        Item second = new Item("Unit 1");
        second.printInfo();
        Item third = new Item("Unit 1", 222567);
        third.printInfo();
    }
}