package Basic;

public class TabelPerkalian {
    public static void main(String[] args) {

        int bilangan = 4;
        for (int i = 1; i <= bilangan; i++){ //row
            for (int j = 1; j <= bilangan; j++){ //columns
                System.out.print(i * j + " ");
            } // selesai
            System.out.println();
        }

    }
}
