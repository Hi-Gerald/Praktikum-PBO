class Transportasi {
    private String nama;
    private int jumlahKursi;
    private String tujuan;

    public Transportasi(String nama, int jumlahKursi, String tujuan) {
        this.nama = nama;
        this.jumlahKursi = jumlahKursi;
        this.tujuan = tujuan;
    }

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

    public double hitungHargaTiket() {
        return 100000.0;
    }
}

class Bus extends Transportasi {
    public Bus(String nama, int jumlahKursi, String tujuan) {
        super(nama, jumlahKursi, tujuan);
    }
    @Override
    public double hitungHargaTiket() {
        return super.hitungHargaTiket() * 1.10;
    }
    public double hitungHargaTiket(String kelasLayanan) {
        double basePrice = hitungHargaTiket();
        if (kelasLayanan.equalsIgnoreCase("Ekonomi")) {
            return basePrice; 
        } else if (kelasLayanan.equalsIgnoreCase("Bisnis")) {
            return basePrice * 1.25; 
        } else if (kelasLayanan.equalsIgnoreCase("VIP")) {
            return basePrice * 1.50; 
        }
        return basePrice;
    }
}

class Kereta extends Transportasi {
    public Kereta(String nama, int jumlahKursi, String tujuan) {
        super(nama, jumlahKursi, tujuan);
    }
    @Override
    public double hitungHargaTiket() {
        return super.hitungHargaTiket() * 1.20;
    }
    public double hitungHargaTiket(String kelasLayanan) {
        double basePrice = hitungHargaTiket();
        if (kelasLayanan.equalsIgnoreCase("Ekonomi")) {
            return basePrice;
        } else if (kelasLayanan.equalsIgnoreCase("Bisnis")) {
            return basePrice * 1.25;
        } else if (kelasLayanan.equalsIgnoreCase("VIP")) {
            return basePrice * 1.50;
        }
        return basePrice;
    }
}

class Pesawat extends Transportasi {
    public Pesawat(String nama, int jumlahKursi, String tujuan) {
        super(nama, jumlahKursi, tujuan);
    }
    @Override
    public double hitungHargaTiket() {
        return super.hitungHargaTiket() * 1.50; 
    }
    public double hitungHargaTiket(String kelasLayanan) {
        double basePrice = hitungHargaTiket();
        if (kelasLayanan.equalsIgnoreCase("Ekonomi")) {
            return basePrice; 
        } else if (kelasLayanan.equalsIgnoreCase("Bisnis")) {
            return basePrice * 1.25; 
        } else if (kelasLayanan.equalsIgnoreCase("VIP")) {
            return basePrice * 1.50; 
        }
        return basePrice; 
    }
}

public class Main {
    public static void main(String[] args) {
        Transportasi bus = new Bus("Bus Trans", 40, "Bandung");
        Transportasi kereta = new Kereta("Kereta Cepat", 60, "Surabaya");
        Transportasi pesawat = new Pesawat("Pesawat Air", 120, "Medan");
        Transportasi[] transportasiArray = {bus, kereta, pesawat};
        for (Transportasi t : transportasiArray) {
            System.out.println(t.getNama() + " ke " + t.getTujuan() + " - Harga tiket (default): " + t.hitungHargaTiket());
            String kelasLayanan = "Ekonomi"; 
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