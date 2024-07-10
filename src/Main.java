import java.awt.print.Book;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        TreeSet <Books> books= new TreeSet<>(new OrderByPagesNum());
        books.add(new Books("Oblomov",700));
        books.add(new Books("Crime and Punishment",950));
        books.add(new Books("Pride and Prejudice",450));
        books.add(new Books("The Hidden Life of Trees",300));
        books.add(new Books("Snow",429));

        System.out.println("Books Ordered by pages number:");
        for (Books b:books){
            System.out.println(b.getName());
        }
        System.out.println();

        TreeSet <Books> bookss= new TreeSet<>(new OrderbyLetter());
        bookss.add(new Books("Oblomov",700));
        bookss.add(new Books("Crime and Punishment",950));
        bookss.add(new Books("Pride and Prejudice",450));
        bookss.add(new Books("The Hidden Life of Trees",300));
        bookss.add(new Books("Snow",429));

        System.out.println("Books Ordered by first letter:");

        for (Books b:bookss){
            System.out.println(b.getName());
        }


    }
}