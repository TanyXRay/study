package fileWriter;

import java.util.Scanner;

public class PersonScanner {
    private Scanner scan = new Scanner(System.in);

    private final Person person;

    public PersonScanner(Person person) {
        this.person = person;
    }

    public void fillSecondName() {
        System.out.println("Введите фамилию: ");
        String rawSurname = scan.nextLine();
        if (!TextValidator.checkFIO(rawSurname)) {
            fillSecondName();
        }
        person.setSurname(rawSurname);
    }

    public void fillFirstName() {
        System.out.println("Введите имя: ");
        String rawFirstName = scan.nextLine();
        if (!TextValidator.checkFIO(rawFirstName)) {
            fillFirstName();
        }
        person.setName(rawFirstName);
    }

    public void fillFirstPatronymic() {
        System.out.println("Введите отчество: ");
        String rawFirstPatronymic = scan.nextLine();
        if (!TextValidator.checkFIO(rawFirstPatronymic)) {
            fillFirstPatronymic();
        }
        person.setPatronymic(rawFirstPatronymic);
    }

    public void fillAge() {
        boolean isValid = true;
        while (isValid) {
            try {
                System.out.println("Введите возраст: ");
                String rawAge = scan.nextLine();
                int age = Integer.parseInt(rawAge);
                if (age > 0 && age <= 120) {
                    person.setAge(rawAge);
                    isValid = false;
                } else {
                    System.out.println("Ошибка валидации возраста.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка, введите целое число.");
            }
        }
    }

    public void closeScan() {
        scan.close();
    }
}
