package study.javarush.practicum.abstractive.example;

/**
 * Пример работы с абстрактными классами и интерфейсами.
 */

public class Main {

    public static void main(String[] args) {
        String name = "Женя";

        Car car = new Car();
        spbToMsc(name, car);

        Ship ship = new Ship();
        spbToMsc(name, ship);
        ship.pay(3000);

        Plane plane = new Plane();
        spbToMsc(name, plane);
        plane.pay(1000);

        Bike bike = new Bike();
        spbToMsc(name, bike);
    }

    public static void spbToMsc(String name, Transferer transport) {
        transport.transfer(name, "SPB", "MSC");
    }
}
