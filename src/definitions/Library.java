/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;

public class Library {
    private Book[] store;

    public Library() {
        this.store = new Book[5];
        for (int bookIndex = 0; bookIndex < store.length; bookIndex++) {
            store[bookIndex] = new Book("Book " + (bookIndex + 1));
        }
    }

    public Library(Book[] store) {
        this.store = store;
    }

    /**
     * This method will add a new Book to our Library (store array).
     *
     * @param name The name of the new Book that you want to add to the Library.
     */
    public void addBook(String name) {
        System.out.println(name + " is now added to the Library.");
    }

    /**
     * This method will help the client/student to rent a Book.
     *
     * @param name The name of the Book that the client/student wants to rent.
     */
    public void doCheckout(String name) {
        System.out.println("Thank you for renting \"" + name + "\".");
    }

    /**
     * This method will return a rented Book to the Library.
     *
     * @param name The name of the Book that the client/student wants to return.
     */
    public void doReturn(String name) {
        System.out.println(
                "Thank you for returning \"" + name + "\". Hope you liked it."
        );
    }

    /**
     * This method sets a new authorName of a Book.
     *
     * @param name       The name of the Book whose author you want to set.
     * @param authorName The new authorName of the Book.
     */
    public void receiveAuthorName(String name, String authorName) {
        System.out.println(
                "The authorName of \"" + name + "\" is now set to " + authorName + "."
        );
    }

    /**
     * This method prints all the books in the inventory (store array).
     */
    public void listInventory() {
        for (Book book : store) {
            System.out.println(book);
        }
    }

    public Book[] getStore() {
        return store.clone();
    }

    public void setStore(Book[] store) {
        this.store = store;
    }

    @Override
    public String toString() {
        return Arrays.toString(store);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Library that = (Library) o;
        return Arrays.equals(getStore(), that.getStore());
    }
}



