package study.javarush.practicum.inheritance.accounts;

public class CreditAccount extends Account {

    public CreditAccount(String nameOwner, long balance) {
        super(nameOwner, balance);
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
        balance -= amount;
        return true;
    }

    @Override
    public boolean add(long amount) {
        if (balance + amount > 0) {
            return false;
        } else {
            balance += amount;
            return true;
        }
    }
}
