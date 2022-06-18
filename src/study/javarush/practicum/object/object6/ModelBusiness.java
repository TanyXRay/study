package study.javarush.practicum.object.object6;

/**
 * Работа с объектами и их конструкторами.
 * Пример использования конструктора при наследовании
 */

public class ModelBusiness {

    public static void main(String[] args) {
        Model model = new Model("men", "Jack", 26, 185, 40, "black");
        model.takeToTheModelingBusiness(model);
    }
}
