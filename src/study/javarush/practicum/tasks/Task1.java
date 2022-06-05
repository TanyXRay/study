package study.javarush.practicum.tasks;

/**
 * Решение задачки.
 */

public class Task1 {

    public static void main(String[] args) {
        for (int i = 10; i > 0; i--) {      // выводим прямоуг. треугольник вершиной вниз из цифры 8
            int starCount = 0 + i;
            for (int j = 0; j < starCount; j++)
                System.out.print("8");
            System.out.println();
        }
    }
}
