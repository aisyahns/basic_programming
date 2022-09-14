package OOP.Case3;

public class Runner {

    public static void main(String[] args) {

        MotorMoge motorMoge = new MotorMoge();
        MotorMatic motorMatic = new MotorMatic();
        Motor motor = new Motor();

        motorMoge.suara();
        motorMoge.rem();

        motorMatic.suara();
        motorMatic.rem();

        motor.gas();
        motor.rem();
    }
}
