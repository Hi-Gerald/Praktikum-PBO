package interfacee;

public abstract class Pemilik {
    String nama;

    Pemilik (String Nama){
        this.nama= nama;
    }
    
    public abstract void pemilikKendaraan(String namaPemilik);
    
}
