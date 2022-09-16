package OOP.Bangunan;

public class Perhitungan {

    public static void main(String[] args) {
        Persegi p1 = new Persegi();
        p1.sisi = 4;
        System.out.println(p1.keliling());
        System.out.println(p1.luas());

        PersegiPanjang pp1 = new PersegiPanjang();
        pp1.panjang = 10;
        pp1.lebar = 20;
        System.out.println(pp1.keliling());
        System.out.println(pp1.luas());

        Segitiga s1 = new Segitiga();
        s1.alas = 7;
        s1.tinggi = 10;
        System.out.println(s1.keliling());
        System.out.println(s1.luas());

//        Persegi p2 = new Persegi();
//        p2.sisi = 10;
//        System.out.println(p2.keliling());
//        System.out.println(p2.luas());

    }
}
