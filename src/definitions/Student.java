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

    // The Constructor Method : Used to initialize the attributes of an object.
    // public <non-static> <no-return type> <SameAsTheClassName> () {}

    // The Java compiler creates a no-parameter constructor for us automatically.
    // default constructor

    // we can create two types of constructors:
    // 1. Non-Parameterized Constructors : The constructor has no parameters.
    public Student() {
        this.firstName = "";
        this.middleName = "";
        this.lastName = "";
        this.universityRollNumber = 0;
        this.numberOfBookIssued = 0;
        this.store = new Book[0];
    }
    // 2. Parameterized Constructors : They have some parameters.

    public Student(String firstName, String middleName, String lastName, Long universityRollNumber, int numberOfBookIssued,) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.universityRollNumber = universityRollNumber;
        this.numberOfBookIssued = numberOfBookIssued;
    }




