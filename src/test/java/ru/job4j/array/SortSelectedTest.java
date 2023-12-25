package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);

    }

    @Test
    public void whenSort1() {
        int[] data = new int[] {100, 500, 300};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {100, 300, 500};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort2() {
        int[] data = new int[] {6, 8, 7, 10, 9};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {6, 7, 8, 9, 10};
        assertThat(result).containsExactly(expected);
    }

}