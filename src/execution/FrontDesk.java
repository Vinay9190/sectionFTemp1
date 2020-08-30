/*  Created by IntelliJ IDEA.
 *  User: Vinay Yadav
 *  File Name : FrontDesk.java
 * */
package execution;

import book.Book;

import java.util.Scanner;

public class FrontDesk {
    public static final int ISSUE_NEW_BOOK = 1;
    public static final int RETURN_PREVIOUS_ISSUE_BOOK = 2;
    public static final int SHOW_ALL_ISSUE_BOOK = 3;
    public static final int EXIT = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentInput;
        {
            System.out.println("-=-=-=-=- " + " Welcome to Front Desk " + "-=-=-=-=- ");
            System.out.println("How may I help you today");
            System.out.println("1. Issue a New Book for Me");
            System.out.println("2. Return a previously issues book for me");
            System.out.println("3. Show me all issues book");
            System.out.println("4. Exit ");
            studentInput = scanner.nextInt();
            switch (studentInput) {
                case ISSUE_NEW_BOOK:
                    scanner.nextLine();
                    System.out.println(" Enter the Name of Book you want to issue ");

                case RETURN_PREVIOUS_ISSUE_BOOK:
                    System.out.println("Enter the Name of Book to return previous issue book");
                case SHOW_ALL_ISSUE_BOOK:
                    System.out.println("Show all books previously issue by use");
                case EXIT:
            }
        }
    }
}



