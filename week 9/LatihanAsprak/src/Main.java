//binding
class Animal{
    static void suara(){
        System.out.println("Suara Hewan");
    }

    void makan(){
        System.out.println("Hewan makan");
    }
}

class Dog extends Animal{
    @Override
    void makan(){
        System.out.println("Anjing makan daging");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a=new Animal();
        a.suara();
        Animal.suara();
        a.makan();
        // Animal.makan();

        Animal b=new Dog();
        b.makan();
    }
}