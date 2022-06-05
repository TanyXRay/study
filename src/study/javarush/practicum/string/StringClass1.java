package study.javarush.practicum.string;

import java.util.Scanner;

/**
 * Пример работы с методами класса String.
 */

public class StringClass1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String path = scan.nextLine(); // вводим текст

        char[] chars = path.toCharArray(); // преобразовываем введенный текст в массив char
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '/') { // если в веденном тексте есть данный символ
                chars[i] = '\\'; // то заменить его на этот символ
            }
        }
        String text = new String(chars); // создаем новую строку на основе массива символов
        System.out.println(text); // выводим строку на экран
    }
}

