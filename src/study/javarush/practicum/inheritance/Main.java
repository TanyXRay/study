package study.javarush.practicum.inheritance;

import study.javarush.practicum.inheritance.accounts.*;
import study.javarush.practicum.inheritance.clients.*;

/**
 * Решение задачи №1 по теме: Наследование.Инкапсуляция.Полиморфизм.
 */

public class Main {

    public static void main(String[] args) {

        SavingsAccount savingsAccount = new SavingsAccount("Unknown", 1_000, 500);
        CheckingAccount checkingAccount = new CheckingAccount("Unknown", 1_000, 0);
        CreditAccount creditAccount = new CreditAccount("Unknown", 1_000);
        Client client = new Client("James", 4);

        savingsAccount.setNameOwner("James");
        savingsAccount.setBalance(20_000);
        savingsAccount.add(500);
        savingsAccount.pay(20501);

        checkingAccount.setNameOwner("James");
        checkingAccount.setBalance(300_000);
        checkingAccount.add(200_000);
        checkingAccount.pay(20_000);

        creditAccount.setNameOwner("James");
        creditAccount.setBalance(0);
        creditAccount.add(2_000);
        creditAccount.pay(20_000);
        creditAccount.add(2_000);
        creditAccount.add(17_999);
        creditAccount.add(19_000);

        client.addNewAccount(checkingAccount);
        client.addNewAccount(creditAccount);
        client.addNewAccount(savingsAccount);
        client.pay(480000);

    }
}
