/*  Created by IntelliJ IDEA.
 *  User: Vinay Yadav
 *  File Name : Book.java
 * */
package book;

import java.util.Objects;

public class Book {
    private int thirteenDigitISBNBookNumber;
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
    public int getThirteenDigitISBNBookNumber() {
        return thirteenDigitISBNBookNumber;
    }
    public void setThirteenDigitISBNBookNumber(int thirteenDigitISBNBookNumber) {
        this.thirteenDigitISBNBookNumber = thirteenDigitISBNBookNumber;
    }

    public Book(String authorName) {
        this.authorName = authorName;
    }
    public Book(String authorName, String bookName, int thirteenDigitISBNBookNumber) {
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




