package study.javarush.practicum.scanner;

import java.util.Scanner;

/**
 * Работа с классом Scanner.
 */

public class ScannerClass1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();          // вводим с клавиатуры числа
        double b = scan.nextDouble();
        if (a == b) {                          // следом их сравниваем
            System.out.println("числа равны");
        } else {
            System.out.println("числа не равны");
        }
    }
}
