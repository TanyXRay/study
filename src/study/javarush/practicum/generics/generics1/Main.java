package study.javarush.practicum.generics.generics1;

public class Main {

    public static void main(String[] args) {

        Generic1<Integer> generic1 = new Generic1<>(100);

        //  generic1.setElement("Hello");
        int sum = 50 + generic1.getElement();
        System.out.println(sum);

        Generic1<String> generic2 = new Generic1<>("Hello world");

        System.out.println(generic1);
        System.out.println(generic2);

        Integer[] array = {-27, -100, 56, 8};
        Integer max1 = getMax(array);
        System.out.println(max1);
    }

    public static <T extends Comparable> T getMax(T[] array) {
        T max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max.compareTo(array[i]) < 0) {
                max = array[i];
            }
        }
        return max;
    }
}
