package com.unitedcoder.inheritancetutorial;

import java.util.Arrays;

public class StudentManagement {
    public static void main(String[] args) {
        System.out.println("Below is student info: ");

        Student student= new Student(3245,"Aliye","Idris","1994-06-01",
                "Female","aliye@yahoo.com");

        System.out.println(student);

        System.out.println("Below is graduate student info: ");
        GraduateStudent graduateStudent= new GraduateStudent(1234,"Kaysar","Enver","1998-8-3","Male",
                "kaysar@gmail.com","SDET","Dolkun");

        System.out.println(graduateStudent);

        System.out.println("Below is doctor student info: ");
        DoctorStudent doctorStudent= new DoctorStudent(4567,"Damson","Hilton","1988-5-17",
                "Male","david@outlook.com","ChatGPT","Aynigar",10000,
                Arrays.asList("publicaiton1","publication2"));
        System.out.println(doctorStudent);

    }
}
