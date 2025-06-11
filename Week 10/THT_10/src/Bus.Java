public class Bus extends Kendaraan implements DapatDisewa {
    private int hargaSewaPerHari = 500000;

    public Bus(String platNomor, String merk, int tahunProduksi) {
        super(platNomor, merk, tahunProduksi);
    }

    @Override
    public int hitungBiayaSewa(int hari) {
        return hargaSewaPerHari * hari;
    }

    @Override
    public boolean perluSupir() {
        return true;
    }
}