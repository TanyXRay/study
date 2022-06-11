package study.javarush.practicum.tasks;

import java.util.Scanner;

/**
 * Выполнение задачи по теме "Примитивные типы данных".
 * Пишем программу-помощника индивидуальному предпринимателю.
 */

public class Task5 {

    public static void main(String[] args) {
        int earnings = 0;
        int spendings = 0;

        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("""
                    Выберите операцию и введите ее номер:\s
                    1. Добавить новый доход\s
                    2. Добавить новый расход\s
                    3. Выбрать систему налогообложения
                    Примечание: ввод "end" завершает работу программы""");
            String operation = scan.nextLine();
            if (operation.equalsIgnoreCase("end")) {
                break;
            } else {
                int operation2 = Integer.parseInt(operation);
                switch (operation2) {
                    case 1 -> {
                        System.out.println("Введите сумму дохода: ");
                        String earningStr = scan.nextLine();
                        int earning = Integer.parseInt(earningStr);
                        earnings += earning;
                    }
                    case 2 -> {
                        System.out.println("Введите сумму расхода: ");
                        String spendStr = scan.nextLine();
                        int spend = Integer.parseInt(spendStr);
                        spendings += spend;
                    }
                    case 3 -> {
                        double taxResult = taxCalcEarningsMinusSpending(earnings, spendings);
                        double taxResult2 = taxCalcEarnings(earnings);
                        if (taxResult < taxResult2) {
                            System.out.println("Мы советуем вам УСН доходы минус расходы \n" +
                                               "Ваш налог составит: " + taxResult + " рублей \n" +
                                               "Налог на другой системе: " + taxResult2 + " рублей \n" +
                                               "Экономия: " + (taxResult2 - taxResult) + " рублей");
                        } else {
                            System.out.println("Мы советуем вам УСН доходы \n" +
                                               "Ваш налог составит: " + taxResult2 + " рублей \n" +
                                               "Налог на другой системе: " + taxResult + " рублей \n" +
                                               "Экономия: " + (taxResult - taxResult2) + " рублей \n");
                        }
                    }
                    default -> System.out.println("Такой операции нет");
                }
            }
        }
        System.out.println("Спасибо! Программа завершена!");
        scan.close();
    }

    public static int taxCalcEarningsMinusSpending(int earnings, int spending) {
        int tax = (earnings - spending) * 15 / 100;
        return Math.max(tax, 0);
    }

    public static int taxCalcEarnings(int earnings) {
        int tax = earnings * 6 / 100;
        return Math.max(tax, 0);
    }
}
