package Mahasiswa;

public class Mahasiswa {
    private String Nama;
    private String NIM;

    public Mahasiswa(String Nama, String NIM) {
        this.Nama = Nama;
        this.NIM = NIM;
    }
    public String getNama(){
        return Nama;
    } 

    public String getNIM(){
        return NIM;
    } 
}
