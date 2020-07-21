package com.hyorin.learningMVC.Bean;

public class School {
    public String address;
    public int schoolNumber;

    public School() {
    }

    public School(String address, int schoolNumber) {
        this.address = address;
        this.schoolNumber = schoolNumber;
    }

    @Override
    public String toString() {
        return "School{" +
                "address='" + address + '\'' +
                ", schoolNumber=" + schoolNumber +
                '}';
    }
}
