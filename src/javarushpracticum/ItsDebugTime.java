package javarushpracticum;

public class ItsDebugTime {
    public static int result = 105;  // смотрим как работает дебаг

    public static void main(String[] args) {
     byte correction = Byte.MAX_VALUE;
     for(double fahrenheit = -459.67; fahrenheit < 451; fahrenheit += 40){
         correction *= fahrenheit;
         System.out.println(correction);
     }
    }
}
