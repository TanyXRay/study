package study.javarush.practicum.scanner;

import java.util.Scanner;

/**
 * Работа с классом Scanner.
 * Программа по определению високосного года.
 */

public class ScannerClass5 {

    public static void main(String[] args) {
        getInputYear();
    }

    public static void getInputYear() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите год в формате \"yyyy\": ");
        int year = scan.nextInt();
        if (year % 400 == 0) {
            System.out.println("Колличество дней 366");
        } else if (year % 100 == 0) {
            System.out.println("Колличество дней 365");
        } else if (year % 4 == 0) {
            System.out.println("Колличество дней 366");
        } else System.out.println("Колличество дней 365");
        scan.close();
    }
}

