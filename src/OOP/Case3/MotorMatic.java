package OOP.Case3;

public class MotorMatic extends Motor {

    void suara(){
        System.out.println("brum brum brum");
    }

    void setLisensi(String l){
        lisensi = l;
    }

    String getLisensi(){
        return lisensi;
    }
}
