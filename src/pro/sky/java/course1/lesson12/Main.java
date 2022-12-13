package pro.sky.java.course1.lesson12;

public class Main {
    public static void main(String[] args) {
        Author skyPro = new Author("SkyPro", "Java15");
        Author noAuthor = new Author("moName", "noFamily");
        Book lesson12 = new Book(skyPro.getName(), 12);
        Book album = new Book(noAuthor.getName(), 10);

        display(lesson12);
        display(album);

    }
    public static void display(Book book){
        System.out.println("book.getAuthor() = " + book.getAuthor());
        System.out.println("book.getAmountSheets() = " + book.getAmountSheets());
    }
}