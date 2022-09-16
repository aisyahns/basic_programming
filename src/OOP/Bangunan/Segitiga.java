package OOP.Bangunan;

public class Segitiga {

    public int alas, tinggi;

    public double luas(){
        return (0.5) * alas * tinggi;
    }

    public double keliling(){
        double sisiMiring = Math.sqrt((tinggi * tinggi) + (alas * alas));//akar dari alas(2) + tinggi(2)
        return (alas + tinggi + sisiMiring);
    }
}
