package pro.sky.java.course1.lesson12;

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
    public static void display(Book book){
        System.out.println("\nНазвание: " + book.getNameBook());
        System.out.printf("Автор книги : %s %s", book.getAuthor().getName(), book.getAuthor().getFamily());
        System.out.println("\nГод выпуска книги : " + book.getYear());
    }
}
