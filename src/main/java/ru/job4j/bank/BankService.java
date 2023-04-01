package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс описывает работу банковской системы, которая
 * регистрирует пользователя, удаляет пользоваиеля из системы
 * добавляет пользователю банковский счет, переводит деньги
 * с одного счета на другой
 * @author GRIGORII KASHIN
 * @version 1.0
 */
public class BankService {
    /**
     * Хранение данных пользователя осуществляется в коллекции типа Map
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод принимает на вход данные пользователя и добавляет ее в очередь
     * Если пользователя нет в системе, то происходит его регистрация
     * @param user содержит данные пользователя, которого необходимо добавить в систему
     */
    public void addUser(User user) {
            users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод позволяет удалить пользователя из системы
     * Пользователь удаляется из системы по паспортным данным
     * @param passport удаление пользователя происходит по паспортным данным
     * @return возвращает true если пользователь удален, false - нет в системе
     */
    public boolean deleteUser(String passport) {
        return users.remove(new User(passport, "")) != null;
    }

    /**
     * Метод должен добавить новый счет к пользователю
     * Если пользователь найден в системе и у него еще нет такого счета
     * то добавить еще одни счет к пользователю
     * @param passport принимает паспортные данные пользователя
     * @param account принимает данные счета пользователя
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null && !users.get(user).contains(account)) {
            users.get(user).add(account);
        }

    }

    /**
     * Метод находит пользователя по паспорту
     * Системе необходимо найти пользователся по паспорту
     * @param passport принимает паспортные данные пользователя
     * @return возвращает результат поиска
     */
    public User findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(u -> u.getPassport().equals(passport))
                .findFirst()
                .orElse(null);
    }

    /**
     * Метод ищет счет пользователя по реквизитам
     * Находим пользователя в системе по паспорту и, если пользователь найден
     * находим реквизиты пользователя и создаем аккаунт
     * @param passport поиск пользователя происходит по паспортным данным
     * @param requisite сравниваем данные реквизиты с реквизитами пользователя
     * @return возвращаем результат поиска
     */
    public Account findByRequisite(String passport, String requisite) {
        User a = findByPassport(passport);
        if (a != null) {
            return users.get(a)
                    .stream()
                    .filter(u -> u.getRequisite().equals(requisite))
                    .findFirst()
                    .orElse(null);
        }
        return null;
    }

    /**
     * Метод предназначен для перечисления денег с одного счёта на другой счёт
     * Если счёт найден или хватает денег на счёте, то перевести деньги из одного счета
     * на другой
     * @param srcPassport паспортные данные пользователя
     * @param srcRequisite реквизиты счета пользователя, с которого необходимо
     *                     перевести деньги
     * @param destPassport паспортные данные пользователя, которому переводят
     * @param destRequisite реквизиты счета пользователя, которому переводят
     * @param amount количество переводимых денег
     * @return возвращает true если перевод выполнен успешно
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
            boolean rsl = false;
            Account src = findByRequisite(srcPassport, srcRequisite);
            Account dest = findByRequisite(destPassport, destRequisite);
            if (src != null && dest != null && src.getBalance() >= amount) {
                src.setBalance(src.getBalance() - amount);
                dest.setBalance(dest.getBalance() + amount);
                rsl = true;
            }
            return rsl;
    }

    /**
     * Метод предназначен для просмотра списков счетов пользователя
     * @param user содержит данные пользователя
     * @return возвращает данные о счете пользователя
     */
    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}
