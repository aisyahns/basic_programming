package OOP.Bangunan;

public class PersegiPanjang {

    public int panjang, lebar;

    public int keliling(){
        return (2 * panjang) + (2 * lebar);
    }

    public int luas(){
        return panjang * lebar;
    }

}
