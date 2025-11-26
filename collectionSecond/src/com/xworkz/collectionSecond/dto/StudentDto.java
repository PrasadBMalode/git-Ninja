package com.xworkz.collectionSecond.dto;

import java.util.Objects;

public class StudentDto {
    private String studentName;
    private String studentCllgName;
    private int studentId;
    private int studentClass;
    private long studentNumber;
    private long studentRegistorNumbe;
    private float studentHeight;
    private double studentMarks;
    private char studentCode;
    private boolean isStudentPresent;

    public StudentDto(String studentName, String studentCllgName, int studentId,
                      int studentClass, long studentNumber, long studentRegistorNumbe,
                      float studentHeight, double studentMarks, char studentCode,
                      boolean isStudentPresent) {

        this.studentName = studentName;
        this.studentCllgName = studentCllgName;
        this.studentId = studentId;
        this.studentClass = studentClass;
        this.studentNumber = studentNumber;
        this.studentRegistorNumbe = studentRegistorNumbe;
        this.studentHeight = studentHeight;
        this.studentMarks = studentMarks;
        this.studentCode = studentCode;
        this.isStudentPresent = isStudentPresent;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentCllgName() {
        return studentCllgName;
    }

    public void setStudentCllgName(String studentCllgName) {
        this.studentCllgName = studentCllgName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(int studentClass) {
        this.studentClass = studentClass;
    }

    public long getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(long studentNumber) {
        this.studentNumber = studentNumber;
    }

    public long getStudentRegistorNumbe() {
        return studentRegistorNumbe;
    }

    public void setStudentRegistorNumbe(long studentRegistorNumbe) {
        this.studentRegistorNumbe = studentRegistorNumbe;
    }

    public float getStudentHeight() {
        return studentHeight;
    }

    public void setStudentHeight(float studentHeight) {
        this.studentHeight = studentHeight;
    }

    public double getStudentMarks() {
        return studentMarks;
    }

    public void setStudentMarks(double studentMarks) {
        this.studentMarks = studentMarks;
    }

    public char getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(char studentCode) {
        this.studentCode = studentCode;
    }

    public boolean isStudentPresent() {
        return isStudentPresent;
    }

    public void setStudentPresent(boolean studentPresent) {
        isStudentPresent = studentPresent;
    }

    @Override
    public String toString() {
        return "StudentDto{" +
                "studentName='" + studentName + '\'' +
                ", studentCllgName='" + studentCllgName + '\'' +
                ", studentId=" + studentId +
                ", studentClass=" + studentClass +
                ", studentNumber=" + studentNumber +
                ", studentRegistorNumbe=" + studentRegistorNumbe +
                ", studentHeight=" + studentHeight +
                ", studentMarks=" + studentMarks +
                ", studentCode=" + studentCode +
                ", isStudentPresent=" + isStudentPresent +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StudentDto)) return false;
        StudentDto that = (StudentDto) o;
        return studentId == that.studentId && studentClass == that.studentClass && studentNumber == that.studentNumber && studentRegistorNumbe == that.studentRegistorNumbe && Float.compare(studentHeight, that.studentHeight) == 0 && Double.compare(studentMarks, that.studentMarks) == 0 && studentCode == that.studentCode && isStudentPresent == that.isStudentPresent && Objects.equals(studentName, that.studentName) && Objects.equals(studentCllgName, that.studentCllgName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentName, studentCllgName, studentId, studentClass, studentNumber, studentRegistorNumbe, studentHeight, studentMarks, studentCode, isStudentPresent);
    }
}
