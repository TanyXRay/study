package study.javarush.practicum.arrays;

/**
 * Работа с массивами.
 */

public class Array4 {

    public static void main(String[] args) {
        int[] array = new int[10]; //заполнение массива 10-ю элементами
        for (int i = 0; i < 10; i++) {
            array[i] = i;
            System.out.print(array[i] + ",");
        }
    }
}
