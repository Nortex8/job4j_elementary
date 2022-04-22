package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static void main(String[] args) {
        int a = Max.max(19, 22);
        System.out.println(a);
    }
}
