package study.javarush.practicum.arrays;

import java.util.Scanner;

/**
 * Работа с массивами.
 * Необходимо найти среднемесячную температуру, опираясь на данные,
 * введенные пользователем в качестве пары: день - температура.
 * В случае, если пользователь ввел несколько значений температуры за один день,
 * учитывать будем последнее введенное значение.
 * Вывод среднего значения будем осуществлять после каждого ввода данных.
 */

public class Array8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] temps = new int[30];
        boolean[] isFilled = new boolean[30];
        while (true) {
            System.out.println("Введи 2 числа: дата и температура ");
            String input = scan.nextLine();
            if ("end".equalsIgnoreCase(input)) {
                break;
            }
            String[] parts = input.split(" ");
            int day = Integer.parseInt(parts[0]) - 1;
            int temp = Integer.parseInt(parts[1]);
            temps[day] = temp;// в ячейку day помещаем температуру, здесь будет температура на которую указывает номер ячейки
            isFilled[day] = true;
            double sum = 0;
            for (int tt : temps) {
                sum += tt;
            }
            int count = 0;
            for (boolean fill : isFilled) {
                if (fill) {
                    count++;
                }
            }
            System.out.println("Средняя температура: " + (sum / count));
        }
    }
}

