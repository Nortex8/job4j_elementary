package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        for (int i = 0; i < name.length(); i++) {
            if ((isSpecialSymbol(name.codePointAt(i)) || isUpperLatinLetter(name.codePointAt(i)) || isLowerLatinLetter(name.codePointAt(i)) || Character.isDigit(name.codePointAt(i)))
                    && !Character.isUpperCase(name.codePointAt(0)) && Character.isLowerCase(name.codePointAt(0)) && !name.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public static boolean isSpecialSymbol(int code) {
        for (int i = 0; i < code; i++) {
            if (code == 36 || code == 95) {
                return true;
            }
            break;
        }
            return false;
        }

        public static boolean isUpperLatinLetter(int code) {
            for (int i = 0; i < code; i++) {
                if (code > 64 && code < 91) {
                    return true;
                }
                break;
            }
            return false;
        }

        public static boolean isLowerLatinLetter(int code) {
            for (int i = 0; i < code; i++) {
                if (code > 96 && code < 123) {
                    return true;
                }
                break;
            }
            return false;
        }
}
