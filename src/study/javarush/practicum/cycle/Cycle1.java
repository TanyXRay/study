package study.javarush.practicum.cycle;

/**
 * Работа с циклом.
 * Вывести на экран сумму чисел от 1 до 100 включительно,
 * не кратных 3 с помощью continue.
 */

public class Cycle1 {

    public static void main(String[] args) {
        int sum = 0;
        int number = 0;
        while (number <= 100) {
            if (number % 3 == 0) {
                number++;
                continue;
            }
            sum = sum + number;
            number++;
        }
        System.out.println(sum);
    }
}
