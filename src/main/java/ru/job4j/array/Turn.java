package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        for (int i = 0; i < array.length - i; i++) {
            int temp1 = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp1;
        }
        return array;
    }
}