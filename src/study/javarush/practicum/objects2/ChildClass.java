package study.javarush.practicum.objects2;

public class ChildClass extends ParentClass {
    public String c = Main.printText("Hello childClass field c");
    public String d = Main.printText("Hello childClass field d");

    public ChildClass() {
        Main.printText("childClass constructor");
    }
}

