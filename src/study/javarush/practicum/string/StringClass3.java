package study.javarush.practicum.string;

import java.util.Scanner;

/**
 * Пример работы с методами класса String.
 * Пишем программу, которая просит пользователя ввести путь к файлу и проверяет,
 * что это за файл по его расширению.
 */

public class StringClass3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String path = scan.nextLine(); // вводим с клавиатуры текст с указанием формата

        if (path.endsWith(".gpg") || path.endsWith(".gpeg")) { // проверяем введенный текст на ввод формата
            System.out.println("Format file is Jpeg");
        } else if (path.endsWith(".doc") || path.endsWith(".docx")) {
            System.out.println("It is Word document");
        } else {
            System.out.println("Unknown format file"); // если неизвестный формат, то выводим данный текст в консоль
        }
    }
}
