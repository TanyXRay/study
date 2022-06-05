package study.homework.inheritance;

public class Lawyer extends Employee { // класс Lawyer наследуется от класса Employee с помощью extends
    private String name;
    private int age;
    public String placeOfWork = "офис юриста";

    public void setAge(int age) {
        if (age < 0 || age > 70) {
            System.out.println("не корректно указан возраст");
        } else {
            this.age = age;
            System.out.println("мне " + age + " лет");
        }
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("Вы ввели некорректное имя, попробуйте еще раз!");
        } else {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public void work() {
        System.out.println("моя работа заключается в \"перебирании\" бумажек, ну еще и заключение договоров");
    }

    public void eat() {
        System.out.println("люблю перекусить в столовой вместе с коллегой из приемной ");
    }

    public void showPlaceOfWork() {
        System.out.println("мое местонахождение в компании - это " + placeOfWork);
    }
}
