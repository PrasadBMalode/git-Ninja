package com.xworkz.collectionSixth.dto;

public class StudentDTO {
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

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public long getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(long studentNumber) {
        this.studentNumber = studentNumber;
    }

    
}
