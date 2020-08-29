/*  Created by IntelliJ IDEA.
 *  User: Vinay Yadav
 *  Date: 22/08/20
 *  Time: 1:16 PM
 *  File Name : Library.java
 * */

package book;

import java.util.Arrays;

public class Library {
    Library[] availableBook;

    Library(Library[] avilableBooks) {
        this.availableBook = availableBook;
    }
    public Library[] getAvailableBook() {
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
        if (!(o instanceof Library)) return false;
        Library library = (Library) o;
        return Arrays.equals(getAvailableBook(), library.getAvailableBook());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getAvailableBook());
    }
}
