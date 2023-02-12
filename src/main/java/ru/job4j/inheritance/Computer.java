package ru.job4j.inheritance;

public class Computer {
    private boolean multiMonitor;

    private int ssd;

    private String cpu;

    public Computer(boolean multiMonitor, double ssd, String cpu) {
        this.multiMonitor = multiMonitor;
        this.ssd = (int) ssd;
        this.cpu = cpu;
    }

    public void printInfo() {
        System.out.println("Много мониторов: " + multiMonitor);
        System.out.println("SSD: " + ssd + " GB");
        System.out.println("Модель CPU: " + cpu);
        System.out.println();
    }

    public static void main(String[] args) {
        Computer first = new Computer(true, 512.0, "I17");
        first.printInfo();
    }
}
