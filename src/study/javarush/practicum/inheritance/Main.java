package study.javarush.practicum.inheritance;

/**
 * Решение задачи по теме: Наследование и инкапсуляция.
 */

public class Main {

    public static void main(String[] args) {

        SavingsAccount savingsAccount = new SavingsAccount("Unknown", 1_000, 500);
        CheckingAccount checkingAccount = new CheckingAccount("Unknown", 1_000, 0);
        CreditAccount creditAccount = new CreditAccount("Unknown", 1_000);

        savingsAccount.setNameOwner("Bryan");
        savingsAccount.setBalance(20_000);
        savingsAccount.add(500);
        savingsAccount.pay(20501);

        checkingAccount.setNameOwner("Julia");
        checkingAccount.setBalance(300_000);
        checkingAccount.add(200_000);
        checkingAccount.pay(20_000);

        creditAccount.setNameOwner("Lukas");
        creditAccount.setBalance(0);
        creditAccount.add(2_000);
        creditAccount.pay(20_000);
        creditAccount.add(2_000);
        creditAccount.add(17_999);
        creditAccount.add(19_000);
    }
}
