class Bangunan {
    String nama = "Bangunan Umum";
}

class GedungSekolah extends Bangunan{
    String nama = "Gedung Sekolah ABC";

    void tampilkanInfo(){
        System.out.println("Ini nama subclass: " + nama);
        System.out.println("Ini Nama: " + super.nama);
    }
}

public class Nomor1 {
    public static void main(String[] args) throws Exception {
        GedungSekolah GOR = new GedungSekolah();
        GOR.tampilkanInfo();
    }
}
