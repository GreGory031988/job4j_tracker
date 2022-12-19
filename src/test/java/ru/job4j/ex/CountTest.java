package ru.job4j.ex;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CountTest {
    @Test
    public void whenException() {
        int start = 0;
        int finish = 3;
        int expected = 3;
        int result = Count.add(start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenExceptionThrows() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> Count.add(10, 2));
        assertThat(exception.getMessage()).isEqualTo("Start should be less than finish.");
    }
}