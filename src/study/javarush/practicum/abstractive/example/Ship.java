package study.javarush.practicum.abstractive.example;

public class Ship extends Transport {

    public Ship() {
        super(100);
    }

    @Override
    public void transfer(String name, String from, String to) {
        System.out.println(name + " поплыл из " + from + " в " + to);
        spendFuel(70);
    }
}

