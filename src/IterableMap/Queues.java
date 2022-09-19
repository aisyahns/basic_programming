package IterableMap;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queues {

    public static void main(String[] args) {
        Queue<String> nama = new PriorityQueue<>();
        nama.add("A");
        nama.add("B");
        nama.add("C");
        nama.add("D");
        nama.add("E");
        System.out.println(nama.poll()); //akan mengeluarkan value pada index pertama -> FIFO (First In First Out)
    }

}
