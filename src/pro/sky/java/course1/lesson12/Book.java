package pro.sky.java.course1.lesson12;

public class Book {
    private String nameBook;
    private String author;
    private int year;

    public Book(String nameBook, String author, int year) {
        this.nameBook = nameBook;
        this.author = author;
        this.year = year;
    }
    public String getNameBook() {
        return nameBook;
    }
    public String getAuthor() {
        return author;
    }
    public int getYear() {
        return year;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public static void display(Book book){
        System.out.println("\nНазвание: " + book.getNameBook());
        System.out.println("Автор книги : " + book.getAuthor());
        System.out.println("Год выпуска книги : " + book.getYear());
    }
}
