package study.javarush.practicum.tasks.object;

public class Book {
    public String title;
    public String text = "";
    public Author author;
    public int yearOfWriting;
    public int rating = 3;

    public Book(String title, Author author, int yearOfWriting) {
        this.title = title;
        this.yearOfWriting = yearOfWriting;
        this.author = author;
        author.numberOfBooksWritten++;
    }

    public void up() {
        if (rating < 5) {
            rating++;
        }
    }

    public void down() {
        if (rating > 5) {
            rating--;
        }
    }

    public void append(String moreText) {
        text += moreText;
    }

    public String toString() {
        return "\nНазвание: " + title + ";" + "\nОписание: " + text + ";" + "\nАвтор: " + author + ";" + "\nГод выпуска: " + yearOfWriting + ";" + "\nРейтинг: " + rating;
    }
}
