package librarysystem;

public class Perpustakaan {
    private Buku[] koleksiBuku;
    private int jumlahBuku;
    private static final int KAPASITAS = 100;

    public Perpustakaan() {
        koleksiBuku = new Buku[KAPASITAS];
        jumlahBuku = 0;
    }

    public void tambahBuku(Buku buku) {
        if (jumlahBuku < koleksiBuku.length) {
            koleksiBuku[jumlahBuku] = buku;
            jumlahBuku++;
            System.out.println("Buku '" + buku.getJudul() + "' ditambahkan ke perpustakaan");
        } else {
            System.out.println("Kapasitas perpustakaan penuh!");
        }
    }

    public void tampilkanBuku() {
        System.out.println("\nDaftar Buku di Perpustakaan:");
        for (int i = 0; i < jumlahBuku; i++) {
            Buku b = koleksiBuku[i];
            System.out.println((i + 1) + ". " + b.getJudul() + 
                " - " + b.getPenulis() + 
                " (" + b.getTahunTerbit() + ")" + 
                " [Dipinjam: " + (b.isStatusDipinjam() ? "Ya" : "Tidak") + "]");
        }
        System.out.println("Total buku tersedia: " + Buku.getJumlahBukuTersedia());
    }    
}
