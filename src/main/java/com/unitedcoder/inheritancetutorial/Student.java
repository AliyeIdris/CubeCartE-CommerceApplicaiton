package com.unitedcoder.inheritancetutorial;

public class Student {
    private long studentId;
    private String firstName;
    private String lastName;
    private String birthDay;
    private String gender;
    private String email;

    public Student() {
    }

    public Student(long studentId, String firstName, String lastName, String birthDay, String gender, String email) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.gender = gender;
        this.email = email;
    }

    public long getStudentId() {
        return studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return studentId +", " +firstName +", "+lastName+", "+birthDay+", " +gender+" ," +email;
    }
}
