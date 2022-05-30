package javarushpracticum;

import java.util.Scanner;

/*
пример работы с методами класса String.
 */
public class StringClass5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // вводим текст с клавиатуры
        String path = scan.nextLine();

        int index = path.indexOf("//"); // получаем индекс первого вхождения строки //
        int index2 = path.indexOf("/",index + 2); // получаем индекс первого вхождения строки /, но ищем только после символов //.

        String first = path.substring(0, index + 2); // получаем строку от начала и заканчивая символами //
        String last = path.substring(index2); // получаем строку от / и до конца.

        String result = first + "JavaRush.ru" + last; // склеиваем строки и новый домен.
        System.out.println(result);

    }
}
