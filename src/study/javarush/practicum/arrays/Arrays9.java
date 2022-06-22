package study.javarush.practicum.arrays;

/**
 * Работа с массивами.
 * Задача: создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку,
 * а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 … 5 3 1).
 */

public class Arrays9 {

    public static void main(String[] args) {
        int[] numers = new int[100];               // первый вариант
        for (int i = 0; i < numers.length; i++) {
            if (!(i % 2 == 0)) {
                numers[i] = i;
                System.out.print(numers[i] + ", ");
            }
        }
        System.out.println();
        for (int i = 100; i > 0; i--) {
            if (!(i % 2 == 0)) {
                numers[i] = i;
                System.out.print(numers[i] + ", ");
            }
        }
        System.out.println();
        int a = 0;                                        // второй вариант
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0)
                a++;
        }
        int[] Mas = new int[a];
        for (int i = 1, b = 0; i <= 99; i++) {
            if (i % 2 != 0) {
                Mas[b] = i;
                System.out.print(Mas[b] + " ");
                b++;
            }
        }
        System.out.println(" ");
        for (int i = Mas.length - 1; i >= 0; i--) {
            System.out.print(Mas[i] + " ");
        }
    }
}
