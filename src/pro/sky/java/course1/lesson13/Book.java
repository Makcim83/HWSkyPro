package pro.sky.java.course1.lesson13;

import java.util.Objects;

public class Book {
    private String nameBook;
    private final Author author;
    private int year;

    //в конструкторе агрегация, т.к. один автор может быть автором нескольких книг
    public Book(String nameBook, Author author, int year) {
        this.nameBook = nameBook;
        this.author = author;
        this.year = year;
    }

    public String getNameBook() {
        return nameBook;
    }
    public Author getAuthor() {
        return author;
    }
    public int getYear() {
        return year;
    }

    public void setNameBook() {
        this.nameBook = nameBook;
    }
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "\nНазвание : " + nameBook
                + "\nАвтор : " + author
                + "\nГод издания : " + year;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && nameBook.equals(book.nameBook) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, author, year);
    }
}
