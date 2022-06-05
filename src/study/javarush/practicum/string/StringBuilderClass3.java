package study.javarush.practicum.string;

/**
 * Практикуем метод revers класса StringBuilder.
 */

public class StringBuilderClass3 {

    public static void main(String[] args) {
        String string = "Ходит кот задом наперед";
        System.out.println(string);
        System.out.println(reverseString(string));
    }

    public static String reverseString(String string) {
        StringBuilder stringBuilder = new StringBuilder(string);
        stringBuilder.reverse();
        String result = stringBuilder.toString();
        return result;
    }
}
