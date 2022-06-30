package study.javarush.practicum.inheritance;

public class Account {

    private String nameOwner;
    private long balance;

    public Account(String nameOwner, long balance) {
        this.nameOwner = nameOwner;
        this.balance = balance;
    }

    /**
     * Данный метод осуществялет оплату покупки.
     *
     * @param amount
     * @return
     */
    public boolean pay(long amount) {
        return true;
    }

    /**
     * Данный метод осуществялет пополнение счета.
     *
     * @param amount
     * @return
     */
    public boolean add(long amount) {
        return true;
    }
}
