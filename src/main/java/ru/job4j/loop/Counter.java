package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            sum = sum + i;
        }
       return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(43, 55));
        System.out.println(sum(5, 11));
        System.out.println(sum(2, 4));
    }
}
