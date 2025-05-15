class HealthRecord{
    String nomorRekamMedis;
    String tanggalPembuatanRekamanMedis;

    HealthRecord(String nomorRekamMedis, String tanggalPembuatanRekamanMedis) {
        this.nomorRekamMedis = nomorRekamMedis;
        this.tanggalPembuatanRekamanMedis = tanggalPembuatanRekamanMedis;
    }
    
    void tampilkanInfo(){
        System.out.println("Nomor Rekam Medis: " + nomorRekamMedis);
        System.out.println("Tanggal Pembuatan Rekam Medis: " + tanggalPembuatanRekamanMedis);
    }
    
}

class  Owner{
    String name;
    Dog peliharaananj = new Dog();
    Cat peliharaanmeow = new Cat();
    Owner(String name){
        this.name = name;
    }
    void tampilkanInfo(){
        System.out.println("Nama Pemilik: " + name);
    }
}

class Animal {
    void makeSound(){
        System.out.println("Suara Hewan ");
    }
}

class Dog extends Animal{
    HealthRecord rekamMedis;
    public Dog() {
    }
    void dogMakeSound(){
        makeSound();
        System.out.println("Guk Guk!");
    }
}

class Cat extends Animal{
    HealthRecord rekamMedis;
    void catMakeSound(){
        makeSound();
        System.out.println("Meong!");
    }
}
public class Main {
    public static void main(String[] args) {
        Owner owner = new Owner("Gerald Eberhard");
        Dog anjing1 = new Dog ();
        HealthRecord rekamMedis1 = new HealthRecord("123456", "01-01-2023");
        anjing1.rekamMedis = rekamMedis1;
        Cat kucing1 = new Cat();
        anjing1.rekamMedis = rekamMedis1;
        HealthRecord rekamMedis2 = new HealthRecord("123456", "01-01-2023");
        owner.peliharaananj = anjing1;
        owner.peliharaananj.rekamMedis = rekamMedis1;
        owner.peliharaanmeow = kucing1;
        owner.peliharaanmeow.rekamMedis = rekamMedis2;
        if (owner.peliharaananj instanceof Dog && owner.peliharaanmeow instanceof Cat){ {
            System.out.println("Hewan yang dimiliki oleh Pemilik adalah Anjing dan Kucing.");
            owner.tampilkanInfo();
            owner.peliharaananj.dogMakeSound();
            owner.peliharaanmeow.catMakeSound();
            owner.peliharaananj.rekamMedis.tampilkanInfo();;
            owner.peliharaanmeow.rekamMedis.tampilkanInfo();
            }

        }        
    }
}
