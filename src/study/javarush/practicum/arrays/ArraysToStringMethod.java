package study.javarush.practicum.arrays;

import java.util.Arrays;

/**
 * Работа с массивами.
 * Смотрим работу методов класса Arrays.
 */

public class ArraysToStringMethod {

    public static void main(String[] args) {
        int[] array = new int[]{7, 15, 10, 25, 30}; // явно указываем что хранится
        System.out.println(Arrays.toString(array));
        System.out.println();
        int[] array2 = Arrays.copyOfRange(array,0,5); //копируем массивы в другой массив с помощью класса Arrays  вызовом метода copyOfRange(array,0,4)
        System.out.println(Arrays.toString(array2));
        System.out.println();
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2)); // сортировка по порядку!
        System.out.println();
        for(int element : array){ // цикл for-each только на чтение
            System.out.print(element + ", ");
        }
    }
}
