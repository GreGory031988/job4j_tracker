package ru.job4j.early;

public class PasswordValidator {

    public static String validate(String password) {
        if (password == null) {
            throw new IllegalArgumentException("Password can't be null");
        }
        int lenght = password.length();
        if (lenght < 8 || lenght >= 32) {
            throw new IllegalArgumentException("Password should be length [8, 32]");
        }
        boolean upperCase = false;
        boolean lowerCase = false;
        boolean digit = false;
        boolean special = false;
        char[] array = password.toCharArray();
        for (char symbol : array) {
            if (Character.isUpperCase(symbol)) {
                upperCase = true;
            }
            if (Character.isLowerCase(symbol)) {
                lowerCase = true;
            }
            if (Character.isDigit(symbol)) {
                digit = true;
            }
            if (!Character.isLetter(symbol) && !Character.isDigit(symbol)) {
                special = true;
            }
            if (upperCase && lowerCase && digit && special) {
                break;
            }
        }
        if (!upperCase) {
            throw new IllegalArgumentException("Password should contain at least one uppercase letter");
        }
        if (!lowerCase) {
            throw new IllegalArgumentException("Password should contain at least one lowercase letter");
        }
        if (!digit) {
            throw new IllegalArgumentException("Password should contain at least one figure");
        }
        if (!special) {
            throw new IllegalArgumentException("Password should contain at least one special symbol");
        }
        String[] substrings = {"qwerty", "12345", "password", "admin", "user"};
        for (String substring : substrings) {
            if (password.toLowerCase().contains(substring)) {
                throw new IllegalArgumentException(
                        "Password shouldn't contain substrings:"
                                + " qwerty, 12345, password, admin, user");
            }
        }
        return password;
    }
}
