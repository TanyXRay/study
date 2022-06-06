package study.homework.formula;

import java.util.Locale;
import java.util.Scanner;

/**
 * Пишем первый тестовый код с применением класса Scanner.
 */

public class TestCodeForGit {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("введите ваше имя с клавиатуры, пожалуйста \n");
        String name = scan.nextLine();
        System.out.print("введите любые целые числа с клавиатуры, пожалуйста \n");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        System.out.print("ЧИСЛА МЫ УЖЕ придумали ДАЛЕЕ ВЫВЕДЕМ ПРОСТЕНЬКУЮ ФОРМУЛУ\n и результат к ней\n ".toLowerCase(Locale.ROOT));
        int x = (a - b) * (c - d);
        System.out.print("x = (a - b) * (c - d)\n");
        System.out.println(" х = " + x);
        if (x > 0) {
            System.out.println(name + " результатом стало положительное число");
        } else {
            System.out.println(name + " результатом стало отрицательное число");
        }
        scan.close();
    }
}
