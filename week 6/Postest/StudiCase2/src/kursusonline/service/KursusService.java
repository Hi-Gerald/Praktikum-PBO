package kursusonline.service;

import java.util.ArrayList;
import kursusonline.model.Kursus;
import kursusonline.model.Peserta;

public class KursusService {
    private ArrayList<Kursus> daftarKursus;

    public KursusService() {
        daftarKursus = new ArrayList<>();
    }

    public void tambahKursus(Kursus kursus) {
        daftarKursus.add(kursus);
    }

    public void tampilkanSemuaKursus() {
        for (Kursus kursus : daftarKursus) {
            kursus.tampilkanDetailKursus();
        }
    }

    public Kursus cariKursusBerdasarkanKode(String kode) {
        for (Kursus kursus : daftarKursus) {
            if (kursus.getKode().equals(kode)) {
                return kursus;
            }
        }
        return null;
    }

    public void tambahPesertaKeKursus(String kodeKursus, Peserta peserta) {
        Kursus kursus = cariKursusBerdasarkanKode(kodeKursus);
        if (kursus != null) {
            kursus.tambahPeserta(peserta);
        }
    }
}