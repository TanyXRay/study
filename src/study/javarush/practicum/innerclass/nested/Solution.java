package study.javarush.practicum.innerclass.nested;

import study.javarush.practicum.innerclass.nested.Outer.Inner;

/**
 * Работа с вложенными классами.
 * В классе Outer есть внутренний (Inner) и вложенный (Nested) классы.
 * В методе main класса Solution создай по одному объекту каждого из них.
 * Условие: класс Outer изменять нельзя.
 */

public class Solution {

    public static void main(String[] args) {
        Inner inner = new Outer().new Inner();
        Outer.Nested nested = new Outer.Nested();
    }
}
