package javarushpracticum;

import java.util.Scanner;

public class Double1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int bottle = scan.nextInt();           // вводим числа с клавиатуры (сколько бутылок и человек)
        int people = scan.nextInt();
        double result = (bottle * 1.0)/people; // выясняем, сколько бутылок будет приходиться на человека
        System.out.println(result);
    }
}
