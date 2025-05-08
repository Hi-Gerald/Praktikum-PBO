class Kendaraan {
    String merk = "Toyota";

    Kendaraan (){
        System.out.println("Ini Constructor Parent");
    }
    void jalan(){
        System.out.println("Kendaraan sedang berjalan");
    }
}

class Mobil extends Kendaraan{
    String merk = "BMW";

    Mobil(){
        super();
        System.out.println("Ini Constructor Child");
    }
    void klakson (String merk){
        System.err.println("Mobil " + super.merk + "Klakson");
    }
    void printInfo () {
        System.out.println("merk mobil child: " + merk);
        System.out.println("merk mobil parent: " + super.merk);
        jalan();
    }
}

public class Main {
    public static void main (String[] args){
        Mobil jazz = new Mobil();
        // jazz.jalan();
        jazz.printInfo();
        jazz.klakson("BMW");
        System.out.println(jazz.merk);
    }
}