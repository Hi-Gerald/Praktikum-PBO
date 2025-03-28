

public class mahasiswa {
    //variabel instansce
    String nama= "Rudi";
    int umur = 20;
    
    //variabel static/kelas
    static String universitas = "Universitas Pertamina";
    public void tampilkanInfo() {
        // variabel lokal
        String nama = "Andi";
        System.out.println("Nama: " + nama);
    }
    public mahasiswa(){

    }
    public mahasiswa (String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public void sayHello(String nama){

    }

    public void sayHello(String nama, int umur){
        System.out.println("Nama : " + nama);
    }
}
