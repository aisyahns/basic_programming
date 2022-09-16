package OOP.Case7;

public class Ongkir extends Dimensi {

    public int getHarga(){
        if ((getDimensi() <= 50) && getBerat() <= 1){
            return 5000;
        } else {
            return 10000;
        }
    }

    public String display(){
        return "Harga: Rp ";
    }
}
