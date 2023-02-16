package ru.job4j.collection;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SortDescByNameJobTest {
    @Test
    void whenFromZtoA() {
        List<Job> jobs = Arrays.asList(
                new Job("engineer", 105000),
                new Job("doctor", 55000),
                new Job("lawyer", 78000)
        );
        jobs.sort(new SortDescByNameJob());
        List<Job> expected = Arrays.asList(
                new Job("lawyer", 78000),
                new Job("engineer", 105000),
                new Job("doctor", 55000)
        );
        assertThat(jobs).isEqualTo(expected);
    }
}