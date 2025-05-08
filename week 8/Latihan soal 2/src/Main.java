class Kendaraan{
    Kendaraan () {
        System.err.println("Kendaraan dipanggil");
    }
}

class Mobil extends Kendaraan{
    Mobil(){
        super();
        System.err.println("Konstruktor kendaraan dipanggil dengan konstruktor mobil");
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        Mobil oto = new Mobil();
    }
}
