package ru.job4j.condition;

public class ArithmeticActions {
    public static String selectAction(int left, int right, int rsl) {
        String result = "added";
        String result2 = "subtracted";
        String result3 = "multiplied";
        String result4 = "divided";
        String result5 = "none";
           if (left + right == rsl) {
            return result;
        } else if (left - right == rsl) {
            return result2;
        } else if (left * right == rsl) {
            return result3;
        } else if (left / right == rsl) {
            return result4;
        } else {
               return result5;
           }
    }

    public static void main(String[] args) {
        String name = selectAction(2, 8, 10);
        System.out.println(name);
        String name2 = selectAction(15, 5, 10);
        System.out.println(name2);
        String name3 = selectAction(2, 3, 6);
        System.out.println(name3);
        String name4 = selectAction(12313, 1223424, 1);
        System.out.println(name4);
    }
}
