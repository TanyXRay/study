package study.javarush.practicum.arrays;

import java.util.Arrays;
import java.util.Random;

/**
 * Работа с массивами.
 * Найти максимальный элемент в массиве из сгенерированных чисел.
 */

public class Array12 {

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            System.out.print(array[i] + " ");
        }
        System.out.println();
       System.out.println(Arrays.stream(array).max()); // 1 способ с помощью класса Arrays метод stream().max()

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        System.out.println(max); // 2 способ с помощью проверочной переменной:
                                 // программа переберет все элементы и если последующий элемент
                                 // массива будет больше значения, которое лежит под [0] индексом,
                                 // программа сохранит это число в переменную max и выведет в консоль
    }
}
