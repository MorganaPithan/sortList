package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.example.SelectionSort.selectionSort;

class SelectionSortTest {
    @Test
    void testSelection() {
        int[] array = {64, 34, 25, 12, 22};
        selectionSort(array);
        System.out.print("Ordered list with SelectionSort: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        assertThat(array).containsExactlyInAnyOrder(12, 22, 25, 34, 64);
    }
    @Test
    void testSelectionWithNegativeNumbers(){
        int[] array = {-64, 34, -25, 12, 22};
        selectionSort(array);
        System.out.print("Ordered list with SelectionSort: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        assertThat(array).containsExactlyInAnyOrder(-64, -25, 12, 22, 34);
    }
}