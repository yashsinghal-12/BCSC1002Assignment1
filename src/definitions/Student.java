/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

public class Student {
    private String firstName;
    private String middleName;
    private String lastName;
    private long universityRollNumber;
    private int numberOfBookIssued;
    private Book[] store;

    public Student() {
        this.store = new Book[5];
        for (int bookIndex = 0; bookIndex < store.length; bookIndex++) {
            store[bookIndex] = new Book("Book " + (bookIndex + 1));
        }
    }

    public Student(Book[] store) {
        this.store = store;
    }

    /**
     * This method will add a new Book to Student Account (store array).
     *
     * @param name The name of the new Book that you want to add to the Library.
     */
    public void addBook(String name) {
        System.out.println(name + " is now added to your Account.");
    }


}









