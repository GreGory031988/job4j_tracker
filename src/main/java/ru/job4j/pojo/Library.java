package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book moron = new Book("Moron", 369);
        Book demons = new Book("Demons", 234);
        Book brothers = new Book("brothers", 793);
        Book cleanCode = new Book("CleanCode", 452);
        Book[] titles = new Book[4];
        titles[0] = moron;
        titles[1] = demons;
        titles[2] = brothers;
        titles[3] = cleanCode;
        for (int index = 0; index < titles.length; index++) {
            Book title = titles[index];
            System.out.println(title.getName() + " - " + title.getPage());
        }
        System.out.println("Change place 0 and 3");
        Book temp = titles[0];
        titles[0] = titles[titles.length - 1];
        titles[titles.length - 1] = temp;
        for (int index = 0; index < titles.length; index++) {
            Book title = titles[index];
            System.out.println(title.getName() + " - " + title.getPage());
        }
        System.out.println("Show book only name Clean Code");
        for (int index = 0; index < titles.length; index++) {
            Book title = titles[index];
            if ("CleanCode".equals(title.getName())) {
                System.out.println(title.getName() + " - " + title.getPage());
            }
        }
    }
}
