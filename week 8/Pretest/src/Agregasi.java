class Dosen {
    String nama;
    Dosen(String nama) {
        this.nama = nama;
    }
}

class Universitas {
    Dosen dosen;
    Universitas(Dosen dosen) {
        this.dosen = dosen;
    }
}

public class Agregasi {
    public static void main(String[] args) {
        Dosen dosen = new Dosen("Budi");
        Universitas universitas = new Universitas(dosen);
    }
}
