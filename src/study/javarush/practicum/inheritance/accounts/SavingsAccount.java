package study.javarush.practicum.inheritance.accounts;

public class SavingsAccount extends Account {
    private final int minBalance;

    public SavingsAccount(String nameOwner, long balance, String nameOfAccount, int minBalance) {
        super(nameOwner, balance, nameOfAccount);
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
            System.out.println("Операция по оплате успешна с накопительного счета");
            System.out.println("Баланс счета " + "\"" + nameOfAccount + "\"" + " составляет " + balance + " руб.");
            return true;
        } else {
            System.out.println("Операция по оплате не успешна с накопительного счета");
            return false;
        }
    }

    @Override
    public boolean add(long amount) {
        balance += amount;
        System.out.println("Баланс счета " + "\"" + nameOfAccount + "\"" + " составляет " + balance + " руб.");
        return true;
    }

    @Override
    public boolean transfer(Account accountTo, int amount) {
        if (amount < balance && balance > minBalance) {
            if (accountTo.add(amount)) {
                balance -= amount;
                System.out.println("Перевод осуществлен со счета: " + "\"" + nameOfAccount + "\"" + ", в сумме: " + amount + " руб.");
                System.out.println("Баланс счета " + "\"" + nameOfAccount + "\"" + " составляет " + balance + " руб.");
                return true;
            }
        }
        System.out.println("Перевод невозможно осуществить");
        return false;
    }

    @Override
    public boolean accept(int money) {
        if (add(money)) {
            System.out.println("Примечание: приняты деньги в размере " + money + " руб. на " + "\"" + nameOfAccount + "\"");
            return true;
        }
        return false;
    }
}