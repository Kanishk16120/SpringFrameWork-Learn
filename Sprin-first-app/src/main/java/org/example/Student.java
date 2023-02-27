package org.example;

public class Student {
    private int StudentId;
    private String StudentName;
    private String StudentAddress;

    public int getStudentId() {
        return StudentId;
    }

    public String getStudentName() {
        return StudentName;
    }

    public String getStudentAddress() {
        return StudentAddress;
    }



    public Student(int studentId, String studentName, String studentAddress) {
        super();
        this.StudentId = studentId;
        this.StudentName = studentName;
        this.StudentAddress = studentAddress;
    }
    public Student() {
        super();
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public void setStudentAddress(String studentAddress) {
        StudentAddress = studentAddress;
    }
    @Override
    public String toString() {
        return "Student{" +
                "StudentId=" + StudentId +
                ", StudentName='" + StudentName + '\'' +
                ", StudentAddress='" + StudentAddress + '\'' +
                '}';
    }
}
