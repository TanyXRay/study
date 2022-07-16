package study.javarush.practicum.innerclass.nested;

public class Outer {

     class Inner {
        Inner() {
            System.out.println("Создание объекта внутреннего класса");
        }
    }

    static class Nested {
        Nested() {
            System.out.println("Создание объекта вложенного класса");
        }
    }
}
