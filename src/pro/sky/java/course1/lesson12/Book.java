package pro.sky.java.course1.lesson12;

public class Book {
    private String author;
    private int year;

    public Book(String author, int year) {
        this.author = author;
        this.year = year;
    }
    public String getAuthor() {
        return author;
    }
    public int getYear() {
        return year;
    }
    public void setAutor(String author) {
        this.author = author;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public static void display(Book book){
        System.out.println("\nАвтор книги " + book.getAuthor());
        System.out.println("Год выпуска книги " + book.getYear());
    }
}
