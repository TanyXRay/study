package study.javarush.practicum.inheritance.accounts;

public class CreditAccount extends Account {

    public CreditAccount(String nameOwner, long balance, String nameOfAccount) {
        super(nameOwner, balance, nameOfAccount);
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
        if (balance - amount > -1_000_000) {
            System.out.println("Операция по оплате успешна с кредитного счета");
            balance -= amount;
            System.out.println("Баланс счета " + "\"" + nameOfAccount + "\"" + " составляет " + balance + " руб.");
            return true;
        }
        System.out.println("Операция по оплате не успешна с кредитного счета");
        return false;
    }

    /**
     * Кредитный счёт не может быть положительным
     *
     * @param amount
     * @return
     */
    @Override
    public boolean add(long amount) {
        if (balance + amount > 0) {
            System.out.println("Невозможно пополнить кредитный счет!");
            return false;
        } else {
            balance += amount;
            System.out.println("Баланс счета " + "\"" + nameOfAccount + "\"" + " составляет " + balance + " руб.");
            return true;
        }
    }

    @Override
    public boolean transfer(Account accountTo, int amount) {
        if (balance - amount < 0 && (balance - amount > -1_000_000)) {
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
    public boolean accept(int money){
        if (add(money)) {
            System.out.println("Примечание: приняты деньги в размере " + money + " руб. на " + "\"" + nameOfAccount + "\"");
            return true;
        }
        return false;
    }
}