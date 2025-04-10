package Matakuliah;
import java.util.ArrayList;
import java.util.Arrays;
import Dosen.Dosen;
import Mahasiswa.Mahasiswa;
import java.util.ArrayList;
public class Matakuliah {
    private String NamaMatkul;
    private String KodeMatkul;
    private ArrayList<Mahasiswa> DaftarMahasiswa = new ArrayList<Mahasiswa>();
    private ArrayList<Dosen> Pengampu = new ArrayList<Dosen>();
    
    public Matakuliah(String NamaMatkul, String KodeMatkul){
        this.NamaMatkul = NamaMatkul;
        this.KodeMatkul = KodeMatkul;
    }
    
    public String getNamaMatkul(){
        return NamaMatkul;
    }
    
    public String getKodeMatkul(){
        return KodeMatkul;
    }

    public void setNamaMatkul(){
        this.NamaMatkul = NamaMatkul;
    }
    
    public void setKodeMatkul(){
        this.KodeMatkul = KodeMatkul;
    }
    public void addPengampu(Dosen NamaPengampu){
        this.Pengampu.add (NamaPengampu);
    }

    public void addMahasiswa(Mahasiswa NamaMahasiswa){
        this.DaftarMahasiswa.add (NamaMahasiswa);
    }
    
    public ArrayList<Mahasiswa> getDaftarMahasiswa(){
        return DaftarMahasiswa;
    }
    
    public ArrayList<Dosen> getpengampu(){
        return Pengampu;
    }

    public void tampilkanData(Matakuliah mata_kuliah){
        System.out.println("Mata Kuliah: " + mata_kuliah.getNamaMatkul());
        System.out.println("Kode Mata Kuliah: " + mata_kuliah.getKodeMatkul());
        for (Dosen dosen : mata_kuliah.getpengampu()) {
            System.out.println("Dosen: " + dosen.getNama());
        }
        for (Mahasiswa mahasiswa : mata_kuliah.getDaftarMahasiswa()) {
            System.out.println("Mahasiswa: " + mahasiswa.getNama());
        }
        System.out.println("\n\n");
    }

}
