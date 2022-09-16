package IterableMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Coba1 {

    public static void main(String[] args) {
//        Iterable<String> names = List.of("alterra", "academy"); // suatu variabel bernama names yang dia itu tipenya adalah Iterable tapi dia dibentuk dari class List
//        //<> si kotak bernama names itu akan diisi oleh tipe data String
//        //Iterable<Integer> -> kotak2 itu akan diisi oleh tipe data Integer
//        for (String nama : names){ //pemanggilan value dari si kotak kosong itu
//            //String nama kita membuat variable yang bertipe String dengan nama `nama`
//            //variable nama ini akan diisi oleh value yang didapat ketika ngeiterate value dari setiap kotaknya
//            //for pertama kali akan ambil value kotak names dengan index pertama / 0 (nama = "alterra")
//            System.out.println(nama); //akan melakukan block ini
//            //for kedua nama = "academy"
//            //melakukan block di dalam for
//            //ketika dicek untuk for yg ketiga, udah engga ada kotak selanjutnya yg berisi value dan punya variabel yg sama
//            //selesai untuk for yg ketiga
//        }

        ArrayList<Integer> nilai = new ArrayList<>();
        nilai.add(90);
        nilai.add(10);
        nilai.add(12);
        nilai.add(2,50);
        System.out.println(nilai.get(2));
        System.out.println(nilai.get(3));

        Stack<String> stack1 = new Stack<>();
        stack1.push("10");
        stack1.push("14");
        stack1.push("19"); //index = 2
        System.out.println(stack1.pop()); //buat ngambil value yg paling belakang atau yg paling terakhir ditambah

//        Queue<String> queue1 = new Queue<>();

    }

}
