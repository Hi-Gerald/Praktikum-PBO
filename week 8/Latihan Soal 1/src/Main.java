class Hewan{
    String suara = "Suara Hewan";
}

class Kucing extends Hewan{
    String suara = "Meong";
    public void suara(){
        System.err.println("Ini suara Kucing " + suara);
        System.err.println("Ini suara parent " + super.suara);
    }
}


public class Main {
    public static void main(String[] args) throws Exception {
        Kucing cing = new Kucing();
        cing.suara();
    }
}
