class Hewan {
    String nama_super = "antoniooooo";
    
    // Hewan(String nama) {
    //     this.nama = nama;
    // }
    
    void suara() {
        System.out.println("Hewan bersuara");
    }
}

class Kucing extends Hewan {
    String nama;
    Kucing(String nama) {
        this.nama = nama; //memberikan nama objek kucing
        System.out.println("Nama kucing: " + super.nama_super); // Memanggil variabel nama dari superclass
    }
    
    @Override
    void suara() {
        super.suara(); // Memanggil metode suara dari superclass
        System.out.println("Kucing: Meow Rawrwwww!");
    }
}

public class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Ucok");
        kucing.suara();
    }
}