package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return Math.max(left, right);
    }

    public static void main(String[] args) {
        int a = Max.max(18, 18);
        System.out.println(a);
    }
}
