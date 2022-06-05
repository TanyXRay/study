package study.javarush.practicum.string;

/**
 * Пример работы с методами класса String.
 */

import java.util.Scanner;

public class StringClass2 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String path = console.nextLine(); // вводим текст с клавиатуры

        String result = path.replace('/', '\\'); // меняем символ в строке на новый
        System.out.println(result);
    }
}
