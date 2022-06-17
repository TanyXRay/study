package study.javarush.practicum.object.object1;

import java.time.LocalDate;

public class Author {
    public String name;
    public String surname;
    public int numberOfBooksWritten;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.numberOfBooksWritten = 0;
    }

    public Book newBook(String title) {
        return new Book(title, this, LocalDate.now().getYear());
    }

    public String toString() {
        return "\nИмя: " + name + ";" + "\nФамилия: " + surname + ";" + "\nКол-во выпущенных книг " + numberOfBooksWritten;
    }
}
