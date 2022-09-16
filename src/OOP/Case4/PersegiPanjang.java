package OOP.Case4;

public class PersegiPanjang {

    public PersegiPanjang(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    private int panjang, lebar;

    public int getLebar() {
        return lebar;
    }

    public int getPanjang() {
        return panjang;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int luas(){
        return panjang * lebar;
    }

    public int keliling(){
        return 2 * panjang + 2 * lebar;
    }

    public void displayName(){
        System.out.print("Persegi Panjang : ");
    }
}
