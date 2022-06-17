package study.javarush.practicum.object.object4;

/**
 * Создаем объекты и  их конструкторы.
 * Смотрим как проинициализируются поля: сначала поля и конструктор родительского класса,
 * только потом класса-наследника.
 */

public class Main {

    public static void main(String[] args) {
        ChildClass childClass = new ChildClass();
    }

    public static String printText(String text) {
        System.out.println(text);
        return text;
    }
}
