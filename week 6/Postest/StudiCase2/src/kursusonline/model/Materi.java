package kursusonline.model;

public class Materi {
    private String judul;
    private String deskripsi;
    private int durasi;

    public Materi(String judul, String deskripsi, int durasi) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.durasi = durasi;
    }

    public String getJudul() { return judul; }
    public String getDeskripsi() { return deskripsi; }
    public int getDurasi() { return durasi; }
}