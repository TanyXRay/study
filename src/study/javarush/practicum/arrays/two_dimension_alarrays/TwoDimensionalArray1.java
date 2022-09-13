package study.javarush.practicum.arrays.two_dimension_alarrays;

/**
 * Работа с многомерными массивами.
 * Пример работы с рваным массивом.
 */

public class TwoDimensionalArray1 {

    public static void main(String[] args) {
        int[][] ints = new int[8][]; // укажем только кол-во строк (8), inits это ссылка, которая указывет на одномерный массив, где 8 ссылок пока никуда не указвают
        for (int i = 0; i < ints.length; i++) { // цикл по строке!
            ints[i] = new int[i]; //присваеваем значение, что она указывает на массив длинной i
            for (int j = 0; j < ints[i].length; j++) { //внутренний цикл
                ints[i][j] = i + j;
                System.out.print(ints[i][j] + " ");
            }
            System.out.println();
        }
    }
}
