package study.javarush.practicum.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Работа с коллекциями List
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();

        words.add("Hello world!");
        words.add("Amigo");
        words.add("Elly");
        words.add("Kerry");
        words.add("Bug");
        words.add("bug");
        words.add("Easy ug");
        words.add("Risha");

        List<String> copyWordsFirst = new ArrayList<>(words);
        List<String> copyWordsSecond = new ArrayList<>(words);
        List<String> copyWordsThird = new ArrayList<>(words);

        removeBugWithFor(copyWordsFirst);

        removeBugWithWhile(copyWordsSecond);

        removeBugWithCopy(copyWordsThird);

        copyWordsFirst.forEach(System.out::println);
        String line = "_________________________";
        System.out.println(line);
        copyWordsSecond.forEach(System.out::println);
        System.out.println(line);
        copyWordsThird.forEach(System.out::println);
        System.out.println(line);
    }

    /**
     * метод должен удалить строку из списка, если она содержит слово bug, используя цикл for и счетчик.
     *
     * @param list
     */
    public static void removeBugWithFor(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            String w = list.get(i);
            if (w.equalsIgnoreCase("bug")) {
                list.remove(w);
                i--;
            }
        }
    }

    /**
     * метод должен удалить строку из списка, если она содержит слово bug, используя цикл while и метод iterator().
     *
     * @param list
     */
    public static void removeBugWithWhile(List<String> list) {
        Iterator<String> str = list.iterator();
        while (str.hasNext()) {
            String word = str.next();
            if (word.equalsIgnoreCase("bug")) {
                str.remove();
            }
        }
    }

    /**
     * метод должен удалить строку из списка, если она содержит слово bug, используя цикл for-each и копию списка.
     *
     * @param list
     */
    public static void removeBugWithCopy(List<String> list) {
        ArrayList<String> listCopy = new ArrayList<>(list);
        for (String str : listCopy) {
            if (str.equalsIgnoreCase("bug")) {
                list.remove(str);
            }
        }
    }
}
