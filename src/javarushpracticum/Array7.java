package javarushpracticum;

import java.util.Scanner;

public class Array7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);   //Создаем объект Scanner
        int[] array = new int[10];               //Создаем объект-массив на 10 элементов
        for (int i = 0; i < 10; i++) {           //цикл от 0 до 9 включительно
            array[i] = scan.nextInt();           //Читаем число с клавиатуры и сохраняем его в очередную ячейку массива
        }
        int min = array[0];                      //Объявили переменную min и качестве минимального числа взяли нулевой элемент массива
        for (int i = 0; i < 10; i++) {           //Цикл от 1 до 9 включительно
            if (array[i] < min) {                //Если текущий элемент массива меньше «найденного минимального числа»
                min = array[i];                  //то «обновить значение минимального числа»
            }
        }
        System.out.println(min);                 //Вывести найденное минимальное число на экран
    }
}
