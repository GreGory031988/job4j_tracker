package ru.job4j.poly;

public class Main {
    public static void main(String[] args) {
        Vehicle planeOne = new Plane();
        Vehicle planeTwo = new Plane();
        Vehicle trainOne = new Train();
        Vehicle trainTwo = new Train();
        Vehicle busOne = new Bus();
        Vehicle busTwo = new Bus();

        Vehicle[] vehicles = new Vehicle[] {planeOne, trainOne, busOne, planeTwo, trainTwo, busTwo};
        for (Vehicle a : vehicles) {
            a.move();
            a.typeOfTrasport();
        }
        Vehicle[] vehicless = new Vehicle[] {planeTwo, trainTwo, busTwo};
        for (Vehicle b : vehicless) {
            b.typeOfTrasport();
        }
    }
}
