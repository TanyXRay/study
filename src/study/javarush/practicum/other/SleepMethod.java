package study.javarush.practicum.other;

/**
 * Работа с методом sleep класса Thread.
 */

public class SleepMethod {

    public static void main(String[] args) {
        for (int i = 3; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000); //данный класс позволяет остановить выполнение программы на определенное время
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Cтарт");
    }
}
