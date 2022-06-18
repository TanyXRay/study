package study.javarush.practicum.object.examples;

/**
 * Работа с объектами.
 * По условию задачи нициализация полей класса Car должна происходить не в конструкторе,
 * а в методе initialize.
 * В консоль также необходимо вывести информацию об объекте.
 */

public class Car {
    private String model;
    private int year;
    private String color;

    public void initialize(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public String toString() {
        return "модель: " + model + "," + " год выпуска: " + year + "," + " цвет: " + color;
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.initialize("Toyota", 2010, "orange");
        System.out.println(car);
    }
}