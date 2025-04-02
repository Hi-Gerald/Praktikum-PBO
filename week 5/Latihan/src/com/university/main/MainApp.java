package com.university.main;

import com.university.model.Student;

public class MainApp {
    public static void main(String[] args) {
        //buat dummy data untuk array of object berisi 5 data\
        Student[] students = new Student[5];
        students[0] = new Student("105223001", "Alicia", 20, 3.8);
        students[1] = new Student("105223002", "Gerald", 22, 3.6);
        students[2] = new Student("105223003", "Farrell", 21, 3.9);
        students[3] = new Student("105223004", "Stevo", 19, 3.7);
        students[4] = new Student("105223005", "Jelo", 23, 3.5);

        //looping untuk menampilkan data
        System.out.println("=== Data Mahasiswa ===");
        for (Student student : students) {
            System.out.println("ID: " + student.getStudentId() + 
                             ", Nama: " + student.getName() + 
                             ", Umur: " + student.getAge() + 
                             ", GPA: " + student.getGpa());
        }
    }
}