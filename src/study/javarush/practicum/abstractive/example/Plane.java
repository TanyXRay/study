package study.javarush.practicum.abstractive.example;

public class Plane extends Transport {
    public Plane() {
        super(600);
    }

    @Override
    public void transfer(String name, String from, String to) {
        System.out.println(name + " полетел из " + from + " в " + to);
        spendFuel(200);
    }
}
