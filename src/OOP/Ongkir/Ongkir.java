package OOP.Ongkir;

public class Ongkir extends Dimensi {

    public double berat;

    public int getHarga(){
        if ((dimensi() <= 50) && (Math.floor(berat) <= 1)){
            return 5000;
        } else {
            return 10000;
        }
    }

}
