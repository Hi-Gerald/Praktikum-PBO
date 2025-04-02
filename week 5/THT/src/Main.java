import librarysystem.Buku;
import librarysystem.Perpustakaan;
import librarysystem.User;

public class Main {
    public static void main(String[] args) {
        
        Perpustakaan perpustakaan = new Perpustakaan();

        Buku buku1 = new Buku("Pemrograman Java", "John Doe", 2020);
        Buku buku2 = new Buku("Struktur Data", "Jane Smith", 2019);
        Buku buku3 = new Buku("Algoritma", "Bob Johnson", 2021);

        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);
        perpustakaan.tambahBuku(buku3);

        perpustakaan.tampilkanBuku();

        User user1 = new User("Alice", "USR001");
        
        user1.pinjamBuku(buku1);
        user1.pinjamBuku(buku1); 
        
        perpustakaan.tampilkanBuku();

        user1.kembalikanBuku(buku1);
        
        perpustakaan.tampilkanBuku();
    }    
}
