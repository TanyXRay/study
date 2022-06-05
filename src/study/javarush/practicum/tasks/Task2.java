package study.javarush.practicum.tasks;

import java.util.Scanner;

/**
 * Решение задачки.
 */

public class Task2 {

    public static void main(String[] args) {
        double glass = 1.6;                          // переменной glass присваиваем значение типа double
        Scanner scan = new Scanner(System.in);      // вводим булево значение (true or false)
        boolean a = scan.nextBoolean();
        long ag = (int) Math.ceil(glass);           // округляем значение в большую сторону
        long as = (int) Math.floor(glass);          // округляем значение в меньшую сторону
        if (a == true) {                            // если булево значение true, то выводим ag
            System.out.println(ag);
        } else {
            System.out.println(as);                  // иначе выводим as
        }
    }
}
