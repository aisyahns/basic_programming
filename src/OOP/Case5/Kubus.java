package OOP.Case5;

public class Kubus {

    private int sisi;

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public int volume(){
        return sisi * sisi * sisi;
    }

    public String getName(){
        return "Kubus";
    }
}
