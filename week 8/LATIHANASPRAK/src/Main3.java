class Animal {
    public void makan(){
        System.out.println("Aku Makan");
    }
}

class Dog extends Animal{
    public void soundAnjing(){
        System.out.println("guguk");
    }
}

class Pig extends Animal{
    public void soundBabi(){
        System.out.println("babi");
    }
}
public class Main3 {

    public static void main (String[] args){
        Dog dog1 = new Dog();
        dog1.makan();
        dog1.soundAnjing();
        Pig pig1 = new Pig();
        pig1.makan();
        pig1.soundBabi();
    }
}
