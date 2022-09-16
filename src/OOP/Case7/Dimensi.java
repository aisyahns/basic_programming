package OOP.Case7;

public class Dimensi {

    private int panjang, berat, tinggi, lebar;

    public void setDimensi(int panjang, int lebar, int tinggi, int berat){
        this.panjang = panjang;
        this.berat = berat;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public int getTinggi() {
        return tinggi;
    }

    public int getPanjang() {
        return panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public int getBerat() {
        return berat;
    }

    public int getDimensi(){
        return panjang * lebar * tinggi;
    }
}
