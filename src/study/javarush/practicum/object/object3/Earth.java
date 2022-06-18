package study.javarush.practicum.object.object3;

/**
 * Работа с объектами и их конструкторами.
 * Как известно, на планете Земля есть 6 материков.
 * Создай для каждого материка собственный класс.
 * В каждом классе должно быть поле, которое хранит площадь соответствующего материка.
 * Площадь материка нужно указывать при его создании, и она должна быть неизменяемой.
 * Ты можешь использовать любые числа для задания площади материков.
 */

public class Earth {

    public static void main(String[] args) {
        Africa africa = new Africa(265);
        Antarctica antarctica = new Antarctica(369);
        Australia australia = new Australia(248);
        Eurasia eurasia = new Eurasia(473);
        NorthAmerica northAmerica = new NorthAmerica(497);
        SouthAmerica southAmerica = new SouthAmerica(584);
    }
}
