package ru.job4j.loop;

public class SecondSum {
    public static int sum(int a, int b) {
        int x = 0;
        for (int index = a; index <= b; index += 2) {
                x += index;
            }
        return x;
    }
}
