package OOP.Case6;

public class Kalkulator {

    public static void main(String[] args) {
        Penjumlahan penjumlahan = new Penjumlahan();
        penjumlahan.setAB(3, 4);

        Perkalian perkalian = new Perkalian();
        perkalian.setAB(10,10);

        Pembagian pembagian = new Pembagian();
        pembagian.setAB(12, 3);

        Pengurangan pengurangan = new Pengurangan();
        pengurangan.setAB(15, 4);

        System.out.println(penjumlahan.getName() + " " + penjumlahan.result());
        System.out.println(pengurangan.getName() + " " + pengurangan.result());
        System.out.println(perkalian.getName() + " " + perkalian.result());
        System.out.println(pembagian.getName() + " " + pembagian.result());
    }
}
