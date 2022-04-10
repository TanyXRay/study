package fileWriter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.nio.file.StandardOpenOption.CREATE_NEW;

public class FileWriter {

    public void writePersonToFile(Person person) {
        String fileName = person.getSurname() + " " + person.getName() + ".txt";
        boolean isExists = Files.exists(Path.of(fileName));
        if (isExists) {
            return;
        }

        StringBuilder sb = new StringBuilder();
        sb.append("Фамилия: ").append(person.getSurname()).append("\n");
        sb.append("Имя: ").append(person.getName()).append("\n");
        sb.append("Отчество: ").append(person.getPatronymic()).append("\n");

        try {
            Path path = Files.writeString(Path.of(fileName), sb.toString(), CREATE_NEW);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
