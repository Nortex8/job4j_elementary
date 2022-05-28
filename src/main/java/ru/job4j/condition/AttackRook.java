package ru.job4j.condition;

public class AttackRook {
    public static boolean check(String l, String r) {
        char x1 = l.charAt(0);
        char y1 = l.charAt(l.length() - 1);
        char x2 = r.charAt(0);
        char y2 = r.charAt(r.length() - 1);
              return (x1 == x2) || (x1 == y2 && x2 == y1);
        }
    }
