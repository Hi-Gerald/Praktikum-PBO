class Mesin {
    void nyalakan() {
        System.out.println("Mesin menyala");
    }
}

class Mobil {
    Mesin mesin = new Mesin(); // Mobil HAS-A Mesin

    void hidupkanMobil() {
        mesin.nyalakan();
    }
}

class HASA {
    public static void main(String[] args) {
        Mobil mobil = new Mobil();
        mobil.hidupkanMobil();
    }
}