package javarushpracticum;

/**
 * Нужно сделать так, чтобы метод возвращал true,
 * если содержимое строк одинаковое,
 * и false — если разное, не используя метод equals().
 */
public class StringIntern {
    public static void main(String[] args) {
        String first = new String("JavaRush");
        String second = new String("JavaRush");
        String third = new String("javarush");
        System.out.println(equal(first, second));
        System.out.println(equal(second, third));
    }

    public static boolean equal(String first, String second) {
        String f1 = first.intern();
        String f2 = second.intern();
        String f3 = second.intern();
        if (f1 == f2 && f2 == f3) {
            return true;
        } else return false;
    }
}
