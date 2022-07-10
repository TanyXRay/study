package study.javarush.practicum.arrays;

import java.util.Random;

/**
 * Работа с массивами.
 * Задача.создайте массив из 15 случайных целых чисел из отрезка [0;9].
 * Выведите массив на экран. Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке.
 */

public class Array10 {

    public static void main(String[] args) {
        Random random = new Random();
        int b = 0;
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            System.out.print(array[i] + " ");
            if (array[i] > 0 && array[i] % 2 == 0) {
                b++;
            }
        }
        System.out.println(" ");
        System.out.println("Всего четных элементов: " + b);
    }
}
