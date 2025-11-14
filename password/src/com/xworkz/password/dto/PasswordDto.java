package com.xworkz.password.dto;

import java.util.Objects;

public class PasswordDto {
    private String password;
    private String name;

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "PasswordDto{" +
                "password='" + password + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PasswordDto)) return false;
        PasswordDto that = (PasswordDto) o;
        return Objects.equals(password, that.password) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(password, name);
    }

    public PasswordDto(String password, String name) {
        this.password = password;
        this.name = name;
    }
}
