package study.javarush.practicum.inheritance.accounts;

public class Account {
    protected String nameOwner;
    protected long balance;

    public Account(String nameOwner, long balance) {
        this.nameOwner = nameOwner;
        this.balance = balance;
    }

    /**
     * Данный метод осуществляет оплату покупки.
     *
     * @param amount
     * @return
     */
    public boolean pay(long amount) {
        return true;
    }

    /**
     * Данный метод осуществляет пополнение счета.
     *
     * @param amount
     * @return
     */
    public boolean add(long amount) {
        return true;
    }
}
