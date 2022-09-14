package OOP.Case2;

public class Manusia {

    private boolean berfikir = true; //Attribute
    private boolean bernafas = true;
    private int kaki = 2;
    private int tangan = 2;
    private int mata = 2;
    private String name = "aisyah";

    public void perkenalan(){
        System.out.println("hai nama aku " + name);
    }

    public int umur(int tahunLahir){
        return (2022 - tahunLahir);
    }

    public void setBerfikir(boolean berfikir) {
        this.berfikir = berfikir;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return ("halo nama aku " + name);
//        return name;
    }

    public int getKaki() {
        return kaki;
    } //Function yang mana akan mengembalikan value attribute yg dimiliki oleh class itu

    public int getMata() {
        return mata;
    }

    public int getTangan() {
        return tangan;
    }

    public boolean getBerfikir(){
        return berfikir;
    }

    public boolean getBernafas(){
        return bernafas;
    }
}
