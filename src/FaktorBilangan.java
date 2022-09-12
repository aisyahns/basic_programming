import java.util.Scanner;

public class FaktorBilangan {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //Class / obyek yang namanya scanner

        int bilangan;
        System.out.print("Masukkan bilangan yang mau kamu cari:");
        bilangan = sc.nextInt(); //menggunakan method atau functional atau procedure dari class atau obyek itu

        for (int i = 1; i <= bilangan; i++) {
            if (bilangan % i == 0) {
                System.out.println(i);
            }
        }
    }
}
