package study.javarush.practicum.inheritance;

public class CheckingAccount extends Account {
    private final int minBalance;
    private long balance;

    public CheckingAccount(String nameOwner, long balance, int minBalance) {
        super(nameOwner, balance);
        this.balance = balance;
        this.minBalance = minBalance;
    }

    @Override
    public boolean pay(long amount) {
        if (amount <= balance && balance >= minBalance) {
            System.out.println("Вы можете оплатить покупку с расчетного счета на " + amount + " руб.");
            balance -= amount;
            System.out.println("Ваш расчетный баланс: " + balance + " руб.!");
            return true;
        } else {
            System.out.println("Вы не можете оплатить покупку с расчетного счета на " + amount + " руб.!");
            System.out.println("Ваш расчетный баланс: " + balance + " руб.!");
        }
        return false;
    }

    @Override
    public boolean add(long amount) {
        System.out.println("Вы можете пополнить расчетный счет!");
        balance += amount;
        System.out.println("Ваш расчетный баланс: " + balance + " руб.!");
        return true;
    }
}
