package study.javarush.practicum.arrays;

import java.util.Arrays;

/**
 * Работа с массивами.
 * Смотрим работу методов класса Arrays.
 */

public class ToCharArray {

    public static void main(String[] args) {
        String text = "Hello";
        String text1 = "World";

        char[] chars = text.toCharArray();
        System.out.println(Arrays.toString(chars)); //[H, e, l, l, o] получаем массив символов из строки

        char c = text.charAt(2);
        System.out.println(c);  // результат l, так как мы обратились к индексу 2

        System.out.println(text.equals(text1));// результат false так как ссылки разные

        int i = text.indexOf("o"); // ищем строку "o" и получаем индекс - 4
        System.out.println(i);

        String subtext = text.substring(0, 3);// вырезаем кусок строки: результат Hel
        System.out.println(subtext);
    }
}
