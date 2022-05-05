package javarushpracticum;

import java.util.Scanner;

public class ArrayString1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();          // вводим с клавиатуры числа
        double b = scan.nextDouble();
        if (a == b) {                          // следом их сравниваем
            System.out.println("числа равны");
        } else {
            System.out.println("числа не равны");
        }
    }
}
