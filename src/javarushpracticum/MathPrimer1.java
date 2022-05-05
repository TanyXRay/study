package javarushpracticum;

import java.util.Scanner;

public class MathPrimer1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ms = scan.nextInt();              // 1 ms это 3,6 кмч
        double x = ms * 3.6;                  // находим значение x
        int o = (int) Math.round(x);          // округляем его
        System.out.println(o);
    }
}
