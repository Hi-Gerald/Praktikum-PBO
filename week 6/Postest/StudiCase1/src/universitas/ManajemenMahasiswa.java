package universitas;

import java.util.ArrayList;

public class ManajemenMahasiswa {
    private ArrayList<Mahasiswa> daftarMahasiswa;

    public ManajemenMahasiswa() {
        daftarMahasiswa = new ArrayList<>();
    }

    public void tambahMahasiswa(Mahasiswa m) {
        daftarMahasiswa.add(m);
    }

    public void tampilkanSemua() {
        System.out.println("DAFTAR MAHASISWA:");
        for (Mahasiswa m : daftarMahasiswa) {
            m.tampilkanData();
            System.out.println();
        }
    }

    public void tampilkanIPKTertinggi() {
        if (daftarMahasiswa.isEmpty()) {
            System.out.println("Belum ada data mahasiswa!");
            return;
        }

        Mahasiswa terbaik = daftarMahasiswa.get(0);
        for (Mahasiswa m : daftarMahasiswa) {
            if (m.getIpk() > terbaik.getIpk()) {
                terbaik = m;
            }
        }
        System.out.println("Mahasiswa dengan IPK Tertinggi:");
        terbaik.tampilkanData();
    }
}