package ru.job4j.condition;

public class PlayOrNot {
    public static int checkGame(double percent, int prize, int pay) {
        int result = 0;
        if (percent * prize > pay) {
            return (int) (percent * prize - pay);
        } else if (percent * prize - pay <= 0) {
            return result;
        }
        return result;
    }

    public static void main(String[] args) {
        int a = checkGame(2, 5, 51130);
        System.out.println(a);
    }
}
