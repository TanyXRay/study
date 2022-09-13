package study.javarush.practicum.generics.generics2;

public class Mobile extends Device{
    private int weight;

    public Mobile(String title, String vendor, int price, int weight) {
        super(title, vendor, price);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
}
