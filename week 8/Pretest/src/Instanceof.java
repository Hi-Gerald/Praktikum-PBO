class Hewan {}
class Kucing extends Hewan {}
class Benda {}

public class Instanceof {
    public static void main(String[] args) {
        Hewan h = new Kucing();
        System.out.println(h instanceof Kucing); // true
        System.out.println(h instanceof Hewan);  // true
    }
}
