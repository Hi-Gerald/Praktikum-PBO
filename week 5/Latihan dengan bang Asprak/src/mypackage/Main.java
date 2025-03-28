package mypackage;

import enkapsulasi.Car;

public class Main {
    public static void main(String[] args) {
        MyClass.sayHello();

        System.out.println("============================");

        Car mycar = new Car();
        System.out.println(mycar.kapasitas);
        //System.out.println(mycar.merk);
        //System.out.println(mycar.jumlahBan);
        //System.out.println(mycar.pemilik);


    }
}