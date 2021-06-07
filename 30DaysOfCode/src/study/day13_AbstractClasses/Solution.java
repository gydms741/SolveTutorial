package study.day13_AbstractClasses;

import java.util.Scanner;

public class Solution {

    abstract class Book{
        String title;
        String author;

        Book(String title, String author){
            this.title = title;
            this.author = author;
        }

        abstract void display();
    }

    class MyBook extends Book{
        int price;

        MyBook(String title, String author, int price){
            super(title, author);
            this.price = price;
        }

        @Override
        void display() {
            System.out.println("Title: "+title);
            System.out.println("Author: "+author);
            System.out.println("Price: "+price);
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String title = scan.nextLine();
        String author = scan.nextLine();
        int price = scan.nextInt();
        scan.close();

        //Book book = new MyBook(title,author,price);
        //book.display();
    }
}
