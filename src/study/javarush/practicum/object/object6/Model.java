package study.javarush.practicum.object.object6;

public class Model extends Human {
    private int height;
    private int weight;
    private String hairsColor;

    public Model(String sex, String name, int age, int height, int weight, String hairsColor) {
        super(sex, name, age);
        this.height = height;
        this.weight = weight;
        this.hairsColor = hairsColor;
    }

    public void takeToTheModelingBusiness(Model model) {
        if (this.height <= 170 || this.height >= 210) {
            System.out.println("Модель не принята в модельный бизнес");
        } else if (this.weight <= 80 && this.weight >= 43) {
            System.out.println("Модель принята в модельный бизнес");
        } else {
            System.out.println("Модель не принята в модельный бизнес");
        }
    }
}
