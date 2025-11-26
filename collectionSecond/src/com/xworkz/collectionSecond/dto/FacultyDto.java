package com.xworkz.collectionSecond.dto;

import java.util.Objects;

public class FacultyDto {
    private String facultyName;
    private String facultyBusDriverNa;
    private int facultyId;
    private int facultyTotalSubject;
    private int facultyTotalClasses;
    private long facultyRegistorNumbe;
    private float facultyRanking;
    private double facultySalary;
    private char facultyCode;
    private boolean isFacultyActive;

    public FacultyDto(String facultyName, String facultyBusDriverNa, int facultyId,
                      int facultyTotalSubject, int facultyTotalClasses,
                      long facultyRegistorNumbe, float facultyRanking,
                      double facultySalary, char facultyCode, boolean isFacultyActive) {

        this.facultyName = facultyName;
        this.facultyBusDriverNa = facultyBusDriverNa;
        this.facultyId = facultyId;
        this.facultyTotalSubject = facultyTotalSubject;
        this.facultyTotalClasses = facultyTotalClasses;
        this.facultyRegistorNumbe = facultyRegistorNumbe;
        this.facultyRanking = facultyRanking;
        this.facultySalary = facultySalary;
        this.facultyCode = facultyCode;
        this.isFacultyActive = isFacultyActive;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public String getFacultyBusDriverNa() {
        return facultyBusDriverNa;
    }

    public void setFacultyBusDriverNa(String facultyBusDriverNa) {
        this.facultyBusDriverNa = facultyBusDriverNa;
    }

    public int getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(int facultyId) {
        this.facultyId = facultyId;
    }

    public int getFacultyTotalSubject() {
        return facultyTotalSubject;
    }

    public void setFacultyTotalSubject(int facultyTotalSubject) {
        this.facultyTotalSubject = facultyTotalSubject;
    }

    public int getFacultyTotalClasses() {
        return facultyTotalClasses;
    }

    public void setFacultyTotalClasses(int facultyTotalClasses) {
        this.facultyTotalClasses = facultyTotalClasses;
    }

    public long getFacultyRegistorNumbe() {
        return facultyRegistorNumbe;
    }

    public void setFacultyRegistorNumbe(long facultyRegistorNumbe) {
        this.facultyRegistorNumbe = facultyRegistorNumbe;
    }

    public float getFacultyRanking() {
        return facultyRanking;
    }

    public void setFacultyRanking(float facultyRanking) {
        this.facultyRanking = facultyRanking;
    }

    public double getFacultySalary() {
        return facultySalary;
    }

    public void setFacultySalary(double facultySalary) {
        this.facultySalary = facultySalary;
    }

    public char getFacultyCode() {
        return facultyCode;
    }

    public void setFacultyCode(char facultyCode) {
        this.facultyCode = facultyCode;
    }

    public boolean isFacultyActive() {
        return isFacultyActive;
    }

    public void setFacultyActive(boolean facultyActive) {
        isFacultyActive = facultyActive;
    }

    @Override
    public String toString() {
        return "FacultyDto{" +
                "facultyName='" + facultyName + '\'' +
                ", facultyBusDriverNa='" + facultyBusDriverNa + '\'' +
                ", facultyId=" + facultyId +
                ", facultyTotalSubject=" + facultyTotalSubject +
                ", facultyTotalClasses=" + facultyTotalClasses +
                ", facultyRegistorNumbe=" + facultyRegistorNumbe +
                ", facultyRanking=" + facultyRanking +
                ", facultySalary=" + facultySalary +
                ", facultyCode=" + facultyCode +
                ", isFacultyActive=" + isFacultyActive +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FacultyDto)) return false;
        FacultyDto that = (FacultyDto) o;
        return facultyId == that.facultyId && facultyTotalSubject == that.facultyTotalSubject && facultyTotalClasses == that.facultyTotalClasses && facultyRegistorNumbe == that.facultyRegistorNumbe && Float.compare(facultyRanking, that.facultyRanking) == 0 && Double.compare(facultySalary, that.facultySalary) == 0 && facultyCode == that.facultyCode && isFacultyActive == that.isFacultyActive && Objects.equals(facultyName, that.facultyName) && Objects.equals(facultyBusDriverNa, that.facultyBusDriverNa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(facultyName, facultyBusDriverNa, facultyId, facultyTotalSubject, facultyTotalClasses, facultyRegistorNumbe, facultyRanking, facultySalary, facultyCode, isFacultyActive);
    }
}
