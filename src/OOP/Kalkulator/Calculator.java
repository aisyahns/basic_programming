package OOP.Kalkulator;

public class Calculator {

    public static void main(String[] args) {
        Penjumlahan p1 = new Penjumlahan();
        p1.a = 10;
        p1.b = 20;
        System.out.println(p1.result());

        Perkalian p2 = new Perkalian();
        p2.a = 10;
        p2.b = 20;
        System.out.println(p2.result());

        int[] arr = new int[10]; //akan butuh kotak berapa sih untuk menyimpan data2 beruntun
        int[] arr2 = {1, 2, 3, 5};
    }



}
