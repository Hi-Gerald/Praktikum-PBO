package enkapsulasi;

public class mahasiswa {
    private  String nama = "Budi";
    private int umur;
    private String jurusan;
    private int tinggiBadan;

    //method setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public void setTinggiBadan(int tinggiBadan){
        this.tinggiBadan = tinggiBadan;
    }

    //method getter
    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public String getJurusan() {
        return jurusan;
    }

    public int getTinggiBadan() {
        return tinggiBadan;
    }

    public mahasiswa(){
    }

    public mahasiswa (String nama, int umur, int tinggiBadan) {
        this.nama = nama;
        this.umur = umur;
        this.tinggiBadan = tinggiBadan;
    }
    
}