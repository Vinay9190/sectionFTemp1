/*  Created by IntelliJ IDEA.
 *  User: Vinay Yadav
 *  File Name : Book.java
 * */
package book;

import java.util.Objects;

public class Book {
    private String thirteenDigitISBNBookNumber;
    private String bookName;
    private String authorName;



    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public String getAuthorName() {
        return bookName;
    }
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
    public String getThirteenDigitISBNBookNumber() {
        return thirteenDigitISBNBookNumber;
    }
    public void setThirteenDigitISBNBookNumber(String thirteenDigitISBNBookNumber) {
        this.thirteenDigitISBNBookNumber = thirteenDigitISBNBookNumber;
    }
    public Book(String authorName) {
        this.authorName = "Ravi sankar";
        this.bookName = "Mahabharat";
        this.thirteenDigitISBNBookNumber = "890OPI987P43P";
    }
    public Book(String authorName, String bookName, String thirteenDigitISBNBookNumber) {
        this.authorName = authorName;
        this.bookName = bookName;
        this.thirteenDigitISBNBookNumber = thirteenDigitISBNBookNumber;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + thirteenDigitISBNBookNumber +
                ", bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return getThirteenDigitISBNBookNumber() == book.getThirteenDigitISBNBookNumber() &&
                Objects.equals(getBookName(), book.getBookName()) &&
                Objects.equals(getAuthorName(), book.getAuthorName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getThirteenDigitISBNBookNumber(), getBookName(), getAuthorName());
    }
}




