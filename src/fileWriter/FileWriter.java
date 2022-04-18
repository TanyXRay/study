package fileWriter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.nio.file.StandardOpenOption.CREATE_NEW;

public class FileWriter {

    public void writePersonToFile(Person person) {
        String fileName = person.getSurname() + " " + person.getName() + ".txt";
        if (Files.exists(Path.of(fileName))){
            throw new FileAlreadyCreatedException("Файл уже существует с таким наименованием");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Фамилия: ").append(person.getSurname()).append("\n");
        sb.append("Имя: ").append(person.getName()).append("\n");
        sb.append("Отчество: ").append(person.getPatronymic()).append("\n");
        sb.append("Возраст: ").append(person.getAge()).append("\n");

        try {
            Path path = Files.writeString(Path.of(fileName), sb.toString(), CREATE_NEW);
        } catch (IOException e) {
            System.out.println("Ошибка");
            e.printStackTrace();
        }
    }
}
