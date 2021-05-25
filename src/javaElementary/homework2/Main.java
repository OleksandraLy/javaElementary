package javaElementary.homework2;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Thirteens legend", "white", 290, 2014, 15);
        Book book2 = new Book("Matilda", "purple", 170, 1998, 10);
        Book book3 = new Book("Neverwhere", "green", 370, 2003, 0);

        Book[] books = {book1, book2, book3};

        Arrays.sort(books, new CompareByIllustrations());
        Arrays.sort(books, new CompareByPages());
        Arrays.sort(books, new CompareByTitle());

    }
}
