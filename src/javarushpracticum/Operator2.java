package javarushpracticum;
/*
необходимо поменять операторы так, чтобы получилось число 20
 */
public class Operator2 {
    public static void main(String[] args) {
        int a = 3;
        int b = ++a + (a-- * ++a);

        System.out.println(b);
    }
}
