package com.xworkz.encapsulation.dto;

import java.util.Objects;

public class EmployeeDto {
    private String name;
    private int id;
    private long number;
    private boolean isActive;

    public EmployeeDto(int id, boolean isActive, String name, long number) {
        this.id = id;
        this.isActive = isActive;
        this.name = name;
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmployeeDto)) return false;
        EmployeeDto that = (EmployeeDto) o;
        return id == that.id && number == that.number && isActive == that.isActive && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, number, isActive);
    }

    @Override
    public String toString() {
        return "EmployeeDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", number=" + number +
                ", isActive=" + isActive +
                '}';
    }
}
