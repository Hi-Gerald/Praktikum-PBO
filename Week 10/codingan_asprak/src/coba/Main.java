package coba;

import javax.xml.namespace.QName;

public class Main {
    public static void main(String[] args) {
       Smartphone hp = new Smartphone();
       hp.dihidupkan();
       hp.cekBaterai();
       Gadget.info();
    }
}
