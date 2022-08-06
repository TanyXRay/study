package study.javarush.practicum.tasks;

import java.util.Scanner;

/**
 * Продуктовая корзина.
 */

public class Task8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] products = {"Хлеб", "Молоко", "Яблоки", "Торты", "Выпечка", "Шоколад"};
        String[] saleProducts = {null, null, null, "Торты", "Выпечка", "Шоколад"};
        int[] prices = {35, 87, 109, 100, 500, 150};
        int[] productsCount = new int[6];

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
            String[] parts = (input.split(" "));
            if (parts.length != 2) {
                continue;
            }
            try {
                int productNumber = Integer.parseInt(parts[0]) - 1;
                if (productNumber >= 6 || productNumber < 0) {
                    System.out.println("Вы ввели некорректное число продукта. Попробуйте снова!");
                    continue;
                }
                int productCount = Integer.parseInt(parts[1]);
                if (productCount > 100) {
                    System.out.println("Вы ввели некорректное кол-во продукта. Попробуйте снова!");
                    continue;
                } else if (productCount == 0) {
                    productsCount[productNumber] = 0;
                } else {
                    productsCount[productNumber] += productCount;
                }
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели текст вместо числа. Попробуйте снова!");
                continue;
            }
        }
        int sum = 0;
        int saleSum = 0;
        int allCountProduct;
        int priceSumByProduct;
        int priceSale;
        int discountSum;
        int allDiscountSum = 0;
        int totalPrice;
        System.out.println("Ваша корзина:");
        for (int i = 0; i < products.length; i++) {
            allCountProduct = productsCount[i];
            priceSumByProduct = prices[i] * allCountProduct;
            discountSum = productsCount[i] / 3 * prices[i];
            priceSale = priceSumByProduct - discountSum;
            if (allCountProduct > 0) {
                if (allCountProduct > 2 && saleProducts[i] != null) {
                    System.out.println("Товар: " + products[i] + " " + allCountProduct + " шт. с учетом скидки в сумме " + priceSale + " руб. АКЦИЯ 3 ПО ЦЕНЕ 2");
                    saleSum += priceSale;
                    allDiscountSum += discountSum;
                } else if (allCountProduct < 3 && saleProducts[i] != null) {
                    System.out.println("Товар: " + products[i] + " " + allCountProduct + " шт. в сумме " + priceSale + " руб.");
                    sum += priceSumByProduct;
                } else {
                    System.out.println("Товар: " + products[i] + " " + allCountProduct + " шт. в сумме " + priceSumByProduct + " руб.");
                    sum += priceSumByProduct;
                }
            } else if (allCountProduct < 0) {
                System.out.println("Сумма товаров некорректна ! Отрицательное число по товару: " + products[i] + "  кол-во: " + allCountProduct + " шт.");
            }
        }
        totalPrice = sum + saleSum;
        System.out.println("Итого товаров на сумму : " + totalPrice + " руб." + " из них товаров по акции на сумму " + saleSum + "  руб.");
        System.out.println("Итого скидка составила : " + allDiscountSum + " руб.");
        scanner.close();
    }
}

