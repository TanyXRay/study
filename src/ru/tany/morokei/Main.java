package ru.tany.morokei;

import java.util.Locale;
import java.util.Scanner;

/*
попытка - это не пытка, кто бы что ни говорил :)
*/
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите Ваше имя с клавиатуры, пожалуйста \n");
        String name = scan.nextLine();
        System.out.print("Введите рандомные числа с клавиатуры, пожалуйста \n");
        int count1 = scan.nextInt();
        int count2 = scan.nextInt();
        int count3 = scan.nextInt();
        int count4 = scan.nextInt();
        System.out.print("ЧИСЛА МЫ УЖЕ придумали ДАЛЕЕ ВЫВЕДЕМ ПРОСТЕНЬКУЮ ФОРМУЛУ\n и результат к ней\n ".toLowerCase(Locale.ROOT));
        scan.close(); // ставлю закрытие сканнера здесь!

        long a = count1;
        long b = count2;
        long c = count3;
        long d = count4;

        long x = (a - b) * (c - d);
        System.out.print("x = (a - b) * (c - d)\n");
        System.out.println("итак х = " + x);
        System.out.println("теперь немного операторов условий");

        if (x > -10 && x < 500) {
            System.out.println(name + " так задумано, все хорошо...");
        } else {
            System.out.println(name + " что - то пошло не так, не тот результат");
        }

    }

}