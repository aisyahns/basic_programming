public class Prime {

    private static boolean primeNumber(int n){
        boolean prime = true;

        for (int i = 2; i <= n / 2; i++){
            if (n % i == 0){
                prime = false;
                break; // kita mau berhentiin si for
            }
        }

        return prime;
//        int counterFaktorBilangan = 0;
//
//        for (int i = 1; i <= n; i++){
//            if (n % i == 0){
//                counterFaktorBilangan = counterFaktorBilangan + 1;
//            }
//        }
//
//        if (counterFaktorBilangan > 2){
//            prime = false;
//        } else {
//            prime = true;
//        }
//        return prime;
    }

    private static String vendingMachine(int uang, int row, int column){
        return "nama minuman";
    }

    public static void main(String[] args) {
        int bilangan = 8;

//        boolean prime = true;
//
//        for (int i = 2; i <= bilangan / 2; i++){
//            i = 4;
//            if (bilangan % i == 0){
//                prime = false;
//                break; // kita mau berhentiin si for
//            }
//        }
//
//        bilangan = 10;
//
//        for (int i = 2; i <= bilangan / 2; i++){
//            i = 4;
//            if (bilangan % i == 0){
//                prime = false;
//                break; // kita mau berhentiin si for
//            }
//        }
//
//        bilangan = 20;
//
//        for (int i = 2; i <= bilangan / 2; i++){
//            i = 4;
//            if (bilangan % i == 0){
//                prime = false;
//                break; // kita mau berhentiin si for
//            }
//        }
//
//        bilangan = 13;
//
//        for (int i = 2; i <= bilangan / 2; i++){
//            i = 4;
//            if (bilangan % i == 0){
//                prime = false;
//                break; // kita mau berhentiin si for
//            }
//        }


        System.out.println(primeNumber(bilangan)); //false
        System.out.println(primeNumber(10)); //false
        System.out.println(primeNumber(20)); //false
        System.out.println(primeNumber(13)); //true

//        System.out.println(vendingMachine(5000, 2, 5));

    }
}
