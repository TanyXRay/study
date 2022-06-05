package study.javarush.practicum.arrays;

/**
 * Работа с массивами.
 */

public class Array1 {
    public static final String ODD = "Нечетный";
    public static final String EVEN = "Четный";

    public static String[] strings = new String[5];

    public static void main(String[] args) {
        strings[0] = EVEN;
        strings[1] = ODD;
        strings[2] = EVEN;
        strings[3] = ODD;
        strings[4] = EVEN;
    }
}
