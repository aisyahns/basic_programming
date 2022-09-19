package IterableMap;

import java.util.*;

public class Lists {

    public static void main(String[] args) {
        //String, Integer, Character, Boolean --> suatu class;
        //ArrayList<E> asalkan di dalemnya si diamond adalah suatu class
        ArrayList<Integer> angka = new ArrayList<>();
        List<Integer> umur = List.of(1, 2, 3, 4, 5, 7); //int[] umur = {1, 2, 3, 4, 5, 7}; //umur[2] = 3
        List<Integer> umur2 = new LinkedList<>();
        umur2.add(90); //0
        umur2.add(89); //1
        umur2.add(10); //2
        umur2.add(89); //3
        umur2.add(78); //4
        umur2.add(10); //5
//        System.out.println(umur2);
        Set<Integer> angka2 = Set.of(1, 2, 4, 5, 6, 7); //immutable collection atau kumpulan data yang engga bisa diubah2
        Set<Integer> angka3 = new HashSet<>();
        angka3.add(1);
        angka3.add(2);
        angka3.add(6);
        angka3.add(8);
        angka3.add(1);
        angka3.add(8);
        Object[] numArray = angka3.toArray();
        for (Object a : numArray){
            System.out.println(a);
        }
        //[1, 2, 6, 8].addAll[1 (ga ditambahin), 2 (ga ditambahin), 4 (tambahin), 5 (tambahin), 6 (x), 7 (tambahin)]
//        angka3.addAll(angka2); //addAll untuk set class dia akan melakukan pengecekan terhadap value2 yg ditambahin, apakah di collection yg mau ditambahin itu ada valuenya apa engga
//        System.out.println(angka2);
//        System.out.println(angka3); //isinya value2 yang unique
        var umurImmutable = Collections.unmodifiableList(umur);
        angka.add(0);
        angka.add(10);
        angka.add(20);
        angka.addAll(angka2); //akan nambahin serangkaian kotak di dalem kotak yg diinginkan
//        System.out.println(angka);

        angka.remove(0); //penghapusan kotak berdasarkan suatu index atau obyek / value di dalem kotak --> List
        angka3.remove(7); //penghapusan kotak berdasarkan suatu obyek / value di dalem kotak --> Set

        System.out.println(angka.contains(10));
        System.out.println(angka3.contains(7)); //akan balikin apakah suatu rangkaian kotak mengandung suatu value yg kita cari

        angka.get(2); //get by index cuma dimiliki sama List, sedangkan set engga punya by index
        System.out.println(umur.get(2));
        System.out.println(angka.contains(umur.get(2))); //angka.contains(3)

        LinkedList<String> nama = new LinkedList<>();
        nama.add("Aisyah");
        nama.add("Nurulhaqi");
        nama.add("Syahidah");

        nama.contains("Nurulhaqi");
    }

}
