package study.javarush.practicum.statics.static4;

/**
 * В классе Window есть метод changeSize, который должен менять размеры окна на значения, переданные в метод.
 * Нужно исправить ошибки так, чтобы метод changeSize заработал.
 */

public class Main {

    public static void main(String[] args) {
        Window window = new Window();
        window.printSize();
        window.changeSize(4, 5);
        window.printSize();
    }
}
