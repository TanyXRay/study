package study.javarush.practicum.inheritance.clients;

import study.javarush.practicum.inheritance.accounts.Account;
import study.javarush.practicum.inheritance.accept.MoneyTarget;

public class Client implements MoneyTarget {
    private String name;
    private int maxAccount;

    private Account[] accounts;

    public Client(String name, int maxAccount) {
        this.name = name;
        this.maxAccount = maxAccount;
        this.accounts = new Account[maxAccount];
    }

    public void addNewAccount(Account account) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = account;
                return;
            }
        }
        System.out.println("количество счетов превышено!");
    }

    public boolean pay(int amount) {
        for (Account account : accounts) {
            if (account != null) {
                if (account.pay(amount))
                    return true;
            }
        }
        System.out.println("Ни один счет не может покрыть расходы на покупку!");
        return false;
    }

    @Override
    public boolean accept(int money) {
        for (Account account : accounts) {
            if (account != null) {
                if (account.accept(money))
                    return true;
            }
        }
        return false;
    }
}
