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
}


