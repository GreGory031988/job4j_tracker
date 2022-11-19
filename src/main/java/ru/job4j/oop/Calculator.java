package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int z) {
        return x - z;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int divide(int w) {
        return x / w;
    }

    public int sumAllOperation(int s) {
        return sum(s) + minus(s) + multiply(s) + divide(s);
    }

    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
        int result1 = minus(2);
        System.out.println(result1);
        Calculator calculator = new Calculator();
        int rsl = calculator.multiply(5);
        int rsl1 = calculator.divide(1);
        System.out.println(rsl);
        System.out.println(rsl1);
        int rsl2 = calculator.sumAllOperation(10);
        System.out.println(rsl2);
    }
}
