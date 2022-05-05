package javarushpracticum;

import java.util.Scanner;

public class Array6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //Считывает с консоли целое число N.
        int n = scan.nextInt();                //создаем переменную n и добавлем в нее значения введенные с клавиатуры
        int[] data = new int[n];               //добавляем n в массив
        for (int i = 0; i < n; i++) {
            data[i] = scan.nextInt();
        }
        if (n % 2 == 0) {
            for (int i = data.length - 1; i >= 0; i--) {
                System.out.println(data[i]);
            }
        } else {
            for (int i = 0; i < data.length; i++) {
                System.out.println(data[i]);
            }
        }
    }
}
