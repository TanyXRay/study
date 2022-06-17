package study.javarush.practicum.tasks.object2;

/**
 * Работа с объектами.
 * Реализуй метод showWeather, который должен выводить в консоли информацию в таком формате:
 * В городе "название города" сегодня температура воздуха "температура в городе"
 * В методе main один раз нужно вызвать метод showWeather с нужным аргументом.
 */

public class Main {

    public static void showWeather(City city) {
        System.out.println(String.format("В городе %s сегодня температура воздуха %d", city.getName(), city.getTemperature()));//напишите тут ваш код
    }

    public static void main(String[] args) {
        City city = new City("Дубай ", 40);
        showWeather(city);
    }
}
