package study.javarush.practicum.statics.static2;

/**
 * Работа со статическими переменными.
 * Нужно сделать все переменные класса Planet не статическими.
 */

public class Main {

    public static void main(String[] args) {
        Planet earth = new Planet();
        earth.name = "Земля";
        earth.age = 4_540_000_000L;
        earth.speed = 170_218;
        earth.area = 510_072_000;
        earth.printInformation();
    }
}
