package OOP.Case5;

public class Balok {

    private int panjang, lebar, tinggi;

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public int volume(){
        return panjang * lebar * tinggi;
    }

    public String getName(){
        return "Balok";
    }
}
