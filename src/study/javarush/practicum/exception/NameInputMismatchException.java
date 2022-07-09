package study.javarush.practicum.exception;

public class NameInputMismatchException extends RuntimeException {

    public NameInputMismatchException(String text) {
        super("В параметре нужно указать имя и фамилию, но было указано " + text);
    }
}
