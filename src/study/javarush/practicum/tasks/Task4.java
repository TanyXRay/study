package study.javarush.practicum.tasks;

/**
 * Решение задачки.
 */

public class Task4 {

    static String name = "Tatyana";
    static String surname = "Chernyadieva";
    static double income = 35059.35;
    static double spending = 19056.50;

    public static void main(String[] args) {
        System.out.println(name + " " + surname); // задача 1
        System.out.println(name + " " + surname + ", месячный остаток: " + getSurplus() + " руб."); // задача 2
    }

    public static double getSurplus() {
        double surplus = income - spending;
        int scale = 100;
        return Math.ceil(surplus * scale) / scale;
    }
}
