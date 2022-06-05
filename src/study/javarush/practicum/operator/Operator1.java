package study.javarush.practicum.operator;

/**
 * Работа с операторами.
 * Необходимо вывести в консоль число 30, меняя операторы.
 */

public class Operator1 {

    public static void main(String[] args) {
        taskForCondition();
    }

    public static void taskForCondition() {
        int number = 15;
        boolean firstCondition = number < 15 & number > 25 & (number += 15) < 25; //работа с лог. операциями
        boolean secondCondition = (number | 5) > 12 || (number = number + 2) > 40;
        System.out.println(number);
    }
}
