/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;

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

    /**
     * This method prints all the books in the allIssuedBook (store array).
     */
    public void allIssuedBook() {
        for (Book book : store) {
            System.out.println(book);
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getUniversityRollNumber() {
        return universityRollNumber;
    }

    public void setUniversityRollNumber(long universityRollNumber) {
        this.universityRollNumber = universityRollNumber;
    }

    public int getNumberOfBookIssued() {
        return numberOfBookIssued;
    }

    public void setNumberOfBookIssued(int numberOfBookIssued) {
        this.numberOfBookIssued = numberOfBookIssued;
    }

    public Book[] getStore() {
        return store.clone();
    }

    public void setStore(Book[] store) {
        this.store = store;
    }

    // the toString() method : used to convert an object to String
    public String toString() {
        return String.format(
                "First Name: %s/n, Middle Name: %s/n, last Name: %s, University Roll Number: %d, Number Of Book Issued: %d, Name of the Books issued by Student: %s",
                getFirstName(), getMiddleName(), getLastName(), getUniversityRollNumber(), getNumberOfBookIssued(), Arrays.toString(getStore())
        );
    }
    // The equals() and the hashCode() methods.
    // The Object class in Java is the super class (parent) of all other classes.
    // When we create any class in Java, it automatically inherits the Object class.

    // book.equals(book1)
    @Override
    public boolean equals(Object o) {
        if (this == o) { // book == book1
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        Student book = (Student) o;
        return this.getFirstName().equals(book.getFirstName()) &&
                this.getMiddleName().equals(book.getMiddleName()) &&
                this.getLastName().equals(book.getLastName()) &&
                this.getUniversityRollNumber() == book.getUniversityRollNumber() &&
                this.getNumberOfBookIssued() == book.getNumberOfBookIssued() &&
                Arrays.equals(getStore(), book.getStore());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getMiddleName(), getLastName(), getUniversityRollNumber(), getNumberOfBookIssued(), Arrays.hashCode(getStore()));
    }
}











