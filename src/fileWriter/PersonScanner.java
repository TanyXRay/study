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

    public void closeScan(){
        scan.close();
    }
}
