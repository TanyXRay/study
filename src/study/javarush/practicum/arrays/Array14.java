package study.javarush.practicum.arrays;

import java.util.Scanner;

/**
 * Ввести с клавиатуры число N.
 * Считать N целых чисел и заполнить ими массив array.
 * Найти максимальное число среди элементов массива.
 * Требования:
 * •В методе main(String[]) считай с клавиатуры число N,
 * потом проинициализируй массив array размером N элементов,
 * и заполни числами с клавиатуры.
 * •В методе main(String[]) выведи в консоль максимальное
 * число среди элементов массива.
 */

public class Array14 {
    public static int[] array;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(scan.nextLine());
        }

        int maxCount = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxCount) {
                maxCount = array[i];
            }
        }
        System.out.println(maxCount);
    }
}
