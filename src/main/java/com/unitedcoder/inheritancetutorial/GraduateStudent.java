package com.unitedcoder.inheritancetutorial;

public class GraduateStudent extends Student{
    private String thesis;
    private String advisorName;

    public GraduateStudent() {
    }

    public GraduateStudent(String thesis, String advisorName) {
        this.thesis = thesis;
        this.advisorName = advisorName;
    }

    public GraduateStudent(long studentId, String firstName, String lastName, String birthDay, String gender,
                           String email, String thesis, String advisorName) {
        super(studentId, firstName, lastName, birthDay, gender, email);
        this.thesis = thesis;
        this.advisorName = advisorName;
    }

    public String getThesis() {
        return thesis;
    }

    public String getAdvisorName() {
        return advisorName;
    }

    @Override
    public String toString() {
        return super.toString()+ ", "+ thesis + ", " + advisorName;
    }
}
