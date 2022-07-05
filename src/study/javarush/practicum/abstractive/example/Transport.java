package study.javarush.practicum.abstractive.example;

public abstract class Transport implements Transferer, Billable {
    private int fuel;

    public Transport(int fuel) {
        this.fuel = fuel;
    }

    public void spendFuel(int fuel) {
        this.fuel -= fuel;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Уплачено за проезд в размере " + amount);
    }

    @Override
    public void transfer(String name, String from, String to) {
    }
}
