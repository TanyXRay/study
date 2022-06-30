package study.javarush.practicum.inheritance;

/**
 * Решение задачи по теме: Наследование и инкапсуляция.
 */

public class Main {

    public static void main(String[] args) {

        SavingsAccount savingsAccount = new SavingsAccount("Jorge", 10_000, 500);
        CheckingAccount checkingAccount = new CheckingAccount("Jorge", 100_000, 0);
        CreditAccount creditAccount = new CreditAccount("Jorge", 300_000);

        savingsAccount.add(500);
        savingsAccount.pay(9500);

        creditAccount.pay(1_000_000);
        creditAccount.add(1_000_000);

        checkingAccount.pay(150_000);
        checkingAccount.pay(100_000);
        checkingAccount.pay(1_000);
        checkingAccount.add(1_500);
    }
}
