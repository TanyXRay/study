package study.javarush.practicum.arrays;

import java.util.Scanner;

/**
 * Работа с массивами.
 * Решение задачи №1 по теме "Одномерные массивы".
 * Решение задачи №1 по теме "Исключения".
 */

public class Array15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] products = {"Хлеб", "Молоко", "Яблоки"};
        int[] prices = {35, 87, 109};
        int[] productsCount = new int[3];

        System.out.println("Список возможных товаров для покупки: ");
        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ". " + products[i] + " " + prices[i] + " руб/шт.");
        }
        while (true) {
            System.out.println("Выберите товар и количество или введите \"end\" ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("end")) {
                break;
            }
            String[] parts = input.split(" ");
            if (parts.length != 2) {
                continue;
            }
            int productNumber;
            int productCount;
            try {
                productNumber = Integer.parseInt(parts[0]) - 1;//  выбор номера продукта
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели текст заместо числа. Попробуйте снова!");
                continue;
            }
            if (productNumber >= productsCount.length || productNumber < 0) {
                System.out.println("Вы ввели некорректное число продукта. Попробуйте снова!");
                continue;
            }
            try {
                productCount = Integer.parseInt(parts[1]); //  выбор количества ранее выбранного продукта
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели текст заместо числа. Попробуйте снова!");
                continue;
            }
            if (productCount > 100 || productCount <= 0) {
                System.out.println("Вы ввели некорректное кол-во продукта. Попробуйте снова!");
                continue;
            }
            productsCount[productNumber] += productCount;
        }

        System.out.println("Ваша корзина:");
        int sum = 0;
        for (int i = 0; i < productsCount.length; i++) {
            int allCountProduct = productsCount[i];
            int priceSumByProduct = prices[i] * allCountProduct;
            if (allCountProduct > 0) {
                System.out.println(products[i] + " " + allCountProduct + " шт. в сумме " + priceSumByProduct + " руб.");
                sum += priceSumByProduct;
            }
        }
        System.out.println("Итого: " + sum + " руб.");
        scanner.close();
    }
}
