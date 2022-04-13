package fileWriter;

public class FillPersonProgram {

    public static void main(String[] args) {
        Person person = new Person();

        PersonScanner personScanner = new PersonScanner(person);
        personScanner.fillSecondName();
        personScanner.fillFirstName();
        personScanner.fillFirstPatronymic();
        personScanner.fillAge();
        personScanner.closeScan();

        FileWriter fileWriter = new FileWriter();
        fileWriter.writePersonToFile(person);
    }
}
