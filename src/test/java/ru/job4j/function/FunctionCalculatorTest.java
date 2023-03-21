package ru.job4j.function;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class FunctionCalculatorTest {
    @Test
    public void whenLinearFunctionThenLinearResults() {
        FunctionCalculator function = new FunctionCalculator();
        List<Double> result = function.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result).containsAll(expected);
    }

    @Test
    public void whenQuadraticFunctionThenQuadraticResults() {
        FunctionCalculator function = new FunctionCalculator();
        List<Double> result = function.diapason(5, 8, x -> Math.pow(x, 2));
        List<Double> expected = Arrays.asList(25D, 36D, 49D);
        assertThat(result).containsAll(expected);
    }

    @Test
    public void whenDemonstrationFunctionThenDemonstrationResults() {
        FunctionCalculator function = new FunctionCalculator();
        List<Double> result = function.diapason(2, 4, x -> Math.pow(2, x));
        List<Double> expected = Arrays.asList(4D, 8D);
        assertThat(result).containsAll(expected);
    }
}