package study.javarush.practicum.objects;

import java.util.Objects;

/**
 * Работа с объектами.
 * Нужно переопределить метод equals(Iphone), который будет учитывать все параметры.
 * У двух равных объектов значения полей должны быть одинаковыми.
 * В методе main создаются два айфона с одинаковыми параметрами.
 * В консоли выводится результат их сравнения.
 */

public class Iphone {
    private String model;
    private String color;
    private int price;

    public Iphone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Iphone iphone = (Iphone) o;
        return price == iphone.price &&
               Objects.equals(model, iphone.model) &&
               Objects.equals(color, iphone.color);
    }

    public static void main(String[] args) {
        Iphone iphone1 = new Iphone("X", "Black", 999);
        Iphone iphone2 = new Iphone("X", "Black", 999);

        System.out.println(iphone1.equals(iphone2));
    }
}