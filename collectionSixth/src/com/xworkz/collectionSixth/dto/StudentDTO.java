package com.xworkz.collectionSixth.dto;

public class StudentDTO  {

    private String studentName;
    private int studentId;
    private long studentNumber;

    public StudentDTO(int studentId, String studentName, long studentNumber) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentNumber = studentNumber;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public long getStudentNumber() {
        return studentNumber;
    }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentNumber=" + studentNumber +
                '}';
    }
}
