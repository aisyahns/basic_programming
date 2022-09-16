package OOP.Case4;

public class Persegi {

    public Persegi(int sisi){
        this.sisi = sisi;
    }

    private int sisi;

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi){
        this.sisi = sisi;
    }

    public int luas(){
        return sisi * sisi;
    }

    public int keliling(){
        return 4 * sisi;
    }

    public void displayName(){
        System.out.print("Persegi : ");
    }
}
