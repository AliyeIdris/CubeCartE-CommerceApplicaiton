package com.unitedcoder.inheritancetutorial;

import java.util.List;

public class DoctorStudent extends GraduateStudent{
    private long salary;
    private List<String> publications;

    public DoctorStudent() {
    }

    public DoctorStudent(long salary, List<String> publications) {
        this.salary = salary;
        this.publications = publications;
    }

    public DoctorStudent(String thesis, String advisorName, long salary, List<String> publications) {
        super(thesis, advisorName);
        this.salary = salary;
        this.publications = publications;
    }

    public DoctorStudent(long studentId, String firstName, String lastName, String birthDay, String gender, String email, String thesis, String advisorName, long salary, List<String> publications) {
        super(studentId, firstName, lastName, birthDay, gender, email, thesis, advisorName);
        this.salary = salary;
        this.publications = publications;
    }
}
