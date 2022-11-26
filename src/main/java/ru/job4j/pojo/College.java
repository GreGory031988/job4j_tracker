package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Kashin Grigorii Alesandrovich");
        student.setNumberGroup("PS-112");
        student.setReceipt("01 августа 2006 года");
        System.out.println(student.getFullName() + System.lineSeparator()
                + student.getNumberGroup() + System.lineSeparator() + student.getReceipt());
    }
}
