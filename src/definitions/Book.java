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


}
