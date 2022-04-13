package fileWriter;


import java.util.InputMismatchException;

public class TextValidator {

    private static boolean checkHasOnlyLetter(String name) { //только для проверки фио all class
        for (char c : name.toCharArray()) {
            if (!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkFirstCharUpperCase(String text) {
        return Character.isUpperCase(text.toCharArray()[0]);
    }

    private static boolean checkWordUpperCase(String text) {
        char[] chars = text.toCharArray();
        for (int i = 1; i < chars.length; i++) {
            char aChar = chars[i];
            if (Character.isUpperCase(aChar)) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkFIO(String text) {
        if (!checkHasOnlyLetter(text) || text.isBlank()) {
            System.out.println("В слове содержатся цифры или пробелы");
            return false;
        }
        if (!checkFirstCharUpperCase(text)) {
            System.out.println("В слове должна быть первая заглавная буква");
            return false;
        }
        if (!checkWordUpperCase(text)) {
            System.out.println("В слове присутствует больше одной заглавной буквы");
            return false;
        }
        return true;
    }
}
