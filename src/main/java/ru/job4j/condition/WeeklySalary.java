package ru.job4j.condition;

public class WeeklySalary {
    public static int calculate(int[] hours) {
        int a = 0;
        for (int i = 0; i < hours.length; i++) {
            a += switch (i) {
                case 0, 1, 2, 3, 4 -> hours[i] <= 8 ? hours[i] * 10 : 80 + (hours[i] - 8) * 15;
                case 5, 6 -> hours[i] > 8 ? 160 + (hours[i] - 8) * 30 : hours[i] * 20;
                default -> -1;
            };
        }
        return a;
    }

    public static void main(String[] args) {
        int rsl = WeeklySalary.calculate(new int[]{10, 0, 12, 0, 8, 12, 4});
        System.out.println(rsl);
    }
}