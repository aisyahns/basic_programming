package IterableMap;

import java.util.HashMap;

public class Person {

    public static void main(String[] args) {
        HashMap<String, String> aisyah = new HashMap<>();
        aisyah.put("nama_depan", "Aisyah");
        aisyah.put("nama_belakang", "Syahidah");
        aisyah.put("nama_tengah", "Nurulhaqi");

        System.out.println(aisyah);
        System.out.println(aisyah.get("nama_depan")); //get value berdasarkan keynya
        System.out.println(aisyah.containsKey("umur")); //ngecek apakah suatu key itu punya nilai yg dicari
        System.out.println(aisyah.containsValue("20")); //ngecek apakah suatu value itu punya nilai yg dicari
        System.out.println(aisyah.keySet()); //nilai2 dari keynya
        System.out.println(aisyah.entrySet()); //nilai2 keseluruhannya
        System.out.println(aisyah.values()); //nilai2 dari valuenya
    }
}
