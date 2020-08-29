/*  Created by IntelliJ IDEA.
 *  User: Vinay Yadav
 *  Date: 22/08/20
 *  Time: 1:16 PM
 *  File Name : Library.java
 * */
package book;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    private String studentName;
    private long universityRollNo;
    private String nameOfBooksStudentIssued[] = new String[] {};
    private int noOfBooksStudentIssued;

    public String getStudentName() {
        return studentName;
    }
    public void setStudentName() {
        this.studentName = studentName;
    }
    public long getUniversityRollNo() {
        return  universityRollNo;
    }

    public void setUniversityRollNo() {
        this.universityRollNo = universityRollNo;
    }

    public int getNoOfBookStudentIssued() {
         return noOfBooksStudentIssued;
    }
    public void setNoOfBooksStudentIssued() {
    this.nameOfBooksStudentIssued = nameOfBooksStudentIssued;
    }
    public String[] getNameOfBooksStudentIssued() {
        return nameOfBooksStudentIssued;
    }
    public void setNameOfBooksStudentIssued(String[] nameOfBooksStudentIssued) {
        this.nameOfBooksStudentIssued = nameOfBooksStudentIssued;
    }
    public Student(String studentName,long universityRollNo, String[] nameOfBooksStudentIssued, int noOfBooksStudentIssued) {
        this.studentName = studentName;
        this.noOfBooksStudentIssued = noOfBooksStudentIssued;
        this.nameOfBooksStudentIssued = nameOfBooksStudentIssued;
        this.universityRollNo = universityRollNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", universityRollNo=" + universityRollNo +
                ", nameOfBooksStudentIssued=" + Arrays.toString(nameOfBooksStudentIssued) +
                ", noOfBooksStudentIssued=" + noOfBooksStudentIssued +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getUniversityRollNo() == student.getUniversityRollNo() &&
                noOfBooksStudentIssued == student.noOfBooksStudentIssued &&
                Objects.equals(getStudentName(), student.getStudentName()) &&
                Arrays.equals(getNameOfBooksStudentIssued(), student.getNameOfBooksStudentIssued());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getStudentName(), getUniversityRollNo(), noOfBooksStudentIssued);
        result = 31 * result + Arrays.hashCode(getNameOfBooksStudentIssued());
        return result;
    }
}

