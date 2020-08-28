/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

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
}


