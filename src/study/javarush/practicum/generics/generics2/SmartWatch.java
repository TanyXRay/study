package study.javarush.practicum.generics.generics2;

public class SmartWatch extends Device{
    private boolean isColored;

    public SmartWatch(String title, String vendor, int price, boolean isColored) {
        super(title, vendor, price);
        this.isColored = isColored;
    }

    public boolean isColored() {
        return isColored;
    }
}
