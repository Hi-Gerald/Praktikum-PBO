package arrayobject;

import enkapsulasi.mahasiswa;

public class Main {

    public static void main(String[] args) {

        //Array Object
        mahasiswa[] student = {
            new mahasiswa ("Ali", 20, 170),
            new mahasiswa ("Budi", 22, 171),
            new mahasiswa ("Caca", 19, 160),
            new mahasiswa ("Doni", 27, 175),
        };
        for (mahasiswa mhs : student) {
            System.out.println("Nama: " + mhs.getNama() + ", Umur: " + mhs.getUmur() + ", Tinggi Badan: " + mhs.getTinggiBadan());
        }

        System.out.println("========================================");

        mahasiswa[] mhs = new mahasiswa[3];
        mhs[0] = new mahasiswa();
        mhs[0].setNama("Ali");
        mhs[1] = new mahasiswa();
        mhs[1].setNama("Alia");
        mhs[2] = new mahasiswa();
        mhs[2].setNama("Alin");

        for (mahasiswa m : mhs){
            System.out.println(m.getNama());
        }
    }
}