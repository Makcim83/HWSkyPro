package pro.sky.java.course1.lesson12;

public class Main {
    public static void main(String[] args) {
        Author pushkin = new Author("Александр", "Пушкин");
        Author lermontov = new Author("Михаил", "Лермонтов");
        Book pikovayaDama = new Book("Пиковая дама",pushkin, 2021);
        Book borodino = new Book("Бородино", lermontov, 1965);

        Book.display(pikovayaDama);
        Book.display(borodino);

        System.out.println("\nКнига была переиздана:");
        borodino.setYear(2022);
        Book.display(borodino);
    }
}