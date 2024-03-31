package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

import static org.example.BubbleSort.bubbleSort;

class BubbleSortTest {
    @Test
    void TestBubble() {
        int[] array = {1, 55, 49, 4, 36};
        bubbleSort(array);
        System.out.print("Ordered list with BubbleSort: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        assertThat(array).containsExactlyInAnyOrder(1, 4, 36, 49, 55);
    }
    @Test
    void TestBubbleWithNegativeNumbers() {
        int[] array = {-1, 55, 49, -4, 36 };
        bubbleSort(array);
        System.out.print("Ordered list with BubbleSort: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        assertThat(array).containsExactlyInAnyOrder( -4, -1, 36, 49, 55);
    }
}
