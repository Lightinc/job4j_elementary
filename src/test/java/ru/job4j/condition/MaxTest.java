package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {
    @Test
    public void whenMax9To12Then19() {
        int left = 9;
        int right = 19;
        int result = Max.max(left, right);
        int expected = 19;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax12To29Then12() {
        int left = 12;
        int right = 9;
        int result = Max.max(left, right);
        int expected = 12;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax12To12Then12() {
        int left = 12;
        int right = 12;
        int result = Max.max(left, right);
        int expected = 12;
        assertThat(result).isEqualTo(expected);
    }
}
