class Produk{
    int harga = 10000;
}

class Buku extends Produk{
    int harga = 25000;
    void bandingkanHarga(){
        System.out.println("Ini Harga Produk: " + super.harga);
        System.out.println("Ini Harga Buku: " + harga);
    }
}

public class Nomor3 {
    public static void main(String[] args){
        Buku book = new Buku();
        book.bandingkanHarga();
    }
}
