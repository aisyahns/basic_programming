package OOP.Case3;

public class MotorMoge extends Motor {

    void suara(){
        System.out.println("roar roar roar");
    }

    void setLisensi(String l){
        lisensi = l;
    }

    String getLisensi(){
        return lisensi;
    }

}
