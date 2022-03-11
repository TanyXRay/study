package inheritance;

public class Employee {
    public String placeOfWork = "кабинет приема посетителей";
    private int age;

    public void setAge(int age) {
        if (age <= 0 || age > 50) {
            System.out.println("не верно указан возраст");
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    public void work() {
        System.out.println("работа моя заключается в выполнении различных поручений от начальства");
    }

    public void eat() {
        System.out.println("я люблю хорошо покушать в служебной столовой");
    }

    public void showPlaceOfWork() {
        System.out.println("мое местонахождение в компании - это " + placeOfWork);
    }
}
