package study.javarush.practicum.objects2;

public class ParentClass {
    public String a = Main.printText("Hello parentClass field a");
    public String b = Main.printText("Hello parentClass field b");

    public ParentClass() {
        Main.printText("parentClass constructor");
        System.out.println();
    }
}
