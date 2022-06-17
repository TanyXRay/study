package study.javarush.practicum.object.object1;

/**
 * Выполнение задачи 1 и 2 по теме "Структура класса".
 */

public class Main {

    public static void main(String[] args) {
        Author author1 = new Author("Андрей", "Дьяков");
        Book book1 = new Book("Метро 2033: К свету", author1, 2010);
        book1.up();
        book1.down();
        book1.append("История начинается с того, что группа вооруженных бойцов идет по туннелю");
        System.out.println(book1);

        Author author2 = new Author("Анна", "Калинкина");
        Book book2 = new Book("Метро 2033: Царство крыс", author2, 2012);
        book2.up();
        book2.down();
        book2.append("По сюжету, жители метро постъядерного Санкт-Петербурга собирают экспедицию в Кронштадт");
        System.out.println(book2);

        Book book3 = author1.newBook("Метро 2033: Во мрак");
        book3.up();
        book3.down();
        book3.append("Читателей ждет новая встреча с миром постъядерного Питера и его обитателями");
        System.out.println(book3); // обращаемся к нашему адресу для получения информации
    }
}
