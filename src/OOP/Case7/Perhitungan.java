package OOP.Case7;

public class Perhitungan {

    public static void main(String[] args) {
        Ongkir ongkir = new Ongkir();
        Ongkir ongkir1 = new Ongkir();

        ongkir.setDimensi(5, 2, 4, 1);
        System.out.println(ongkir.display() + ongkir.getHarga());

        ongkir1.setDimensi(10, 10, 2, 1);
        System.out.println(ongkir.display() + ongkir1.getHarga());
    }
}
