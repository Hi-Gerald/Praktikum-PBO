package arraylist;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        String[] hari = new String[7]; //deklarasi array biasa di java

        hari[0] = "Senin";
        hari[1] = "Selasa";
        hari[2] = "Rabu";
        hari[3] = "Kamis";
        hari[4] = "Jum'at";
        hari[5] = "Sabtu";
        hari[6] = "Ahad";

        System.out.println(hari[2]);

        for (String h : hari){
            System.out.println(h);
        }

        System.out.println("============================");

        ArrayList<String> days = new ArrayList<>();
        days.add("Senin");
        days.add("Selasa");
        days.add("Rabu");
        days.add("Kamis");
        days.add("Jum'at");
        days.add("Sabtu");
        days.add("Ahad");

        System.out.println(days.get(0));

        days.set(6, "Minggu");
        System.out.println(days.get(6));

        days.remove(5);
        System.out.println(days.get(4));

        System.out.println("============================");

        for (String d : days){
            System.out.println("Hari: " + d);
        }

    }
    
}