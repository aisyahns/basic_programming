package OOP.Case4;

public class Segitiga {

    public Segitiga(int alas, int tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }

    private int alas, tinggi;

    public int getAlas() {
        return alas;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public int luas(){
        return (int) (0.5 * alas * tinggi);
    }

    public int keliling(){
        double sisiMiring = Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
        return (int) (tinggi + sisiMiring + alas);
    }

    public void displayName(){
        System.out.print("Segitiga : ");
    }
}
