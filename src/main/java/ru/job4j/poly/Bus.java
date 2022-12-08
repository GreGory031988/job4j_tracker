package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void go() {
        System.out.println("Время в пути 8 часов");
    }

    @Override
    public void passenger(int number) {
        if (number >= 30) {
            System.out.println("Паз 4234" + number);
        } else {
            System.out.println("Паз 3206" + number);
        }
    }

    @Override
    public double refuel(double quantity) {
        double coust = 1000 / quantity;
        return coust;
    }
}
