public class Main {
    public static void main(String[] args) {
        MobilPribadi mobil = new MobilPribadi("B1234AA", "Toyota", 2015);
        System.out.println("=== Mobil Pribadi ===");
        mobil.tampilkanInfo();
        System.out.println("Biaya sewa untuk 3 hari: " + mobil.hitungBiayaSewa(3));
        System.out.println("Perlu supir: " + mobil.perluSupir());

        Bus bus = new Bus("B5678BB", "Mercedes", 2020);
        System.out.println("\n=== Bus ===");
        bus.tampilkanInfo();
        System.out.println("Biaya sewa untuk 2 hari: " + bus.hitungBiayaSewa(2));
        System.out.println("Perlu supir: " + bus.perluSupir());

        Truk truk = new Truk("B9012CC", "Hino", 2018);
        System.out.println("\n=== Truk ===");
        truk.tampilkanInfo();
        System.out.println("Biaya sewa untuk 4 hari: " + truk.hitungBiayaSewa(4));
        System.out.println("Perlu supir: " + truk.perluSupir());
        System.out.println("Kapasitas muatan: " + truk.kapasitasMuatan() + " kg");
    }
}