class Orang{
    Orang (){
        System.out.println("Orang Dibuat");
    }
}

class Dosen extends Orang{
    Dosen(){
        super();
        System.out.println("Dosen Dibuat");
    }
}

class Nomor2 {
    public static void main (String[] args){
        Dosen pak = new Dosen();
    }
}