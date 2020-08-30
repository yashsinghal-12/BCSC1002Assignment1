/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Book;
import definitions.Library;
import definitions.Student;

import java.util.Scanner;


public class FrontDesk {
    private static final int NEW_BOOK = 1;
    private static final int RETURN_BOOK = 2;
    private static final int ALL_ISSUES_BOOK = 5;
    private static final int EXIT = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentInput;
        Student myStudent = new Student();
        Book myBook = new Book();
        Library myLibrary = new Library();
        do {
            System.out.println("--=-=-WELCOME TO THE FRONT DESK-=-=--");
            System.out.println("1. Issue a new book for me: ");
            System.out.println("2. Return a previously issues book for me: ");
            System.out.println("3. Show me all my issues book: ");
            System.out.println("4. Exit: ");
            studentInput = scanner.nextInt();
            String firstName;
            String middleName;
            String lastName;
            long universityRollNumber;
            String bookName;
            String authorName;
            String iSBNBook;
            switch (studentInput) {
                case NEW_BOOK:
                    System.out.println("Enter your first name: ");
                    scanner.nextLine();
                    firstName = scanner.nextLine();
                    myStudent.setFirstName(firstName);
                    System.out.println("Enter your middle Name: ");
                    middleName = scanner.nextLine();
                    myStudent.setMiddleName(middleName);
                    System.out.println("Enter your Last Name: ");
                    lastName = scanner.nextLine();
                    myStudent.setLastName(lastName);
                    System.out.println("Enter your University Roll No.: ");
                    universityRollNumber = scanner.nextLong();
                    myStudent.setUniversityRollNumber(universityRollNumber);
                    System.out.println("Enter the name of the book you wan to issue: ");
                    System.out.println("Enter Book Name: ");
                    scanner.nextLine();
                    bookName = scanner.nextLine();
                    myBook.setBookName(bookName);
                    System.out.println("Enter Author Name: ");
                    authorName = scanner.nextLine();
                    myBook.setAuthorName(authorName);
                    System.out.println("Enter ISBN Of Book: ");
                    iSBNBook = scanner.nextLine();
                    myBook.setiSBNumber(iSBNBook);
                    myLibrary.doCheckout(bookName);
                    myStudent.addBook(bookName);
                    break;
                case RETURN_BOOK:
                    System.out.println("Enter your first name: ");
                    scanner.nextLine();
                    firstName = scanner.nextLine();
                    myStudent.setFirstName(firstName);
                    System.out.println("Enter your middle Name: ");
                    middleName = scanner.nextLine();
                    myStudent.setMiddleName(middleName);
                    System.out.println("Enter your Last Name: ");
                    lastName = scanner.nextLine();
                    myStudent.setLastName(lastName);
                    System.out.println("Enter your University Roll No.: ");
                    universityRollNumber = scanner.nextLong();
                    myStudent.setUniversityRollNumber(universityRollNumber);
                    System.out.println("Enter the name of the book you want to return: ");
                    scanner.nextLine();
                    bookName = scanner.nextLine();
                    myLibrary.doReturn(bookName);
                    break;

                case ALL_ISSUES_BOOK:
                    System.out.println("Enter your first name: ");
                    scanner.nextLine();
                    firstName = scanner.nextLine();
                    myStudent.setFirstName(firstName);
                    System.out.println("Enter your middle Name: ");
                    middleName = scanner.nextLine();
                    myStudent.setMiddleName(middleName);
                    System.out.println("Enter your Last Name: ");
                    lastName = scanner.nextLine();
                    myStudent.setLastName(lastName);
                    System.out.println("Enter your University Roll No.: ");
                    universityRollNumber = scanner.nextLong();
                    myStudent.setUniversityRollNumber(universityRollNumber);
                    myStudent.allIssuedBook();
                    break;
                default:
            }
        } while (studentInput != EXIT);
        scanner.close();
    }
}




