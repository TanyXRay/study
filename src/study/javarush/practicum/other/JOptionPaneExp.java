package study.javarush.practicum.other;

import javax.swing.*;

/**
 * Работа с методом JOptionPane.
 */

public class JOptionPaneExp {

    public static void main(String[] args) {
        int a;
        for (; ; ) {
            try {
                a = Integer.valueOf(JOptionPane.showInputDialog("Введите целое число"));
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ошибка, некорректный ввод");
            }
        }
        System.out.println(a);
    }
}
