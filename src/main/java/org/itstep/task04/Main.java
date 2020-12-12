package org.itstep.task04;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    }

    public static int binarySearch(int[] arr, int value) throws NotSortedExceprion {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1] > arr[i]) {
                throw new NotSortedExceprion("Массив должен быть отсортирован");
            }
        }
        return Arrays.binarySearch(arr, value);
    }
}

