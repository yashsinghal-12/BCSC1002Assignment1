/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

public class Book {
    // Components of a Definition Class:
    // 1. private fields.
    // 2. Getter methods for private fields.
    // 3. Setter methods for private fields.
    // 4. Constructor methods for initializing the attributes of the object.
    // 5. The toString() method.
    // 6. The equals() and the hashCode() method

    private String bookName;
    private String authorName;
    private String iSBNumber;

    // The Constructor Method : Used to initialize the attributes of an object.
    // public <non-static> <no-return type> <SameAsTheClassName> () {}

    // The Java compiler creates a no-parameter constructor for us automatically.
    // default constructor

    // we can create two types of constructors:
    // 1. Non-Parameterized Constructors : The constructor has no parameters.

    public Book() {
        this.bookName = "";
        this.authorName = "";
        this.iSBNumber = "";
    }
    // 2. Parameterized Constructors : They have some parameters.

    public Book(String bookName, String authorName, String iSBNumber) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.iSBNumber = iSBNumber;
    }

    public Book(String bookName) {
        this.bookName = bookName;
        this.authorName = "Rusking Bond";
        this.iSBNumber = "0987654321";
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getiSBNumber() {
        return iSBNumber;
    }

    public void setiSBNumber(String iSBNumber) {
        this.iSBNumber = iSBNumber;
    }

    // the toString() method : used to convert an object to String
    public String toString() {
        return String.format(
                "Book Name: %s/n, Author Name: %s/n, ISBN Number: %s",
                getBookName(), getAuthorName(), getiSBNumber()
        );
    }
    // The equals() and the hashCode() methods.
    // The Object class in Java is the super class (parent) of all other classes.
    // When we create any class in Java, it automatically inherits the Object class.

    // book.equals(book1)
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
