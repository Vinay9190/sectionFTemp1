/*  Created by IntelliJ IDEA.
 *  User: Vinay Yadav
 *  File Name : Student.java
 * */
package book;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    private String studentFirstName, studentMiddleName, studentLastName;
    private long universityRollNo;
    private Book[] nameOfIssuedBook;
    private int noOfBooksStudentIssued;

    public Student() {
        studentFirstName = "Vinay";
        studentMiddleName = "Kumar";
        studentLastName = "Yadav";
        universityRollNo = 191500906;
        this.nameOfIssuedBook = new Book[3];
        noOfBooksStudentIssued = 3;
        for (int i = 0; i < nameOfIssuedBook.length; i++) {
            nameOfIssuedBook[i] = new Book("nameofIssuedBook " + (i + 1));
        }
    }

    public Student(String studentFirstName, String studentMiddleName, String studentLastName, long universityRollNo, Book[] nameOfIssuedBook, int noOfBooksStudentIssued) {
        this.studentFirstName = studentFirstName;
        this.studentMiddleName = studentMiddleName;
        this.studentLastName = studentLastName;
        this.universityRollNo = universityRollNo;
        this.nameOfIssuedBook = new Book[3];
        this.noOfBooksStudentIssued = noOfBooksStudentIssued;
        for (int index = 0; index < nameOfIssuedBook.length; index++) {
            nameOfIssuedBook[index] = new Book("nameOfIssuedBook " + (index + 1));
        }
    }


    public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentName() {
        this.studentFirstName = studentFirstName;
    }

    public String getStudentMiddleName() {
        return studentMiddleName;
    }

    public void setStudentMiddleName() {
        this.studentMiddleName = studentMiddleName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName() {
        this.studentLastName = studentLastName;
    }

    public long getUniversityRollNo() {
        return universityRollNo;
    }

    public void setUniversityRollNo() {
        this.universityRollNo = universityRollNo;
    }

    public int getNoOfBookStudentIssued() {
        return noOfBooksStudentIssued;
    }

    public void setNoOfBooksStudentIssued() {
        this.noOfBooksStudentIssued = noOfBooksStudentIssued;
    }

    public Book[] getNameOfBooksStudentIssed() {
        return this.nameOfIssuedBook;
    }

    public void setNameOfBooksStudentIssued() {
        this.nameOfIssuedBook = nameOfIssuedBook;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentFirstName='" + studentFirstName + '\'' +
                ", studentMiddleName='" + studentMiddleName + '\'' +
                ", studentLastName='" + studentLastName + '\'' +
                ", universityRollNo=" + universityRollNo +
                ", nameOfIssuedBook=" + Arrays.toString(nameOfIssuedBook) +
                ", noOfBooksStudentIssued=" + noOfBooksStudentIssued +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return getUniversityRollNo() == student.getUniversityRollNo() &&
                noOfBooksStudentIssued == student.noOfBooksStudentIssued &&
                Objects.equals(getStudentFirstName(), student.getStudentFirstName()) &&
                Objects.equals(getStudentMiddleName(), student.getStudentMiddleName()) &&
                Objects.equals(getStudentLastName(), student.getStudentLastName()) &&
                Arrays.equals(nameOfIssuedBook, student.nameOfIssuedBook);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getStudentFirstName(), getStudentMiddleName(), getStudentLastName(), getUniversityRollNo(), noOfBooksStudentIssued);
        result = 31 * result + Arrays.hashCode(nameOfIssuedBook);
        return result;
    }
}

