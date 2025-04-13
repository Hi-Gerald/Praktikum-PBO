package kursusonline.model;

import java.util.ArrayList;

public class Kursus {
    private String kode;
    private String nama;
    private Instruktur instruktur;
    private ArrayList<Peserta> daftarPeserta;
    private ArrayList<Materi> daftarMateri;

    public Kursus(String kode, String nama, Instruktur instruktur) {
        this.kode = kode;
        this.nama = nama;
        this.instruktur = instruktur;
        this.daftarPeserta = new ArrayList<>();
        this.daftarMateri = new ArrayList<>();
    }

    public boolean tambahPeserta(Peserta peserta) {
        if (!peserta.getEmail().endsWith("@gmail.com")) {
            System.out.println("Email " + peserta.getEmail() + " tidak valid!");
            return false;
        }
        for (Peserta existing : daftarPeserta) {
            if (existing.getId().equals(peserta.getId())) {
                System.out.println("Peserta dengan ID " + peserta.getId() + " sudah terdaftar!");
                return false;
            }
        }
        daftarPeserta.add(peserta);
        return true;
    }

    public void tambahMateri(Materi materi) {
        daftarMateri.add(materi);
    }

    public void tampilkanDetailKursus() {
        System.out.println("=== Detail Kursus ===");
        System.out.println("Kode: " + kode);
        System.out.println("Nama: " + nama);
        System.out.println("Instruktur: " + instruktur.getNama());
        System.out.println("Spesialisasi: " + instruktur.getSpesialisasi());
        System.out.println("\nDaftar Peserta:");
        for (Peserta peserta : daftarPeserta) {
            System.out.println("- " + peserta.getNama() + " (" + peserta.getEmail() + ")");
        }
        System.out.println("\nDaftar Materi:");
        for (Materi materi : daftarMateri) {
            System.out.println("- " + materi.getJudul() + " (" + materi.getDurasi() + " menit)");
        }
        System.out.println("====================");
    }

    public String getKode() { return kode; }
}