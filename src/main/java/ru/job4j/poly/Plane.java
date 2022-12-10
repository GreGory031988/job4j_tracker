package ru.job4j.poly;

public class Plane implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " летит в небе");
    }

    @Override
    public void typeOfTrasport() {
        System.out.println(getClass().getSimpleName() + " грузовой самолет");
    }
}
