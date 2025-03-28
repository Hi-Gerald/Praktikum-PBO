public class main {
    public static void main(String[] args) {
        mahasiswa mhs1 = new mahasiswa();
        //system.out.println("Nama: " + mhs1.nama); eror
        mhs1.tampilkanInfo();
        System.out.println("Umur: " + mhs1.umur);
        System.out.println(mhs1.nama);
        System.out.println(mhs1.umur);

        mahasiswa mhs2 = new mahasiswa("Budi", 20);
        System.out.println("Nama: " + mhs2.nama);
        System.out.println("Umur: " + mhs2.umur);
        System.out.println(mhs2.universitas);
    }
}
