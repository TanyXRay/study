package study.javarush.practicum.objects;

/**
 * Создаем объекты и  их конструкторы.
 * нужно добавить инициализацию полей в конструкторах соответствующими параметрами.
 * Если параметр отсутствует, то нужно инициализировать поле значением по умолчанию.
 * Для поля year это текущий год (4321), для поля color — Оранжевый.
 */

public class CarConcern {
    private final String manufacturer = "Lamborghini";
    private final String model;
    private final int year;
    private final String color;

    public CarConcern(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public CarConcern(String model, int year) {
        this.model = model;
        this.year = year;
        color = "Оранжевый";
    }


    public CarConcern(String model) {
        this.model = model;
        year = 4321;
        color = "Оранжевый";
    }
}