package Basic;

public class DrawXYZ {

    public static void main(String[] args) {

        int counter = 1;
        int n = 5;

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++) {
                if (counter % 3 == 0){
                    System.out.print("X ");
                } else if (counter % 2 == 0) {
                    System.out.print("Z ");
                } else {
                    System.out.print("Y ");
                }
                counter = counter + 1;
            }
            System.out.println();
        }

    }
}
