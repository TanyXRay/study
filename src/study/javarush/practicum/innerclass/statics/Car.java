package study.javarush.practicum.innerclass.statics;

/**
 * Работа с вложенными классами.
 * Задача: создать вложенный класс Engine, а в нем уже прописать поле boolean isRunning
 * и методы start(),stop().
 */

public class Car {
    private Engine engine;

    public static class Engine {
        private boolean isRunning;

        public void start() {
            isRunning = true;
        }

        public void stop() {
            isRunning = false;
        }
    }
}
