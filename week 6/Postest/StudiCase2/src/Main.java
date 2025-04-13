import kursusonline.model.*;
import kursusonline.service.KursusService;

public class Main {
    public static void main(String[] args) {
        //2 Instruktur
        Instruktur instruktur1 = new Instruktur("5551", "MR.Bean", "Opera Animation Programming");
        Instruktur instruktur2 = new Instruktur("6552", "Naruto Uzumaki", "Shuriken Rasengan Development Program");

        //2 Kursus
        Kursus kursus1 = new Kursus("CS1", "Opera Programming", instruktur1);
        Kursus kursus2 = new Kursus("CS2", "Shuriken Nin Nin Jutsu", instruktur2);

        //3 Peserta
        Peserta peserta1 = new Peserta("105223001", "Tingki", "Tingki@gmail.com", "08123456789");
        Peserta peserta2 = new Peserta("105223002", "Wingki", "Wingki@gmail.com", "08123456788");
        Peserta peserta3 = new Peserta("105223003", "Yanto", "Yanto@yahoo.com", "08123456787");

        //3 Materi
        Materi materi1 = new Materi("Pengenalan Dasar-dasar Opera", "Belajar tentang dasar-dasar Opera yang diajarkan langsung oleh MR.Bean", 60);
        Materi materi2 = new Materi("Pengenalan Dasar Shuriken", "Belajar tentang bagian-bagian shuriken", 90);
        Materi materi3 = new Materi("Operasi Ninja 101", "Belajar tentang bagaimana cara bertarung dan berlari serta bekerja sebagai seorang ninja", 45);

        KursusService service = new KursusService();
        service.tambahKursus(kursus1);
        service.tambahKursus(kursus2);

        kursus1.tambahMateri(materi1);
        kursus1.tambahMateri(materi2);
        kursus2.tambahMateri(materi3);

        service.tambahPesertaKeKursus("CS1", peserta1);
        service.tambahPesertaKeKursus("CS1", peserta1);//akan muncul notif bahwa peserta ini sudah terdaftar
        service.tambahPesertaKeKursus("CS2", peserta2);
        service.tambahPesertaKeKursus("CS1", peserta3);// akan muncul notif bahwa peserta ini emailnya salah 
        service.tambahPesertaKeKursus("CS2", peserta1);

        service.tampilkanSemuaKursus();
    }
}