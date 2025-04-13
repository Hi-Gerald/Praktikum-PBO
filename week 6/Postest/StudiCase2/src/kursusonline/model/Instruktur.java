package kursusonline.model;

public class Instruktur {
    private String id;
    private String nama;
    private String spesialisasi;

    public Instruktur(String id, String nama, String spesialisasi) {
        this.id = id;
        this.nama = nama;
        this.spesialisasi = spesialisasi;
    }

    public String getId() { return id; }
    public String getNama() { return nama; }
    public String getSpesialisasi() { return spesialisasi; }
}