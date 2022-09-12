public class UbahHuruf {

    public static void main(String[] args) {

        String kamus = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        String kata = "SEPULSA OKE";
        String kataBaru = "";

        for (int i = 0; i < kata.length(); i++){
//            System.out.println(kata.charAt(i));
            if (kata.charAt(i) != ' '){
                int charBerapa = kamus.indexOf(kata.charAt(i)); //k -> charBerapa = 10
//            System.out.println(charBerapa);

                int indexHasil = (charBerapa + 10) % 26; // charHasil = 20
//            System.out.println(indexHasil);

                Character charHasil = kamus.charAt(indexHasil);
//            System.out.println(charHasil);

                kataBaru = kataBaru + charHasil;
            } else {
                kataBaru = kataBaru + ' ';
            }


        }
        System.out.println(kataBaru);


    }

}
