package OOP.Case1;

public class Process {

    public static void main(String[] args) {
        MotorGede mg = new MotorGede();
        MotorMatic mm = new MotorMatic();
        Motor motor = new Motor();
        Motor mmt = new MotorGede();

        mg.setName("MG 1");
        mm.setName("MM 1");
        motor.setName("MOTOR 1");
        mmt.setName("MATIC MOTOR");

        System.out.println(mg.getName());
        System.out.println(mm.getName());
        System.out.println(motor.getName());
        System.out.println(mmt.getName());
    }

}
