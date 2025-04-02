package librarysystem;

public class Buku {
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private boolean statusDipinjam;
    private static int jumlahBukuTersedia = 0;

    public Buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.statusDipinjam = false;
        jumlahBukuTersedia++;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public boolean isStatusDipinjam() {
        return statusDipinjam;
    }

    public static int getJumlahBukuTersedia() {
        return jumlahBukuTersedia;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public void pinjamBuku() {
        if (!statusDipinjam) {
            statusDipinjam = true;
            System.out.println("Buku '" + judul + "' berhasil dipinjam");
        } else {
            System.out.println("Buku '" + judul + "' sedang dipinjam");
        }
    }

    public void kembalikanBuku() {
        if (statusDipinjam) {
            statusDipinjam = false;
            System.out.println("Buku '" + judul + "' telah dikembalikan");
        } else {
            System.out.println("Buku '" + judul + "' tidak sedang dipinjam");
        }
    }    
}
