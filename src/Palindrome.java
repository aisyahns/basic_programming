public class Palindrome {

    private static boolean palindrome(String kata){
        String kataYgDibalik = "";

        for (int i = kata.length(); i >= 1; i--){
            kataYgDibalik = kataYgDibalik + kata.charAt(i - 1);
        }

//        System.out.println(kataYgDibalik);

        if (kataYgDibalik.equals(kata)){ //civic sama civic
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        System.out.println(palindrome("civic"));
        System.out.println(palindrome("kasur"));

    }
}
