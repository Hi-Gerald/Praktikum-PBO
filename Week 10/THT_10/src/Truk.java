public class Truk extends Kendaraan implements DapatDisewa, Muatan {
    private int hargaSewaPerHari = 300000;
    private double kapasitas = 5000.0;

    public Truk(String platNomor, String merk, int tahunProduksi) {
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

    @Override
    public double kapasitasMuatan() {
        return kapasitas;
    }
}