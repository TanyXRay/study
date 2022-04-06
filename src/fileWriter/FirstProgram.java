package fileWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Tatyana Chernyadieva, 05/04/22
 */

public class FirstProgram {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите имя пользователя: ");
        String name = scan.nextLine();
        File file = new File("C://Users//User//IdeaProjects//one//" + name);
        if (file.createNewFile()) {
            System.out.println("Файл создан");
        } else {
            System.out.println("Файл уже существует или введено пустое значение!");
            return;
        }
        FileWriter writer = new FileWriter(file, false);
        System.out.println(file.getPath());
        writer.write("Данные о пользователе.\n");
        writer.write("\nИмя: " + name);
        System.out.println("Введите отчество: ");
        if (scan.hasNextInt()) {
            System.out.println("Все фигня, давай по новой");
        } else {
            String patronymic = scan.nextLine();
            writer.write("\nОтчетство: " + patronymic);
        }
        System.out.println("Введите фамилию: ");
        if (scan.hasNextInt()) {
            System.out.println("Все фигня давай по новой");
            return;
        } else {
            String surname = scan.nextLine();
            writer.write("\nФамилия: " + surname);
        }
        System.out.println("Введите возраст: ");
        int age = scan.nextInt();
        writer.write("\nВозраст: " + age);
        if (age <= 0 || age > 120) {
            System.out.println("Вы ввели некорректные числовые значения, начните снова");
            return;
        }
        writer.write("\nЭто все, что нужно знать о пользователе " + name);
        writer.close();
    }
}

