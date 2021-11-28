package QuickSort;

import java.util.Arrays;

public class QuickSort {

    public static void QuickSort (int [] array, int low, int high) {
        if (array.length == 0)
            return; // завершаем выполнение, если длинна массива равна 0

        if (low >= high)
            return; // завершаем выполнение если нет чисел на деление

        // выбираем опорный элемент массива
        int middle = low + (high - low) / 2;
        int support = array[middle];

        //делим на подмассивы, больше или меньше опорного элемента
        int a = low, b = high;
        while (a <= b) {
            while (array[a] < support) {
                a++;
            }
            while (array[b] > support) {
                b--;
            }
            if (a <= b) {   // сам алгоритм смены места чисел
                int change = array [a];
                array [a] = array[b];
                array [b] = change;
                a++;
                b--;
            }
        }
        //вызываем рекурсию для сортировки 2х частей
        if (low < b)
            QuickSort(array, low, b);
        if (high > a)
            QuickSort(array, a, high);
    }
    // теперь выводим главный метод, где выводится массив
    public static void main(String[] args) {
        int massive[] = new int [101];
        for (int c = 0; c < massive.length; c++) {
            massive[c] = (int) (Math.random() * 101);
        }
        System.out.print( "Изначальный массив был: \n" + Arrays.toString(massive) );
        int low = 0;
        int high = massive.length - 1;
        QuickSort(massive, low, high);
        System.out.println( "\nОтсортированный массив стал: \n" + Arrays.toString(massive));
    }

}
