package study.javarush.practicum.inheritance.accounts;

public class SavingsAccount extends Account {
    private final int minBalance;

    public SavingsAccount(String nameOwner, long balance, int minBalance) {
        super(nameOwner, balance);
        this.minBalance = minBalance;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String getNameOwner() {
        return nameOwner;
    }

    public void setNameOwner(String nameOwner) {
        this.nameOwner = nameOwner;
    }

    @Override
    public boolean pay(long amount) {
        if (amount < balance && balance > minBalance) {
            balance -= amount;
            System.out.println("Операция успешна с накопительного счета");
            return true;
        } else {
            System.out.println("Операция не успешна с накопительного счета");
            return false;
        }
    }

    @Override
    public boolean add(long amount) {
        balance += amount;
        return true;
    }
}