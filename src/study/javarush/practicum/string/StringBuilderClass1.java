package study.javarush.practicum.string;

import java.util.Scanner;

/**
 * Примеры применения основных методов класса StringBuilder.
 */

public class StringBuilderClass1 {
    static String result;
    static String result1;
    static String result2;
    static String result3;

    public static void main(String[] args) {
        getInputText(); // вызываем данный метод и смотрим результат
    }

    public static void getInputText() {
        Scanner scan = new Scanner(System.in); // создаем объект Scanner на ввод строки
        System.out.println("Input your text:");
        String text = scan.nextLine();

        StringBuilder stringBuilder = new StringBuilder(text); // создаем объект StringBuilder
        System.out.println(stringBuilder.append(" Thank you!")); // с помощью метода append добавляем в наш текст строку

        System.out.println(result = stringBuilder.toString()); // можно с помощью toString преобразовать объект к типу String

        stringBuilder.deleteCharAt(2);
        System.out.println(result1 = stringBuilder.toString()); // с помощью метода deleteCharAt можно удалить любой символ в тексте

        stringBuilder.replace(2, 4, "WOW");
        System.out.println(result2 = stringBuilder.toString()); // метод replace заменяет кусок текста на указанный в параметрах

        stringBuilder.reverse();
        System.out.println(result3 = stringBuilder.toString()); // метод reverse разворачивает строку наоборот
    }
}

