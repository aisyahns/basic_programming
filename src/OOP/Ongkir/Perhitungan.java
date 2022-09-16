package OOP.Ongkir;

public class Perhitungan {

    public static void main(String[] args) {
        Ongkir barang1 = new Ongkir();
        barang1.panjang = 10;
        barang1.lebar = 10;
        barang1.tinggi = 10;
        barang1.berat = 5;

        System.out.println(barang1.getHarga());

        Ongkir barang2 = new Ongkir();
        barang2.panjang = 1;
        barang2.lebar = 1;
        barang2.tinggi = 1;
        barang2.berat = 1;

        System.out.println(barang2.getHarga());
    }
}
