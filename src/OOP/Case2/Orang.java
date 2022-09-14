package OOP.Case2;

public class Orang {

    public static void main(String[] args) {
        Manusia manusia1 = new Manusia();
        Manusia manusia2 = new Manusia();
//        boolean berfikir = manusia1.berfikir; //cara akses attribute / method -> namaObjek.attribute / namaObjek.method
//        int kaki = manusia1.kaki;
//        int tangan = manusia1.tangan;

//        System.out.println(berfikir);
//        System.out.println(kaki);
//        System.out.println(tangan);

//        manusia1.setName("Aisyah");
//        manusia2.setName("Aldo");
//        manusia1.perkenalan();
//        manusia2.perkenalan();

//        System.out.println(manusia1.getName() + " " + manusia1.umur(1945));
//        System.out.println(manusia2.getName() + " " + manusia2.umur(1950));
        manusia1.getKaki();
        System.out.println(manusia1.getKaki());

//        manusia1.setBerfikir(false); //merah menandakan si attribute / method ini engga terdefine atau engga terdetect
//        System.out.println(manusia1.getBerfikir());
//        manusia2.setBerfikir(true);
//        System.out.println(manusia2.getBerfikir());
//        System.out.println(manusia1.getName() + " bisa bernafas? " + manusia1.getBernafas());
//
        Kucing kucing1 = new Kucing();
        kucing1.perkenalan();
//
//        System.out.println(kucing1.berfikir);
//        System.out.println(kucing1.kaki);
//        System.out.println(kucing1.tangan);

    }
}
