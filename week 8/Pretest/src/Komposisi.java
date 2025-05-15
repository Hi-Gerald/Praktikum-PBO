class Jantung {
    void detak() {
        System.out.println("Jantung berdetak...");
    }
}

class Manusia {
    private Jantung jantung;

    Manusia() {
        jantung = new Jantung(); // Komposisi
    }

    void hidup() {
        jantung.detak();
    }
}

class Komposisi {
    public static void main(String[] args) {
        Manusia manusia = new Manusia();
        manusia.hidup();
    }
} 