package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ItemDescByNameTest {

    @Test
    void whenFromZtoA() {
        List<Item> items = Arrays.asList(
                new Item("Zenit", 1925),
                new Item("Lokomotiv", 1922),
                new Item("Spartak", 1922)
        );
        items.sort(new ItemDescByName());
        List<Item> expected = Arrays.asList(
                new Item("Zenit", 1925),
                new Item("Spartak", 1922),
                new Item("Lokomotiv", 1922)
        );
        assertThat(items).isEqualTo(expected);
    }
}