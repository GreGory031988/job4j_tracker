package ru.job4j.tracker;

import ru.job4j.tracker.action.*;
import ru.job4j.tracker.input.ConsoleIn;
import ru.job4j.tracker.input.Input;
import ru.job4j.tracker.output.ConsoleOut;
import ru.job4j.tracker.output.Output;

import java.util.Arrays;
import java.util.List;

public class StartUI {
    private final Output out;

    public StartUI(Output out) {
        this.out = out;
    }

    public void init(Input input, Tracker tracker, List<UserAction> actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Выберите один из пунктов: ");
            if (select < 0 || select >= actions.size()) {
                out.println("Ошибочный ввод, вы можете выбрать: 0 .. " + (actions.size() - 1));
                continue;
            }
            UserAction action = actions.get(select);
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(List<UserAction> actions) {
        out.println("Меню:");
        for (int index = 0; index < actions.size(); index++) {
            out.println(index + ". " + actions.get(index).name());
        }
    }

    public static void main(String[] args) {
        Output output = new ConsoleOut();
        Input input = new ValidateInput(output, new ConsoleIn());
        Tracker tracker = new Tracker();
        List<UserAction> actions = Arrays.asList(new Create(output),
                new FindAll(output), new Replace(output),
                new Delete(output), new FindById(output),
                new FindName(output), new Exit(output));
        new StartUI(output).init(input, tracker, actions);
    }
}