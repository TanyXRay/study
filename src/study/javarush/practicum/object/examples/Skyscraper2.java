package study.javarush.practicum.object.examples;

/**
 * Создаем объекты и  их конструкторы.
 * Нужно будет создать два конструктора: один с параметрами,
 * второй — без. Они оба должны инициализировать поля floorsCount и developer.
 * В конструкторе без параметров поля должны инициализироваться значениями "5" и "JavaRushDevelopment".
 * В конструкторе c параметрами поля должны инициализироваться аргументами этого конструктора.
 */

public class Skyscraper2 {
    private int floorsCount;
    private String developer;

    public Skyscraper2() {
        floorsCount = 5;
        developer = "JavaRushDevelopment";
        System.out.println(floorsCount + developer);
    }

    public Skyscraper2(int floorsCount, String developer) {
        this.floorsCount = floorsCount;
        this.developer = developer;
        System.out.println(floorsCount + developer);
    }

    public static void main(String[] args) {
        Skyscraper2 skyscraper = new Skyscraper2();
        Skyscraper2 skyscraperUnknown = new Skyscraper2(50, "Неизвестно");
    }
}
