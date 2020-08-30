/*  Created by IntelliJ IDEA.
 *  User: Vinay Yadav
 *  File Name : Library.java
 * */

package book;

import java.util.Arrays;
import book.Student;
import book.Book;

public class Library {
    private Book[] availableBook;

    public Library() {
        this.availableBook = new Book[5];
        for (int index = 0; index < availableBook.length; index++) {
            availableBook[index] = new Book(" availableBooks "+ (index+ 1));
        }
    }

    public Library(Book[] avilableBooks) {
        this.availableBook = availableBook;
    }
    public Book[] getAvailableBook() {
        return availableBook;
    }
    public void setAvailableBook() {
        this.availableBook = availableBook;
    }

    @Override
    public String toString() {
        return "Library{" +
                "availableBook=" + Arrays.toString(availableBook) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Arrays.equals(getAvailableBook(), library.getAvailableBook());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getAvailableBook());
    }
}

