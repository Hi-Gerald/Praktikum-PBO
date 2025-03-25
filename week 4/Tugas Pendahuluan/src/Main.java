class Kalkulator {
    public int kurang(int a, int b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Kalkulator calc = new Kalkulator(); // Membuat object
        int hasil = calc.kurang(5, 3); // Dipanggil melalui object
        System.out.println(hasil); // Output: 6
    }
}