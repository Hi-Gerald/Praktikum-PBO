package coba;
public interface Gadget {
    void dihidupkan();

    default void cekBaterai() {
        System.out.println("100%");
    }

    static void info(){
        System.out.println("ini adalah interface Gadget");
    }
}
