package ru.job4j.calculator;

public class MathFunc {
    public static int func1(int x) {

        return x * x + 1;
    }

    public static int func2(int x) {

        return 1 / x;
    }

    public static int func3(int x) {
        return x;
    }

    public static void main(String[] args) {
        int result1 = MathFunc.func1(3);
        int result2 = MathFunc.func2(5);
        int result3 = MathFunc.func3(100);
        int total = result1 + result2 + result3;
        System.out.println(total);
    }
}
