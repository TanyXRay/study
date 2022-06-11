package study.javarush.practicum.tasks;

import java.util.Scanner;

/**
 * Выполнение задачи по теме "Типы данных в Java. Объекты".
 * Пишем приложение, которое запрашивает ввод пользователем имён
 * и после каждого введённого имени сообщает какое из всех
 * введённых имён было самым длинным и сколько последнему
 * введённому имени не достаёт символов до самого длинного имени.
 */

public class Task6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String maxNameLenght = null;
        while (true) {
            System.out.println("\nВведите имя с большой буквы:");
            String name = scan.nextLine();
            if (name.equalsIgnoreCase("end")) {
                System.out.println("Программа завершена!");
                break;
            } else {
                if (!Character.isUpperCase(name.toCharArray()[0])) {
                    System.out.println("Имена нужно вводить с большой буквы!");
                } else if (maxNameLenght == null) {
                    System.out.println("Это первое введённое имя!");
                    maxNameLenght = name;
                } else if (name.length() > maxNameLenght.length()) {
                    System.out.println("Самое длинное имя: " + name);
                    maxNameLenght = name;
                } else {
                    System.out.println("Самое длинное имя: " + maxNameLenght);
                    int numericalDifference = maxNameLenght.length() - name.length();
                    System.out.println("Не хватило символов: " + numericalDifference);
                }
            }
        }
    }
}
