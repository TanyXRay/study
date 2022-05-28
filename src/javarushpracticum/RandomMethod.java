package javarushpracticum;

import java.util.Random;

public class RandomMethod {
    public static void main(String[] args) {
        RandomMethod.getRandomFloat();
        RandomMethod.getRandomInt();
    }
    public static void getRandomFloat(){
        Random r = new Random();
        float f = r.nextFloat();
        System.out.println(f); // создаем рандомные числа типа float
    }
    public static void getRandomInt(){
        Random random = new Random();
        int i = random.nextInt();
        System.out.println(i); // создаем рандомные числа типа int
    }
}
