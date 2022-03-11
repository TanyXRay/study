package inheritance;

import java.util.Scanner;

public class LessonInheritance {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        System.out.println("Введите имя сотрудника на русском языке:");
        Scanner scan = new Scanner(System.in);
        String nameEmployee = scan.nextLine();
        if (nameEmployee.isEmpty()) {
            System.out.println("Вы ввели пустое значение, перезапустите и попробуйте снова");
            return;
        }
        scan.close();
        System.out.println(" да, так меня называют коллеги, привет и Вам!  ");
        employee1.setAge(27);
        System.out.println("мне " + employee1.getAge() + " лет");
        employee1.showPlaceOfWork();
        employee1.work();
        employee1.eat();

        Lawyer lawyer1 = new Lawyer();
        System.out.println("\nпредставим следующего сотрудника компании...\n");
        lawyer1.setName("Джо");
        System.out.println("Привет, меня зовут " + lawyer1.getName());
        lawyer1.setAge(25);
        lawyer1.showPlaceOfWork();
        lawyer1.work();
        lawyer1.eat();
    }
}
