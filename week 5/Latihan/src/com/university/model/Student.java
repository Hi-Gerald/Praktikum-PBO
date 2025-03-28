package com.university.model;

public class Student {
    //attribut sesuai soal
    private String studentId;
    private String name;
    protected int age;
    public double gpa;

    // Constructor to initialize all attributes
    public Student(String studentId, String name, int age, double gpa) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    // Method Getter and Setter untuk studentId
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    // Method Getter and Setter untuk student name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Method Getter and Setter untuk student age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Method Getter and Setter untuk student gpa
    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}