package study.javarush.practicum.generics.generics2;

public class Device extends Product{
    private String vendor; // продавец

    public Device(String title,String vendor, int price) {
        super(title, price);
        this.vendor = vendor;
    }

    public String getVendor() {
        return vendor;
    }
}
