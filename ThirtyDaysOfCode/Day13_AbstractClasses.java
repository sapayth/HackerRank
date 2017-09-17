/*
 * Sapayth Hossain
 */
package ThirtyDaysOfCode;

import java.util.Scanner;

/*
 * @author sapaythhossain
 */
public class Day13_AbstractClasses {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book1 book = new MyBook(title, author, price);
        book.display();
    }
}

abstract class Book1 {

    String title;
    String author;

    Book1(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void display();
}
// Declare your class here. Do not use the 'public' access modifier.

class MyBook extends Book1 {

    // Declare the price instance variable
    int price;

    /**
     * Class Constructor
     *
     * @param title The book's title.
     * @param author The book's author.
     * @param price The book's price.
    *
     */
    // Write your constructor here
    public MyBook(String title, String author, int price) {
        super(title, author);
        this.price = price;
    }

    /**
     * Method Name: display
     *
     * Print the title, author, and price in the specified format.
    *
     */
    // Write your method here
    @Override
    void display() {
        System.out.printf("Title: %s%n"
                + "Author: %s%n"
                + "Price: %d%n",
                title, author, price);
    }

}// End class
