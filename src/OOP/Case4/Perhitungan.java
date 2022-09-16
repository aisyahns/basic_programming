package OOP.Case4;

public class Perhitungan {

    public static void main(String[] args) {
        Persegi p1 = new Persegi(4);
//        p1.setSisi(4);

        PersegiPanjang pp1 = new PersegiPanjang(7, 8);
//        pp1.setPanjang(7);
//        pp1.setLebar(8);

        Segitiga s1 = new Segitiga(3, 4);
//        s1.setAlas(3);
//        s1.setTinggi(4);

        System.out.println("Luas");
        p1.displayName();
        System.out.println(p1.luas());
        s1.displayName();
        System.out.println(s1.luas());
        pp1.displayName();
        System.out.println(pp1.luas());
        System.out.println();

        System.out.println("Keliling");
        p1.displayName();
        System.out.println(p1.keliling());
        s1.displayName();
        System.out.println(s1.keliling());
        pp1.displayName();
        System.out.println(pp1.keliling());


    }
}
