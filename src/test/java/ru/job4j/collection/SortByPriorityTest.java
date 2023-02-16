package ru.job4j.collection;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SortByPriorityTest {

    @Test
    void whenFrom1to9() {
        List<Job> jobs = Arrays.asList(
                new Job("engineer", 105000),
                new Job("doctor", 55000),
                new Job("lawyer", 78000)
        );
        jobs.sort(new SortByPriority());
        List<Job> expected = Arrays.asList(
                new Job("doctor", 55000),
                new Job("lawyer", 78000),
                new Job("engineer", 105000)
        );
        assertThat(jobs).isEqualTo(expected);
    }
}