package study.javarush.practicum.generics.generics2;

public class Main {

    public static void main(String[] args) {
        Product product = new Mobile("Name", "Nikole", 25, 1);

        Shop <Device> deviceShop = new Shop <>();
        deviceShop.add(new Mobile("Title", "Nelly", 30, 1));

        Device device = deviceShop.getRandomItems();
    }
}
