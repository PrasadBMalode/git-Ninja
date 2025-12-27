package com.xworkz.comparator.dto;

public class StudentDto {
    private String studentName;
    private int studentId;
    private char studentGrade;

    public StudentDto(char studentGrade, int studentId, String studentName) {
        this.studentGrade = studentGrade;
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public char getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(char studentGrade) {
        this.studentGrade = studentGrade;
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

    @Override
    public String toString() {
        return "StudentDto{" +
                "studentGrade=" + studentGrade +
                ", studentName='" + studentName + '\'' +
                ", studentId=" + studentId +
                '}';
    }
}
