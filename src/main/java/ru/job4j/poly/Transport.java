package ru.job4j.poly;

public interface Transport {
    void go();

    void passenger(int number);

    double refuel(double quantity);
}
