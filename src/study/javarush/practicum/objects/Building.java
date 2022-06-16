package study.javarush.practicum.objects;

/**
 * Создаем объекты.
 * Нужно сделать так, что бы здание было универсальным,
 * и его назначение можно было менять, не создавая нового.
 * Для этого создай метод initialize, который будет устанавливать значение полю type (определять тип здания).
 * Конструкторы создавать не нужно!
 */
public class Building {
    private String type;

    public void initialize(String type) {
        this.type = type;
    }

    public static void main(String[] args) {
        Building building = new Building();
        building.initialize("Барбершоп");
    }
}