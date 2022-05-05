package javarushpracticum;

import java.util.Scanner;

public class Array5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);   //Создаем объект Scanner
        int[] array = new int[10];                //Создаем объект-массив на 10 элементов
        for (int i = 0; i < array.length; i++) {  //Цикл от 0 до 9 включительно
            array[i] = scan.nextInt();            //Читаем число с клавиатуры и сохраняем его в очередную ячейку массива
        }
        for (int i = 9; i > 0; i--) {             //значения массива в обратном порядке,i будет принимать значения от 9 до 0
            // (не забываем, что индексы массива нумеруются с 0).
            System.out.println(array[i]);
        }
    }
}
