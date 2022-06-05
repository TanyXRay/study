package study.javarush.practicum.scanner;

import java.util.Scanner;

/**
 * Работа с классом Scanner.
 * Выполнение задачи по теме "Циклы, условные операторы".
 */

public class ScannerClass4 {
    static int result;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Введите год в формате \"yyyy\": ");
            int rawYear = scan.nextInt();
            System.out.println("Введите колличество дней: ");
            int rawDays = scan.nextInt();
            int checkedDaysOfYear = checkYear(rawYear); // в метод посылаем аргумент rawYear
            if (rawDays == checkedDaysOfYear) { // проверяем введенные дни с проверочным по условию из метода checkYear
                result++;
            } else {
                System.out.println("Неправильно! В этом году " + checkedDaysOfYear + " дней!");
                break;
            }
        }
        System.out.println("Набрано очков: " + result);
        scan.close();
    }

    public static int checkYear(int rawYear) {
        int checkDay;  // оставим логику для определения високосного года в отдельном методе
        if (rawYear % 400 == 0) {
            checkDay = 366;
        } else if (rawYear % 100 == 0) {
            checkDay = 365;
        } else if (rawYear % 4 == 0) {
            checkDay = 366;
        } else {
            checkDay = 365;
        }
        return checkDay;
    }
}
