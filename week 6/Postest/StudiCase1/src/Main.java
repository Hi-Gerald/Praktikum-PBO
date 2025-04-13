import java.util.Scanner;
import universitas.Mahasiswa;
import universitas.ManajemenMahasiswa;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManajemenMahasiswa manajemen = new ManajemenMahasiswa();
        
        while (true) {
            System.out.println("== MENU ==");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Tampilkan Semua Mahasiswa");
            System.out.println("3. Tampilkan Mahasiswa dengan IPK Tertinggi");
            System.out.println("4. Keluar");
            System.out.print("Pilih: ");
            
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Menyimpan bari baru karena ketika kita melakukan input integer, kursor akan otomatis berpindah ke bari barus sehingga akan terjadi eror. Apalagi setelah ini input yang diberikan adalah input string

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan NIM : ");
                    String nim = scanner.nextLine();
                    System.out.print("Masukkan Nama : ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan Prodi : ");
                    String prodi = scanner.nextLine();
                    System.out.print("Masukkan IPK : ");
                    double ipk = scanner.nextDouble();
                    
                    Mahasiswa m = new Mahasiswa(nim, nama, prodi, ipk);
                    manajemen.tambahMahasiswa(m);
                    System.out.println("Data berhasil ditambahkan!");
                    break;
                    
                case 2:
                    manajemen.tampilkanSemua();
                    break;
                    
                case 3:
                    manajemen.tampilkanIPKTertinggi();
                    break;
                    
                case 4:
                    System.out.println("Terima kasih!");
                    scanner.close();
                    return;
                    
                default:
                    System.out.println("Pilihan tidak valid!");
            }
            System.out.println();
        }
    }
}