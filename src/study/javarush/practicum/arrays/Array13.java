package study.javarush.practicum.arrays;

import java.util.Random;

/**
 * Работа с массивами.
 * Поменять местами минимальный и максимальный элементы массива.
 */

public class Array13 {

    public static void main(String[] args) {
        Random random = new Random();

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int max = array[0];  // или int max = 0
        int min = array[0];  //     int min = 0
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            } else if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == min) {
                array[i] = max;
            } else if (array[i] == max) {
                array[i] = min;
            }
            System.out.print(array[i] + " ");
        }
    }
}