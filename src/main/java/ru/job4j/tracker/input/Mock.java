package ru.job4j.tracker.input;

public class Mock implements Input {

    private final String[] answers;
    private int position = 0;

    public Mock(String[] answers) {
        this.answers = answers;
    }

    @Override
    public String askStr(String question) {
        return answers[position++];
    }

    @Override
    public int askInt(String question) {
        return Integer.parseInt(askStr(question));
    }
}
