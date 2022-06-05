package study.javarush.practicum.arrays;

/**
 * Работа с массивами.
 */

public class Array3 {
    public static int[] firstArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static int[] secondArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
    public static int[] resultArray;

    public static void main(String[] args) { //объединение 2 массивов в 1, и передача элементов по порядку
        resultArray = new int[firstArray.length + secondArray.length];
        int count = 0;
        for (int a = 0; a < firstArray.length; a++) {
            resultArray[a] = firstArray[a];
            count++;
        }
        for (int j = 0; j < secondArray.length; j++) {
            resultArray[count++] = secondArray[j];
        }
        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i] + ", ");
        }
    }
}

