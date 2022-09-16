package OOP.Case5;

public class Tabung {

    private int jari, tinggi;

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public void setJari(int jari) {
        this.jari = jari;
    }

    public int volume(){
        return (int) Math.ceil((Math.PI * jari * jari * tinggi));
    }

    public String getName(){
        return "Tabung";
    }
}
