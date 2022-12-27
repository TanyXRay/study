package study.javarush.practicum.inheritance.accounts;

import study.javarush.practicum.inheritance.accept.MoneyTarget;

public abstract class Account implements MoneyTarget {
    protected String nameOwner;
    protected long balance;
    protected String nameOfAccount;

    public Account(String nameOwner, long balance, String nameOfAccount) {
        this.nameOwner = nameOwner;
        this.balance = balance;
        this.nameOfAccount = nameOfAccount;
    }

    /**
     * Данный метод осуществляет оплату покупки.
     */
    public abstract boolean pay(long amount);

    /**
     * Данный метод осуществляет пополнение счета.
     */
    public abstract boolean add(long amount);

    /**
     * Данный метод осуществляет перевод с одного счета на другой.
     */
    public abstract boolean transfer(Account accountTo, int amount);

    public abstract void setNameOwner(String name);
}
