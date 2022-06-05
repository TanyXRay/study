package study.javarush.practicum.string;

/**
 * Проверка URL-адреса.
 */

public class StringClass4 {

    public static void main(String[] args) {
        // создаем массив строк с указаными данными в контейнере
        String[] urls = {"https://javarush.ru", "https://google.com", "http://wikipedia.org", "facebook.com", "https://instagram", "codegym.cc"};
        for (String url : urls) { // при помощи цикла for-each пробегаемся по массиву строк
            String protocol = checkProtocol(url); // проверяем массив строк на нижеуказанные условия в методах checkProtocol и checkDomain,
            String domain = checkDomain(url); // помещая в параметры данных методов ссылку на массив строк

            System.out.println("У URL-адреса - " + url + ", сетевой протокол - " + protocol + ", домен - " + domain); // выводим в консоль текст с результатами
        }
    }

    public static String checkProtocol(String url) {
        if (url.startsWith("https")) { // проверяем  сетевой протокол и возвращаем результат проверки — строку название сетевого протокола
            return "https";
        } else if (url.startsWith("http")) {
            return "http";
        } else {
            return "неизвестный";
        }
    }

    public static String checkDomain(String url) {
        if (url.endsWith("com")) { // проверяем домен и возвращаем результат проверки — строку название домена
            return "com";
        } else if (url.endsWith("net")) {
            return "net";
        } else if (url.endsWith("org")) {
            return "org";
        } else if (url.endsWith("ru")) {
            return "ru";
        } else {
            return "неизвестный";
        }
    }
}

