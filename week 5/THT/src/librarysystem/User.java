package librarysystem;

public class User {
    private String nama;
    private String idUser;

    public User(String nama, String idUser) {
        this.nama = nama;
        this.idUser = idUser;
    }

    public void pinjamBuku(Buku buku) {
        System.out.println("\nUser " + nama + " (ID: " + idUser + ") meminjam buku:");
        buku.pinjamBuku();
    }

    public void kembalikanBuku(Buku buku) {
        System.out.println("\nUser " + nama + " (ID: " + idUser + ") mengembalikan buku:");
        buku.kembalikanBuku();
    }    
}
