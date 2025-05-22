class Animal{
    public void suara(){
        System.out.println("Suara Hewan");
    }
    public void makan(String lauk){
        System.out.println("Hewan makan "+lauk);
    }
}

class Dog extends Animal{
    @Override
    public void suara(){
        System.out.println("Guk Guk");
    }

    public void makan(String lauk, String minuman){
        System.out.println("Makan "+lauk+" dan minum "+minuman);
    }
}

public class App {
    public static void main(String[] args)  {
        Animal a=new Animal();
        a.suara();
        // a.makan();
        Animal d=new Dog(); //polymorphism
        d.suara();  
        d.makan("daging");
        
        Dog anjing=new Dog();
        anjing.makan("daging2", "air");
    }
}