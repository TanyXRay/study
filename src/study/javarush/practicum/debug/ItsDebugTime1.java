package study.javarush.practicum.debug;

/**
 * Смотрим как работает дебаг часть 1.
 */

public class ItsDebugTime1 {
    public static int result = 105;

    public static void main(String[] args) {
        byte correction = Byte.MAX_VALUE;
        for (double fahrenheit = -459.67; fahrenheit < 451; fahrenheit += 40) {
            correction *= fahrenheit;
            System.out.println(correction);
        }
    }
}
