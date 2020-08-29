/*  Created by IntelliJ IDEA.
 *  User: Vinay Yadav
 *  Date: 22/08/20
 *  Time: 1:16 PM
 *  File Name : Library.java
 * */
package book;

import java.util.Objects;

public class Book {
    private int isbn;
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
    public int getIsbn() {
        return isbn;
    }
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public Book(String authorName) {
        this.authorName = authorName;
    }
    public Book(String authorName, String bookName, int isbn) {
        this.authorName = authorName;
        this.bookName = bookName;
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return getIsbn() == book.getIsbn() &&
                Objects.equals(getBookName(), book.getBookName()) &&
                Objects.equals(getAuthorName(), book.getAuthorName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIsbn(), getBookName(), getAuthorName());
    }
}




