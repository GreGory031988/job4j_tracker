package ru.job4j.collection;

import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.assertj.core.api.Assertions.assertThat;

class JobTest {

    @Test
    public void whenCompatorDescByNameAndDescByPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenCompatorDeskByNameAndSortByPrority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new SortByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Fix bug", 2),
                new Job("Fix bug", 3)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenCompatorSortByNameAndDeskByPrority() {
        Comparator<Job> cmpNamePriority = new SortByNameJob().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Fix bug", 9),
                new Job("Impl task", 3)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenCompatorSortByNameAndSortByPrority() {
        Comparator<Job> cmpNamePriority = new SortByNameJob().thenComparing(new SortByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Impl task", 2)
        );
        assertThat(rsl).isLessThan(0);
    }
}