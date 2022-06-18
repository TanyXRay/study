package study.javarush.practicum.object.object5;

/**
 * Работа с объектами. Геттеры и сеттеры.
 * В классе Coordinate есть 2 геттера и 2 сеттера, но значения переменным сеттеры не устанавливают.
 * Разберись, почему так происходит и исправь.
 */

public class Main {

    public static void main(String[] args) {
        Coordinate coordinate = new Coordinate();
        coordinate.setX(15);
        coordinate.setY(25);
        System.out.println(coordinate.getX());
        System.out.println(coordinate.getY());
    }
}
