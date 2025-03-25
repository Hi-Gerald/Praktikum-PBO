import java.util.Scanner;

public class THT2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data mahasiswa
        System.out.println("=== Sistem Pengelolaan Nilai Mahasiswa ===");
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();
        System.out.print("Masukkan usia: ");
        int usia = scanner.nextInt();
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMatkul = scanner.nextInt();

        // Input nilai mata kuliah
        double totalNilai = 0;
        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.print("Masukkan nilai mata kuliah ke-" + (i + 1) + " (0-100): ");
            double nilai = scanner.nextDouble();
            
            // Konversi ke skala 4.0
            if (nilai >= 85) totalNilai += 4.0;
            else if (nilai >= 75) totalNilai += 3.5;
            else if (nilai >= 65) totalNilai += 3.0;
            else if (nilai >= 55) totalNilai += 2.5;
            else if (nilai >= 45) totalNilai += 2.0;
            else if (nilai >= 35) totalNilai += 1.0;
            else totalNilai += 0.0;
        }

        // Hitung IPK
        double ipk = totalNilai / jumlahMatkul;

        // Mengeluarkan Nomor Antrian
        int nomorAntrian = usia + jumlahMatkul;

        // Tampilkan laporan
        System.out.println("\n=== LAPORAN AKADEMIK ===");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Usia: " + usia + " tahun");
        System.out.println("Jumlah Mata Kuliah: " + jumlahMatkul);
        System.out.printf("IPK: %.2f\n", ipk);
        System.out.println("Nomor Antrian Konsultasi: " + nomorAntrian);
        System.out.println("\nEvaluasi Akademik:");

        // Evaluasi 1: Usia > 22
        if (usia > 22) {
            System.out.println("- Usia lebih dari 22 tahun: Perlu konsultasi waktu studi");
        } else {
            System.out.println("- Usia sesuai target studi");
        }

        // Evaluasi 2: IPK >= 3.5 DAN jumlah matkul > 4
        if (ipk >= 3.5 && jumlahMatkul > 4) {
            System.out.println("- Performa akademik sangat baik");
        }

        // Evaluasi 3: IPK < 2.5 ATAU jumlah matkul < 4
        if (ipk < 2.5 || jumlahMatkul < 4) {
            System.out.println("- Performa akademik perlu perhatian khusus");
        }
        System.out.println("======================");

        scanner.close();
    }
}