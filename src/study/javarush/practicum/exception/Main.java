package study.javarush.practicum.exception;

public class Main {

    public static void main(String[] args) {
        System.out.println(sameLengh("Petrov"));
    }

    public static boolean sameLengh(String text) {
        String[] parts = text.split(" ");
        if (parts.length != 2) {
            throw new NameInputMismatchException(text);
        }
        String name = parts[1];
        String lastName = parts[0];
        return name.length() == lastName.length();
    }
}
