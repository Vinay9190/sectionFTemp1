package book;

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
}
