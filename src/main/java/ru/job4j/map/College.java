package ru.job4j.map;

import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class College {
    private final Map<Student, Set<Subject>> students;

    public College(Map<Student, Set<Subject>> students) {
        this.students = students;
    }

    public Optional<Student> findByAccount(String account) {
        Optional<Student> rsl = students.keySet()
                .stream()
                .filter(s -> s.account().equals(account))
                .findFirst();
        return rsl;
    }

    public Optional<Subject> findBySubjectName(String account, String name) {
        Optional<Student> a = findByAccount(account);
        if (a.isPresent()) {
            return students.get(a.get())
                    .stream()
                    .filter(s -> s.name().equals(name))
                    .findFirst();
        }
        return Optional.empty();
    }
}
