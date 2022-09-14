package Basic;

public class duaA {

    public static void main(String[] args) {

        int studentScore = 80;

        if(studentScore >= 80 && studentScore <=100){
            System.out.println("NILAI = A");
        }
        else if(studentScore >= 65 && studentScore <=79){
            System.out.println("NILAI = B+");
        }
        else if(studentScore >= 50 && studentScore <=64){
            System.out.println("NILAI = B");
        }
        else if(studentScore >= 35 && studentScore <=49){
            System.out.println("NILAI = C");
        }
        else if(studentScore >= 0 && studentScore <=34){
            System.out.println("NILAI = D");
        }
        else {
            System.out.println ("invalid");
        }


    }
}