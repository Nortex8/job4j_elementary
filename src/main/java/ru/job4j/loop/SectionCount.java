package ru.job4j.loop;

public class SectionCount {
    public static int count(int length, int section) {
        int x = 0;
        for (int i = 0; i < length; i++) {
            if (section <= length) {
                section += section;
                x++;
            }
        }
        return x;
    }
}
