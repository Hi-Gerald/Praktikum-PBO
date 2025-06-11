public class MobilPribadi extends Kendaraan implements DapatDisewa {
    private int hargaSewaPerHari = 100000;

    public MobilPribadi(String platNomor, String merk, int tahunProduksi) {
        super(platNomor, merk, tahunProduksi);
    }

    @Override
    public int hitungBiayaSewa(int hari) {
        return hargaSewaPerHari * hari;
    }

    @Override
    public boolean perluSupir() {
        return false;
    }
}