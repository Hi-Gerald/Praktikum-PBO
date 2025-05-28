class Transportasi {
    private String nama;
    private int jumlahKursi;
    private String tujuan;

    // Constructor
    public Transportasi(String nama, int jumlahKursi, String tujuan) {
        this.nama = nama;
        this.jumlahKursi = jumlahKursi;
        this.tujuan = tujuan;
    }

    // Getters and Setters
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getJumlahKursi() {
        return jumlahKursi;
    }

    public void setJumlahKursi(int jumlahKursi) {
        this.jumlahKursi = jumlahKursi;
    }

    public String getTujuan() {
        return tujuan;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    // Default method for calculating ticket price
    public double hitungHargaTiket() {
        return 100000.0;
    }
}

class Bus extends Transportasi {
    public Bus(String nama, int jumlahKursi, String tujuan) {
        super(nama, jumlahKursi, tujuan);
    }

    // Override: Add 10% to default price
    @Override
    public double hitungHargaTiket() {
        return super.hitungHargaTiket() * 1.10; // 100,000 + 10% = 110,000
    }

    // Overload: Adjust price based on service class
    public double hitungHargaTiket(String kelasLayanan) {
        double basePrice = hitungHargaTiket();
        if (kelasLayanan.equalsIgnoreCase("Ekonomi")) {
            return basePrice; // +0%
        } else if (kelasLayanan.equalsIgnoreCase("Bisnis")) {
            return basePrice * 1.25; // +25%
        } else if (kelasLayanan.equalsIgnoreCase("VIP")) {
            return basePrice * 1.50; // +50%
        }
        return basePrice; // Default to base price if class is invalid
    }
}

class Kereta extends Transportasi {
    public Kereta(String nama, int jumlahKursi, String tujuan) {
        super(nama, jumlahKursi, tujuan);
    }

    // Override: Add 20% to default price
    @Override
    public double hitungHargaTiket() {
        return super.hitungHargaTiket() * 1.20; // 100,000 + 20% = 120,000
    }

    // Overload: Adjust price based on service class
    public double hitungHargaTiket(String kelasLayanan) {
        double basePrice = hitungHargaTiket();
        if (kelasLayanan.equalsIgnoreCase("Ekonomi")) {
            return basePrice; // +0%
        } else if (kelasLayanan.equalsIgnoreCase("Bisnis")) {
            return basePrice * 1.25; // +25%
        } else if (kelasLayanan.equalsIgnoreCase("VIP")) {
            return basePrice * 1.50; // +50%
        }
        return basePrice; // Default to base price if class is invalid
    }
}

class Pesawat extends Transportasi {
    public Pesawat(String nama, int jumlahKursi, String tujuan) {
        super(nama, jumlahKursi, tujuan);
    }

    // Override: Add 50% to default price
    @Override
    public double hitungHargaTiket() {
        return super.hitungHargaTiket() * 1.50; // 100,000 + 50% = 150,000
    }

    // Overload: Adjust price based on service class
    public double hitungHargaTiket(String kelasLayanan) {
        double basePrice = hitungHargaTiket();
        if (kelasLayanan.equalsIgnoreCase("Ekonomi")) {
            return basePrice; // +0%
        } else if (kelasLayanan.equalsIgnoreCase("Bisnis")) {
            return basePrice * 1.25; // +25%
        } else if (kelasLayanan.equalsIgnoreCase("VIP")) {
            return basePrice * 1.50; // +50%
        }
        return basePrice; // Default to base price if class is invalid
    }
}

public class Main {
    public static void main(String[] args) {
        // Create objects for each transportation type
        Transportasi bus = new Bus("Bus Trans", 40, "Bandung");
        Transportasi kereta = new Kereta("Kereta Cepat", 60, "Surabaya");
        Transportasi pesawat = new Pesawat("Pesawat Air", 120, "Medan");

        // Store objects in an array to demonstrate polymorphism
        Transportasi[] transportasiArray = {bus, kereta, pesawat};

        // Loop through the array and display ticket prices
        for (Transportasi t : transportasiArray) {
            // Display default ticket price (using polymorphism)
            System.out.println(t.getNama() + " ke " + t.getTujuan() + " - Harga tiket (default): " + t.hitungHargaTiket());

            // Display ticket price with service class (using direct method call due to overloading)
            String kelasLayanan = "Ekonomi"; // Default service class
            if (t instanceof Bus) {
                kelasLayanan = "Bisnis";
                System.out.println(t.getNama() + " ke " + t.getTujuan() + " - Harga tiket (" + kelasLayanan + "): " + ((Bus)t).hitungHargaTiket(kelasLayanan));
            } else if (t instanceof Kereta) {
                kelasLayanan = "VIP";
                System.out.println(t.getNama() + " ke " + t.getTujuan() + " - Harga tiket (" + kelasLayanan + "): " + ((Kereta)t).hitungHargaTiket(kelasLayanan));
            } else if (t instanceof Pesawat) {
                kelasLayanan = "Ekonomi";
                System.out.println(t.getNama() + " ke " + t.getTujuan() + " - Harga tiket (" + kelasLayanan + "): " + ((Pesawat)t).hitungHargaTiket(kelasLayanan));
            }
        }
    }
}