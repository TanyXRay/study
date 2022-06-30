package study.javarush.practicum.inheritance;

public class CreditAccount extends Account {
    private long balance;


    public CreditAccount(String nameOwner, long balance) {
        super(nameOwner, balance);
        this.balance = balance;
    }

    @Override
    public boolean pay(long amount) {
        System.out.println("Вы можете оплатить покупку с кредитного счета на " + amount + " руб.!");
        balance -= amount;
        System.out.println("Ваш баланс: " + balance + " руб.!");
        return true;
    }

    @Override
    public boolean add(long amount) {
        System.out.println("Вы не можете пополнять кредитный счет!");
        return balance < 0;
    }
}
