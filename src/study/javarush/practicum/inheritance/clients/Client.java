package study.javarush.practicum.inheritance.clients;

import study.javarush.practicum.inheritance.accounts.Account;

public class Client {
    private String name;
    private int maxAccount;

    Account[] accounts;

    public Client(String name, int maxAccount) {
        this.name = name;
        this.maxAccount = maxAccount;
        accounts = new Account[maxAccount];
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
            if (account.pay(amount)) {
                return true;
            }
        }
        return false;
    }
}
