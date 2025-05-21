import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class GamePetualangan {
    // Penyimpanan data pengguna (dalam memori)
    private static final HashMap<String, HashMap<String, String>> pengguna = new HashMap<>();
    private static final HashMap<String, Object> dataPemain = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

    public static void main(String[] args) {
        // Inisialisasi data pemain
        dataPemain.put("namaPengguna", "");
        dataPemain.put("peran", "");
        dataPemain.put("darah", 100.0);
        dataPemain.put("mana", 100.0);
        dataPemain.put("level", 1.0);
        HashMap<String, Integer> ransel = new HashMap<>();
        ransel.put("ramuan", 3);
        ransel.put("makanan", 0);
        ransel.put("harta", 0);
        dataPemain.put("ransel", ransel);
        dataPemain.put("slotRanselMaks", 10);

        System.out.println("Selamat datang di Game Petualangan!");
        menuUtama();
    }

    private static void bersihkanLayar() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    private static boolean registrasi() {
        bersihkanLayar();
        System.out.println("=== Daftar ===");
        System.out.print("Masukkan nama pengguna: ");
        String namaPengguna = scanner.nextLine();
        if (pengguna.containsKey(namaPengguna)) {
            System.out.println("Nama pengguna sudah ada!");
            return false;
        }
        System.out.print("Masukkan kata sandi: ");
        String kataSandi = scanner.nextLine();
        System.out.println("Pilih peran Anda:");
        System.out.println("1. Penyihir");
        System.out.println("2. Pejuang");
        System.out.print("Pilihan Anda: ");
        String pilihanPeran = scanner.nextLine();
        String peran = pilihanPeran.equals("1") ? "Penyihir" : pilihanPeran.equals("2") ? "Pejuang" : "Pejuang";
        HashMap<String, String> data = new HashMap<>();
        data.put("kataSandi", kataSandi);
        data.put("peran", peran);
        pengguna.put(namaPengguna, data);
        System.out.println("Pendaftaran berhasil!");
        System.out.println("Tekan Enter untuk melanjutkan...");
        scanner.nextLine();
        return true;
    }

    private static boolean login() {
        bersihkanLayar();
        System.out.println("=== Masuk ===");
        System.out.print("Masukkan nama pengguna: ");
        String namaPengguna = scanner.nextLine();
        System.out.print("Masukkan kata sandi: ");
        String kataSandi = scanner.nextLine();
        if (pengguna.containsKey(namaPengguna) && pengguna.get(namaPengguna).get("kataSandi").equals(kataSandi)) {
            dataPemain.put("namaPengguna", namaPengguna);
            dataPemain.put("peran", pengguna.get(namaPengguna).get("peran"));
            System.out.println("Masuk berhasil!");
            System.out.println("Tekan Enter untuk melanjutkan...");
            scanner.nextLine();
            return true;
        } else {
            System.out.println("Nama pengguna atau kata sandi salah!");
            System.out.println("Tekan Enter untuk melanjutkan...");
            scanner.nextLine();
            return false;
        }
    }

    private static boolean bukaRansel() {
        bersihkanLayar();
        System.out.println("**** Informasi Data ****");
        System.out.println("Darah = " + dataPemain.get("darah"));
        System.out.println("Mana = " + dataPemain.get("mana"));
        System.out.println("Level = " + dataPemain.get("level"));
        System.out.println("\nItem di Ransel:");
        HashMap<String, Integer> ransel = (HashMap<String, Integer>) dataPemain.get("ransel");
        for (String item : ransel.keySet()) {
            System.out.println(item.substring(0, 1).toUpperCase() + item.substring(1) + " = " + ransel.get(item));
        }
        int slotTerpakai = ransel.values().stream().mapToInt(Integer::intValue).sum();
        int slotKosong = (int) dataPemain.get("slotRanselMaks") - slotTerpakai;
        for (int i = 0; i < slotKosong; i++) {
            System.out.println("Slot " + (i + 1) + ": kosong");
        }
        System.out.print("\nKembali ke permainan (ya/tidak)? ");
        return scanner.nextLine().toLowerCase().equals("ya");
    }

    private static void gunakanRamuan() {
        bersihkanLayar();
        HashMap<String, Integer> ransel = (HashMap<String, Integer>) dataPemain.get("ransel");
        if (ransel.get("ramuan") > 0) {
            ransel.put("ramuan", ransel.get("ramuan") - 1);
            dataPemain.put("darah", (double) dataPemain.get("darah") + 50.0);
            dataPemain.put("mana", (double) dataPemain.get("mana") + 10.0);
            System.out.println("Ramuan digunakan dengan sukses!");
            System.out.println("Darah Anda: " + dataPemain.get("darah"));
            System.out.println("Mana Anda: " + dataPemain.get("mana"));
            System.out.println("Level Anda: " + dataPemain.get("level"));
        } else {
            System.out.println("Tidak ada ramuan yang tersedia!");
        }
        System.out.println("Tekan Enter untuk melanjutkan...");
        scanner.nextLine();
    }

    private static void mulaiPetualangan() {
        String[] arah = {"1. Maju", "2. Bergerak ke kanan", "3. Bergerak ke kiri", "4. Keluar dari Permainan"};
        while (true) {
            bersihkanLayar();
            System.out.println("Darah Anda: " + dataPemain.get("darah"));
            System.out.println("Mana Anda: " + dataPemain.get("mana"));
            System.out.println("Level Anda: " + dataPemain.get("level") + "\n");
            for (String dir : arah) {
                System.out.println(dir);
            }
            System.out.print("\nMasukkan pilihan Anda: ");
            String pilihan = scanner.nextLine();
            if (pilihan.equals("4")) {
                break;
            }
            if (pilihan.equals("1") || pilihan.equals("2") || pilihan.equals("3")) {
                String[] peristiwa = {"item", "musuh", "harta"};
                int[] bobot = {40, 40, 20};
                String peristiwaTerpilih = peristiwa[random.nextInt(peristiwa.length)];
                if (peristiwaTerpilih.equals("item")) {
                    String itemDitemukan = random.nextBoolean() ? "ramuan" : "makanan";
                    HashMap<String, Integer> ransel = (HashMap<String, Integer>) dataPemain.get("ransel");
                    ransel.put(itemDitemukan, ransel.get(itemDitemukan) + 1);
                    System.out.println("Anda menemukan " + itemDitemukan + "!");
                } else if (peristiwaTerpilih.equals("musuh")) {
                    HashMap<String, Object> musuh = new HashMap<>();
                    musuh.put("nama", random.nextBoolean() ? "Monster Bayangan" : "Perompak Goblin");
                    musuh.put("darah", 30.0 + random.nextDouble() * 20.0);
                    musuh.put("mana", 10.0 + random.nextDouble() * 20.0);
                    musuh.put("kekuatanSerang", 5.0 + random.nextDouble() * 10.0);
                    bertarung(musuh);
                } else {
                    HashMap<String, Integer> ransel = (HashMap<String, Integer>) dataPemain.get("ransel");
                    ransel.put("harta", ransel.get("harta") + 1);
                    System.out.println("Anda menemukan Harta!");
                }
                System.out.println("Tekan Enter untuk melanjutkan...");
                scanner.nextLine();
            } else {
                System.out.println("Pilihan tidak valid!");
                System.out.println("Tekan Enter untuk melanjutkan...");
                scanner.nextLine();
            }
        }
    }

    private static void bertarung(HashMap<String, Object> musuh) {
        while ((Double) musuh.get("darah") > 0 && (Double) dataPemain.get("darah") > 0) {
            bersihkanLayar();
            System.out.println("Musuh: " + musuh.get("nama"));
            System.out.println("Darah Musuh: " + musuh.get("darah"));
            System.out.println("Mana Musuh: " + musuh.get("mana"));
            System.out.println("Kekuatan Serang Musuh: " + musuh.get("kekuatanSerang"));
            System.out.println("Darah Anda: " + dataPemain.get("darah") + "\n");
            System.out.println("1. Serang");
            System.out.println("2. Lari");
            System.out.print("\nMasukkan pilihan Anda: ");
            String pilihan = scanner.nextLine();
            if (pilihan.equals("1")) {
                double kerusakanKeMusuh = dataPemain.get("peran").equals("Penyihir") ? 25.0 : 20.0;
                double kerusakanKePemain = (Double) musuh.get("kekuatanSerang");
                musuh.put("darah", (Double) musuh.get("darah") - kerusakanKeMusuh);
                dataPemain.put("darah", (Double) dataPemain.get("darah") - kerusakanKePemain);
                System.out.println("Anda memukul musuh sebesar " + kerusakanKeMusuh + " kerusakan");
                if ((Double) musuh.get("darah") > 0) {
                    System.out.println("Musuh memukul Anda sebesar " + kerusakanKePemain + " kerusakan");
                } else {
                    System.out.println("Anda mengalahkan musuh!");
                    dataPemain.put("level", (Double) dataPemain.get("level") + 1);
                    dataPemain.put("darah", (Double) dataPemain.get("darah") + 50);
                    dataPemain.put("mana", (Double) dataPemain.get("mana") + 30);
                    System.out.println("Naik Level!");
                    break;
                }
            } else if (pilihan.equals("2")) {
                if (random.nextDouble() < 0.7) {
                    System.out.println("Anda berhasil melarikan diri!");
                    break;
                } else {
                    System.out.println("Gagal melarikan diri!");
                    dataPemain.put("darah", (Double) dataPemain.get("darah") - (Double) musuh.get("kekuatanSerang"));
                    System.out.println("Musuh memukul Anda sebesar " + musuh.get("kekuatanSerang") + " kerusakan");
                }
            } else {
                System.out.println("Pilihan tidak valid!");
            }
            System.out.println("Tekan Enter untuk melanjutkan...");
            scanner.nextLine();
        }
        if ((Double) dataPemain.get("darah") <= 0) {
            System.out.println("Permainan Berakhir! Anda telah dikalahkan.");
            System.exit(0);
        }
    }

    private static void menuUtama() {
        while (true) {
            bersihkanLayar();
            System.out.println("1. Masuk");
            System.out.println("2. Daftar");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan Anda: ");
            String pilihan = scanner.nextLine();
            if (pilihan.equals("1")) {
                if (login()) {
                    menuPermainan();
                }
            } else if (pilihan.equals("2")) {
                registrasi();
            } else if (pilihan.equals("3")) {
                System.out.println("Selamat tinggal!");
                break;
            } else {
                System.out.println("Pilihan tidak valid!");
                System.out.println("Tekan Enter untuk melanjutkan...");
                scanner.nextLine();
            }
        }
    }

    private static void menuPermainan() {
        while (true) {
            bersihkanLayar();
            System.out.println("1. Buka Ransel");
            System.out.println("2. Mulai Petualangan");
            System.out.println("3. Gunakan Ramuan");
            System.out.println("4. Keluar");
            System.out.print("Masukkan pilihan Anda: ");
            String pilihan = scanner.nextLine();
            if (pilihan.equals("1")) {
                if (!bukaRansel()) {
                    break;
                }
            } else if (pilihan.equals("2")) {
                mulaiPetualangan();
            } else if (pilihan.equals("3")) {
                gunakanRamuan();
            } else if (pilihan.equals("4")) {
                break;
            } else {
                System.out.println("Pilihan tidak valid!");
                System.out.println("Tekan Enter untuk melanjutkan...");
                scanner.nextLine();
            }
        }
    }
} 