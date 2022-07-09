package study.javarush.practicum.inheritance;

import study.javarush.practicum.inheritance.accounts.CheckingAccount;
import study.javarush.practicum.inheritance.accounts.CreditAccount;
import study.javarush.practicum.inheritance.accounts.SavingsAccount;
import study.javarush.practicum.inheritance.clients.Client;

/**
 * Решение задачи №1 по теме: Наследование.Инкапсуляция.Полиморфизм.
 */

public class Main {

    public static void main(String[] args) {

        SavingsAccount savingsAccount = new SavingsAccount("Unknown", 1_000_000, "накопительный счет", 500);
        CheckingAccount checkingAccount = new CheckingAccount("Unknown", 15_000, "расчетный счет", 0);
        CreditAccount creditAccount = new CreditAccount("Unknown", -100, "кредитный счет");
        Client client = new Client("James", 5);

        savingsAccount.setNameOwner("James");
        savingsAccount.add(500);
        savingsAccount.pay(2_000);
        savingsAccount.transfer(checkingAccount, 9_000);
        savingsAccount.accept(533);
        savingsAccount.accept(633);

        checkingAccount.setNameOwner("James");
        checkingAccount.add(200_000);
        checkingAccount.pay(20_000);
        checkingAccount.transfer(creditAccount, 500);
        checkingAccount.transfer(creditAccount, 1_000_000);
        checkingAccount.accept(7_800);

        creditAccount.setNameOwner("James");
        creditAccount.add(2_000);
        creditAccount.pay(20_000);
        creditAccount.add(2_000);
        creditAccount.add(17_999);
        creditAccount.add(19_000);
        creditAccount.transfer(savingsAccount, 600_000);
        creditAccount.accept(1_400);

        client.addNewAccount(creditAccount);
        client.addNewAccount(checkingAccount);
        client.addNewAccount(savingsAccount);
        client.pay(4_000);
        client.accept(1_000_000);
        client.accept(1_000);
    }
}