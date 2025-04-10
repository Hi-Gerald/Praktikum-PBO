import Dosen.Dosen;
import Mahasiswa.Mahasiswa;
import Matakuliah.Matakuliah;

public class main {
    public static void main(String[] args) throws Exception {
        Matakuliah PBO = new Matakuliah("PBO", "5123");
        Matakuliah Kompar = new Matakuliah("Kompar", "124");
        Matakuliah Metnum = new Matakuliah("Metnum", "125");
        
        Dosen dosen1 = new Dosen("Cahya", "523");
        Dosen dosen2 = new Dosen("Budi", "524");

        Mahasiswa mahasiswa1 = new Mahasiswa("Tiara", "001");
        Mahasiswa mahasiswa2 = new Mahasiswa("Diana", "002");

        PBO.addPengampu(dosen1);
        Kompar.addPengampu(dosen2);
        Metnum.addPengampu(dosen2);

        PBO.addMahasiswa(mahasiswa1);
        PBO.addMahasiswa(mahasiswa2);

        Kompar.addMahasiswa(mahasiswa1);
        Kompar.addMahasiswa(mahasiswa2);

        Metnum.addMahasiswa(mahasiswa1);

        //Tampilkan sesuai tabel pada soal
        PBO.tampilkanData(PBO);
        Kompar.tampilkanData(Kompar);
        Metnum.tampilkanData(Metnum);
    }
}
