package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

public class ProductLabel {
    public List<String> generateLabels(List<Product> products) {
        return products.stream()
                .filter(i -> i.getStandard() - i.getActual() >= 0)
                .filter(i -> i.getStandard() - i.getActual() <= 3)
                .map(i -> new Label(i.getName(), i.getPrice() / 2))
                .map(i -> i.toString())
                .collect(Collectors.toList());
    }
}
