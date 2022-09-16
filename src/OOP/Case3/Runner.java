package OOP.Case3;

import java.util.ArrayList;

public class Runner {

    public static void main(String[] args) {

        MotorMoge motorMoge = new MotorMoge();
        MotorMatic motorMatic = new MotorMatic();

        Motor motor = new MotorMatic(); //Motor matic ini anaknya motor
        //aku bisa buat sebuah obyek parentnya (Motor) dengan ngeinitiate dari kelas anaknya)

        motorMoge.suara();
        motorMoge.rem();

        motorMatic.suara();
        motorMatic.rem();
    }
}
